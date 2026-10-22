package com.felipysantsss.samara.services;

import com.felipysantsss.samara.entities.enums.ShellCommands;

public class CommandSwitch {
    public static void choice(int choicedCommand){
        switch (choicedCommand){
            case 1 -> {
                CommandExecuter.executerSolo(ShellCommands.SHOW_FILES);
            }
            default -> System.out.println("Enter a valid value!");
        };
    }
}
