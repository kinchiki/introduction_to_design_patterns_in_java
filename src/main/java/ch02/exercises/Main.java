package ch02.exercises;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("ch02/exercises/file.txt");
            f.setValue("year", "2024");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("tmp/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
