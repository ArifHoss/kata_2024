package org.arif.DAY_01;

import com.sun.security.jgss.GSSUtil;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();

        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd-mm-yyyy HH:mm");

        Date date = new Date(currentTimeMillis);

        System.out.println(sdf.format(date));
    }
}
