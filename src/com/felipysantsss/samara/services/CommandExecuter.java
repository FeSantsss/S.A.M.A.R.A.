package com.felipysantsss.samara.services;

import com.felipysantsss.samara.entities.enums.ShellCommands;

import java.io.IOException;

public class CommandExecuter {
    public static void executerSolo(ShellCommands command){
        try {
            ProcessBuilder pb = new ProcessBuilder(command.getCommand());
            pb.inheritIO();
            Process process = pb.start();

            int exitCode = process.waitFor();
            System.out.println("Exit Code: " + exitCode);
        } catch (IOException | InterruptedException e){
            System.out.println(e.getMessage() + e.getCause());
        }
    }
}
