package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethodsDemo {

    public static void main(String[] args) {

        // Create File object
        File file = new File("C:\\Users\\Administrator\\Desktop\\core java\\demo.txt");

        // 1. exists()
        System.out.println("Exists: " + file.exists());

        // 2. createNewFile()
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 3. isFile()
        System.out.println("Is File: " + file.isFile());

        // 4. isDirectory()
        System.out.println("Is Directory: " + file.isDirectory());

        // 5. getName()
        System.out.println("Name: " + file.getName());

        // 6. getPath()
        System.out.println("Path: " + file.getPath());

        // 7. getAbsolutePath()
        System.out.println("Absolute Path: " + file.getAbsolutePath());

        // 8. length()
        System.out.println("Size: " + file.length() + " bytes");


        // 9. mkdir()
        File folder = new File(
                "C:\\Users\\Administrator\\Desktop\\core java\\TestFolder"
        );

        if (folder.mkdir()) {
            System.out.println("Folder created using mkdir()");
        } else {
            System.out.println("Folder already exists");
        }


        // 10. mkdirs()
        File folders = new File(
                "C:\\Users\\Administrator\\Desktop\\core java\\Java\\FileHandling\\Practice"
        );

        if (folders.mkdirs()) {
            System.out.println("Folders created using mkdirs()");
        } else {
            System.out.println("Folders already exist");
        }


        // 11. list()
        File directory = new File(
                "C:\\Users\\Administrator\\Desktop\\core java"
        );

        String[] names = directory.list();

        System.out.println("\nContents using list():");

        if (names != null) {
            for (String name : names) {
                System.out.println(name);
            }
        }


        // 12. listFiles()
        File[] files = directory.listFiles();

        System.out.println("\nContents using listFiles():");

        if (files != null) {
            for (File f : files) {
                System.out.println(f.getName());
            }
        }


        // 13. delete()
       
        /*
        if (file.delete()) {
            System.out.println("File deleted");
        } else {
            System.out.println("File could not be deleted");
        }
        */
    }
}