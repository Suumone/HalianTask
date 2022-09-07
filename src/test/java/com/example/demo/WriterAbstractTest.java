package com.example.demo;

import com.example.demo.writers.WriterFactory;
import com.example.demo.writers.WritersAbstract;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class WriterAbstractTest {
    private final WriterFactory writerFactory = new WriterFactory();

    @Test
    public void getStringWriterTest() {
        WritersAbstract stringWriter = writerFactory.getWriter("String");
        Assert.assertEquals("StringWriterImpl", stringWriter.getClass().getSimpleName());
    }

    @Test
    public void getFileWriterTest() {
        WritersAbstract fileWriter = writerFactory.getWriter("File");
        Assert.assertEquals("FileWriterImpl", fileWriter.getClass().getSimpleName());
    }

    @Test
    public void getWrongWriterTest() {
        WritersAbstract nullWriter = writerFactory.getWriter("Test");
        Assert.assertNull(nullWriter);
    }

    @Test
    public void closeStringWriterTest() throws IOException {
        String textBefore = "text before closing";
        String textAfter = "text after closing";

        WritersAbstract stringWriter = writerFactory.getWriter("String");
        stringWriter.write(textBefore);
        stringWriter.close();
        stringWriter.write(textAfter);

        Assert.assertEquals(textBefore, stringWriter.read());
    }

    @Test
    public void closeFileWriterTest() throws IOException {
        String textBefore = "text before closing";
        String textAfter = "text after closing";

        WritersAbstract stringWriter = writerFactory.getWriter("File");
        stringWriter.write(textBefore);
        stringWriter.close();
        stringWriter.write(textAfter);

        Assert.assertEquals(textBefore, stringWriter.read());
    }
}
