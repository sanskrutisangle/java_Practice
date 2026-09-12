package filehandling;

import java.io.*;

class Student {

    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class FileWriterDemo {

    public static void main(String[] args) {

        File file = new File(
                "C:\\Users\\Administrator\\Desktop\\core java\\FileWriter.txt"
        );

        int[] mark = {20, 30, 57, 67};

        Student s1 = new Student();

        s1.setId(101);
        s1.setName("sanskruti");

        try {

            file.createNewFile();

            FileWriter fw = new FileWriter(
                    "C:\\Users\\Administrator\\Desktop\\core java\\FileWriter.txt",
                    true
            );

            fw.write("Hello, now I study file handling");
            fw.write("\nThis is a new line");

            fw.write("\nI can do addition and store the data here also: "
                    + (10 + 20));

            fw.write("\nI can store the array in this file also:");

            for (int i = 0; i < mark.length; i++) {
                fw.write("\n" + mark[i]);
            }

            fw.write("\nI can store the student object data here also:");

            fw.write("\nID: " + s1.getId());
            fw.write("\nName: " + s1.getName());
            
            fw.flush();

            // Very important
            fw.close();

            System.out.println("Data written successfully");

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}