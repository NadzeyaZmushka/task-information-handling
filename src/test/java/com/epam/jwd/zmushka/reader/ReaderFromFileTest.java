package com.epam.jwd.zmushka.reader;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ReaderFromFileTest {

    private final ReaderFromFile reader = ReaderFromFile.getInstance();

    @Test
    public void testReadTextFromFile() throws IOException {
        String pathName = "src\\test\\resources\\input\\testText.txt";

        String expected = "    Hello world!!   My name is lalala... Haw are you?   I live in Minsk .. 123 76(6/3).";
        String actual = reader.readTextFromFile(pathName);

        assertEquals(expected, actual);
    }

    @Test(expected = FileNotFoundException.class)
    public void testReadTextFromFile_throwsFileNotFoundException_whenFileNotFound() throws IOException {
        String pathName = "src\\test\\resources\\input\\testT.txt";

        reader.readTextFromFile(pathName);
    }
}