package com.example.e_tourism;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;


public class Http {
    private static final String BASE_URL = "https://www.googleapis.com/language/translate/v2?key=";
    private static final String KEY = "trnsl.1.1.20200506T050108Z.c7f4bc9ad3bc4cdc.2d7ddfc2951ba31bb7bc08340865b8eb618e24e6";

    private static AsyncHttpClient client = new AsyncHttpClient();

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public static void post(String transText, String sourceLang, String destLang, AsyncHttpResponseHandler responseHandler) throws UnsupportedEncodingException {
        client.get(getAbsoluteUrl(transText, sourceLang, destLang), responseHandler);
    }

    private static String makeKeyChunk(String key) {
        return "" + KEY;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private static String makeTransChunk(String transText) throws UnsupportedEncodingException {
        String encodedText = URLEncoder.encode(transText, StandardCharsets.UTF_8.toString());
        return "&q=" + encodedText;
    }

    private static String langSource(String langSource) {
        return "&source=" + langSource;
    }

    private static String langDest(String langDest) {
        return "&target=" + langDest;

    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private static String getAbsoluteUrl(String transText, String sourceLang, String destLang) throws UnsupportedEncodingException {
        String apiUrl = BASE_URL + makeKeyChunk(KEY) + makeTransChunk(transText) + langDest(destLang)+ langSource(sourceLang);
        return apiUrl;
    }
}