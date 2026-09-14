package filehandling;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardCopyOption;
import java.util.*;

public class NIOFileManager {

    public static void main(String[] args) throws Exception {

        // Step 1: Create directory

        Path directory = Path.of("JavaFiles");

        if (!Files.exists(directory)) {
            Files.createDirectory(directory);
        }

        // Step 2: Create file

        Path file = directory.resolve("notes.txt");

        if (!Files.exists(file)) {
            Files.createFile(file);
        }

        System.out.println("done");

        System.out.println(Files.isRegularFile(file));
        System.out.println(Files.isDirectory(directory));

        // Creating another file

        Path path = Path.of("java.txt");

        if (!Files.exists(path)) {
            Files.createFile(path);
        }

        // Write multiple lines

        List<String> line = List.of(
                "java",
                "Spring",
                "jdbc"
        );

        Files.write(path, line);

        // Read all lines

        List<String> lines = Files.readAllLines(path);

        for (String l : lines) {
            System.out.println(l);
        }

        // Copy java.txt → notes.txt

        Files.copy(
                path,
                file,
                StandardCopyOption.REPLACE_EXISTING //"If notes.txt already exists, overwrite it."
        );

        // Read copied file

        List<String> copiedLines = Files.readAllLines(file);

        for (String l : copiedLines) {
            System.out.println(l);
        }

        // Read complete file

        String data = Files.readString(path);

        System.out.println(data);

        // Creating nested directories

        Files.createDirectories(
                Path.of("java notes", "notes", "video")
        );

        // Move file

        Path oldFile = Path.of("sql-notes.txt");

        if (!Files.exists(oldFile)) {
            Files.createFile(oldFile);
        }

        Path newFile = Path.of("java-notes.txt");

        Files.move(oldFile, newFile);

        // StandardOpenOption

        Files.writeString(
                path,
                "\nSpring Boot",
                StandardOpenOption.APPEND
        );

        // List files

        Files.list(directory)
                .forEach(System.out::println);

        // Walk through directory

        Files.walk(directory)
                .forEach(System.out::println);
    }
}