FROM eclipse-temurin:21-jdk AS build
WORKDIR /app

COPY src/ ./src/

RUN find src -type f -name "*.java" > sources.txt \
    && javac -d out @sources.txt

FROM eclipse-temurin:21-jre
WORKDIR /app

COPY --from=build /app/out/ ./out/

CMD ["java", "-cp", "out", "com.felipysantsss.samara.Main"]
