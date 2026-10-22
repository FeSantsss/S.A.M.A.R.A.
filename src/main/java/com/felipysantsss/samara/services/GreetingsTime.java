package com.felipysantsss.samara.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GreetingsTime {
    public static LocalTime nowTime(){
        LocalTime userTime = LocalTime.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm");
        return LocalTime.parse(userTime.format(fmt));
    }
    public static void nowDate() {
        System.out.print(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public static void greeting(LocalTime now){
        if (now.isBefore(LocalTime.of(11, 59))){
            // morning
            System.out.println("Good Morning.");
        }
        if (now.isAfter(LocalTime.of(11, 59)) && now.isBefore(LocalTime.of(17,59))){
            // afternoon
            System.out.println("Good Afternoon.");
        }
        if (now.isAfter(LocalTime.of(18, 0))) {
            // night
            System.out.println("Good Night.");
        }
    }
}
