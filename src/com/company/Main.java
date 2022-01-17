package com.company;

import java.util.Arrays;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        //#1
        System.out.println("Задача №1");

        String message = "";

        for (int i = 1; i < 10; i++)
            message += i + " ";

        message += "10\n";

        for (int i = 10; i > 1; i--)
            message += i + " ";

        System.out.println(message + "1");

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
        int firstSeenWithinLastTwoCenturiesYear = 0;

        do
            firstSeenWithinLastTwoCenturiesYear += period;
        while ( firstSeenWithinLastTwoCenturiesYear <= (currentYear - 200) );

        for (int j = firstSeenWithinLastTwoCenturiesYear; j <= (currentYear + 100); j += period)
            System.out.println(j);

    }
}
