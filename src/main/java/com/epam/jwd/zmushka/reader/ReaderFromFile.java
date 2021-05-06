package com.epam.jwd.zmushka.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public final class ReaderFromFile {

    private static ReaderFromFile instance;

    private ReaderFromFile() {
    }

    public static ReaderFromFile getInstance() {
        if (instance == null) {
            instance = new ReaderFromFile();
        }
        return instance;
    }

    public String readTextFromFile(String pathName) throws IOException {
        StringBuilder textFromFile = new StringBuilder();
        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader(pathName))) {
            while ((line = reader.readLine()) != null) {
                textFromFile.append(line);
            }
        }
        return textFromFile.toString();
    }
}
