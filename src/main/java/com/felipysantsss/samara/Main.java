package com.felipysantsss.samara;


import com.felipysantsss.samara.services.WelcomeIntro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        WelcomeIntro.Welcome();
        System.out.println();
    }
}
