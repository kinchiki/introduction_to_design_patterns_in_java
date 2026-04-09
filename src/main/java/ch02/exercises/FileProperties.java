package ch02.exercises;

import java.io.*;
import java.util.*;

public class FileProperties extends Properties implements FileIO {
    public void readFromFile(String filename) throws IOException {
        try (InputStream in = openInputStream(filename)) {
            load(in);
        }
    }

    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename), "written by FileProperties");
    }

    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    public String getValue(String key) {
        return getProperty(key, "");
    }

    private InputStream openInputStream(String filename) throws IOException {
        InputStream in = getClass().getClassLoader().getResourceAsStream(filename);

        if (in == null) {
            throw new FileNotFoundException("Resource not found: " + filename);
        }
        return in;
    }
}
