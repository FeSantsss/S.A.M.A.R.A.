package com.felipysantsss.samara.tools.linux;

import lombok.NonNull;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public record CommandRequest(
        @NonNull String executable,
        @NonNull List<String> arguments,
        @NonNull Path workPath) {

    public CommandRequest {
        arguments = List.copyOf(arguments);
        if (executable.isBlank()) {
            throw new IllegalArgumentException("Executable cannot be void");
        }
        if (!Files.exists(workPath) || !Files.isDirectory(workPath)){
            throw new IllegalArgumentException("Enter a valid path!");
        }
    }
}
