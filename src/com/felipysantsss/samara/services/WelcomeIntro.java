package com.felipysantsss.samara.services;

public class WelcomeIntro {
    public static void Welcome(){
        try {
            String userDate = System.getProperty("user.date");
            String userName = System.getProperty("user.name");
            String userOS = System.getProperty("os.version");
            String userDirectory = System.getProperty("user.dir");

            System.out.println("------------------------------------------------");
            System.out.print("Date: ");
            GreetingsTime.nowDate();
            System.out.println();
            System.out.println("Hour: " + GreetingsTime.nowTime());
            System.out.println("User: " + userName);
            System.out.println("OS: " + userOS);
            System.out.println("Directory: " + userDirectory);
            System.out.println();
            System.out.print("Hi, Sir! ");
            GreetingsTime.greeting(GreetingsTime.nowTime());
            System.out.println("------------------------------------------------");

        }catch (IllegalArgumentException e){
            System.out.println("Erro");
        }
    }
}
