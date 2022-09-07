package com.example.demo;

import com.example.demo.writers.Impl.StringWriterImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StringWriterImplTest {
    private final StringWriterImpl stringWriter = new StringWriterImpl();

    @Test
    public void writeTest() {
        String payload = "Payload";
        stringWriter.write(payload);

        Assert.assertEquals(payload, stringWriter.read());
    }

    @Test
    public void toLowerCaseTest() {
        String payload = "Payload";
        stringWriter.write(payload);
        stringWriter.toLowerCase();

        Assert.assertEquals("payload", stringWriter.read());
    }

    @Test
    public void toUpperCaseTest() {
        String payload = "Payload";
        stringWriter.write(payload);
        stringWriter.toUpperCase();

        Assert.assertEquals("PAYLOAD", stringWriter.read());
    }

    @Test
    public void removeStupidTest() {
        String payload = "This replaces the word stupid";
        stringWriter.write(payload);
        stringWriter.replaceStupid();

        Assert.assertEquals("This replaces the word s*****", stringWriter.read());
    }

    @Test
    public void removeDuplicatesTest() {
        String payload = "This is is it";
        stringWriter.write(payload);
        stringWriter.removeDuplicates();

        Assert.assertEquals("This is it", stringWriter.read());
    }
}
