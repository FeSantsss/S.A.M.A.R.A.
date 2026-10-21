package com.felipysantsss.samara;


import com.felipysantsss.samara.services.CommandSwitch;
import com.felipysantsss.samara.services.WelcomeIntro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        WelcomeIntro.Welcome();
        System.out.println();
        System.out.println("All commands:");
        System.out.println("1 - SHOW FILES");
        System.out.print("Choice the command to execute: ");
        int choice = input.nextInt();
        CommandSwitch.choice(choice);
    }
}
