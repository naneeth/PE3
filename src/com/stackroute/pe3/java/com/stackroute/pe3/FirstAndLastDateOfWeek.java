package com.stackroute.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/*
Write a java program to calculate first and last date of a week.
 */
public class FirstAndLastDateOfWeek {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat a = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(a.format(c.getTime()));
        for (int i = 0; i < 6; i++) {
            c.add(Calendar.DATE, 1);
        }
        System.out.println(a.format(c.getTime()));
    }
}