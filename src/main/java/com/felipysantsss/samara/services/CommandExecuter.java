package com.felipysantsss.samara.services;

import java.io.IOException;
import java.util.List;

public class CommandExecuter {
    public static List<String> executer(List<String> command){
        try {
            ProcessBuilder pb = new ProcessBuilder(command);
            pb.inheritIO();
            Process process = pb.start();

            int exitCode = process.waitFor();
            System.out.println("Exit Code: " + exitCode);
        } catch (IOException | InterruptedException e){
            System.out.println(e.getMessage() + e.getCause());
        }
    }
}
