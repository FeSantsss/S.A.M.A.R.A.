package com.felipysantsss.samara.tools.linux;

import lombok.NonNull;

import java.nio.file.Path;
import java.util.List;

// essa será a classe que irá definir o tipo dos comandos.
// sendo, cada comando, divido em 3 partes:
// 1. executável (git, docker, ls, etc) -> 1 string
// 2. argumentos (push, ps, -a,-la, etc) -> lista de string
// 3. diretório -> será Path do java.nio.file
public record CommandRequest(@NonNull String executable,@NonNull List<String> arguments,@NonNull Path workPath) {
}
