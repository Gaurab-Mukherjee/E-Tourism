package com.example.e_tourism;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ProductViewHolder> {

    private Context mCtx;
    private List<Notes_db> Notes_list;

    public NotesAdapter(Context mCtx, List<Notes_db> Notes_list) {
        this.mCtx = mCtx;
        this.Notes_list = Notes_list;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(
                LayoutInflater.from(mCtx).inflate(R.layout.note_list, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Notes_db notes_db = Notes_list.get(position);

        holder.textViewName.setText(notes_db.getNotes());
        holder.textViewBrand.setText(notes_db.getWeek_days());
        holder.textViewDesc.setText(notes_db.getYear());
    }

    @Override
    public int getItemCount() {
        return Notes_list.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName, textViewBrand, textViewDesc;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewName = itemView.findViewById(R.id.textview_name);
            textViewBrand = itemView.findViewById(R.id.textview_brand);
            textViewDesc = itemView.findViewById(R.id.textview_desc);

        }

    }
}