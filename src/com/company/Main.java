package com.company;

import java.util.Arrays;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        //#1
        System.out.println("Задача №1");
        int i = 1;
        String message = "";

        while (i < 10)
            message += i++ + " ";

        message += i + "\n";

        while (i > 1)
            message += i-- + " ";

        System.out.println(message + i);

        //#2
        System.out.println("\nЗадача №2");
        int firstFridayOfTheMonth = 7;
        int lastDayOfTheMonth = 31;

        for (int j = firstFridayOfTheMonth; j <= lastDayOfTheMonth; j += 7)
            System.out.println("Сегодня пятница, " + j + "-е число. Необходимо подготовить отчет.");

        //#3
        System.out.println("\nЗадача №3");
        int currentYear = 2022;
        int period = 79;

        int firstSeenWithinLastTwoCenturiesYear = ((currentYear - 200) / period + 1) * period;

        for (int j = firstSeenWithinLastTwoCenturiesYear; ; j += 79) {
            System.out.println(j);
            if (j > currentYear)
                break;
        }

    }
}
