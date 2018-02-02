package org.udid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;
import java.util.stream.IntStream;

public class GenerateUdid {

    private static final int SIZE = 1000;

    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder(SIZE);

        IntStream.range(0, SIZE).forEach(
                x -> sb.append(UUID.randomUUID()).append("\n")
        );

        writeToFile(String.valueOf(sb).getBytes());
    }

    private static void writeToFile(byte[] str) {
        Path path = Paths.get("./uuid.csv");

        try {
            Files.write(path, str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
