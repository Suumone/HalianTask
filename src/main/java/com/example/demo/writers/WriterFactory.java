package com.example.demo.writers;

import com.example.demo.writers.Impl.FileWriterImpl;
import com.example.demo.writers.Impl.StringWriterImpl;

public class WriterFactory {

    public WritersAbstract getWriter(String type) {
        if (type.equals("String"))
            return new StringWriterImpl();
        if (type.equals("File"))
            return new FileWriterImpl("test.txt");
        return null;
    }

}
