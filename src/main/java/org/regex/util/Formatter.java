package org.regex.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Formatter {


    public static void getSimpleDateFormat() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        simpleDateFormat.applyPattern("dd-MM-yyyy");
        System.out.println(simpleDateFormat.format(new Date()));

        simpleDateFormat.applyPattern("dd MM yyyy, HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));

        simpleDateFormat.applyPattern("EEEEE, dd MMMMM yyyy, HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));
    }

    public static void getDecimalFormat() {
        DecimalFormat decimalFormat = new DecimalFormat();
        Number number = 123.456;

        decimalFormat.applyPattern("###.#####");
        System.out.println(decimalFormat.format(number));

        decimalFormat.applyPattern("000.00000");
        System.out.println(decimalFormat.format(number));

        decimalFormat.applyPattern("#.#");
        System.out.println(decimalFormat.format(number));
    }
}
