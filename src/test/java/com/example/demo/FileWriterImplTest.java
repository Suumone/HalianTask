package com.example.demo;

import com.example.demo.writers.Impl.FileWriterImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FileWriterImplTest {
    private final FileWriterImpl fileWriter = new FileWriterImpl("test.txt");

    @Test
    public void writeTest() throws IOException {
        String payload = "Payload";
        fileWriter.write(payload);

        Assert.assertEquals(payload, fileWriter.read());
    }

    @Test
    public void toLowerCaseTest() throws IOException {
        String payload = "Payload";
        fileWriter.write(payload);
        fileWriter.toLowerCase();

        Assert.assertEquals("payload", fileWriter.read());
    }

    @Test
    public void toUpperCaseTest() throws IOException {
        String payload = "Payload";
        fileWriter.write(payload);
        fileWriter.toUpperCase();

        Assert.assertEquals("PAYLOAD", fileWriter.read());
    }

    @Test
    public void removeStupidTest() throws IOException {
        String payload = "This replaces the word stupid";
        fileWriter.write(payload);
        fileWriter.replaceStupid();

        Assert.assertEquals("This replaces the word s*****", fileWriter.read());
    }

    @Test
    public void removeDuplicatesTest() throws IOException {
        String payload = "This is is it";
        fileWriter.write(payload);
        fileWriter.removeDuplicates();

        Assert.assertEquals("This is it", fileWriter.read());
    }
}
