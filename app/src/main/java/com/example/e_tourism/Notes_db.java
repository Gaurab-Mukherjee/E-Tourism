package com.example.e_tourism;

import java.io.Serializable;

public class Notes_db implements Serializable {

     String notes ,week_days, year_t;

    public Notes_db(){
    }

    public Notes_db(String notes, String week_days, String year_t) {
        this.notes = notes;
        this.week_days = week_days;
        this.year_t = year_t;
    }

    public String getNotes() {
        return notes;
    }

    public String getWeek_days() {
        return week_days;
    }

    public String getYear() {
        return year_t;
    }
}
