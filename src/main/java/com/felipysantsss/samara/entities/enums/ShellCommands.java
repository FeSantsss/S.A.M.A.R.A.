package com.felipysantsss.samara.entities.enums;

import java.util.List;

public enum ShellCommands {
    SHOW_FILES(List.of("ls", "-la")),
    ENTER_FOLDER(List.of("cd"));

    private List<String> command;

    ShellCommands(List<String> command) {
        this.command = command;
    }

    public List<String> getCommand() {
        return command;
    }
}
