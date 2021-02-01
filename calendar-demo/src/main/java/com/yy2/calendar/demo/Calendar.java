package com.yy2.calendar.demo;

public class Calendar {
    String date;
    String wordDay;
    int numberDay;

    public Calendar(String date, String wordDay, int numberDay) {
        this.date = date;
        this.wordDay = wordDay;
        this.numberDay = numberDay;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWordDay() {
        return wordDay;
    }

    public void setWordDay(String wordDay) {
        this.wordDay = wordDay;
    }

    public int getNumberDay() {
        return numberDay;
    }

    public void setNumberDay(int numberDay) {
        this.numberDay = numberDay;
    }
}
