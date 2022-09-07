package com.example.demo.writers.Impl;

import com.example.demo.writers.WritersAbstract;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriterImpl extends WritersAbstract {
    private final String filePath;
    private final File file;

    public FileWriterImpl(String filePath) {
        super();
        this.filePath = filePath;
        file = new File(filePath);
    }

    @Override
    public void write(String payload) throws IOException {
        if (!isClosed) {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(payload);
            fileWriter.flush();
            fileWriter.close();
        }
    }

    @Override
    public String read() throws IOException {
        return readFile();
    }

    @Override
    public void toLowerCase() throws IOException {
        write(readFile().toLowerCase());
    }

    @Override
    public void toUpperCase() throws IOException {
        write(readFile().toUpperCase());
    }

    @Override
    public void replaceStupid() throws IOException {
        write(readFile().replace(STUPID, STUPID_REPLACEMENT));
    }

    @Override
    public void removeDuplicates() throws IOException {
        write(removeDuplicatesFromString(readFile()));
    }

    private String readFile() throws IOException {
        return Files.readString(Path.of(filePath));
    }
}
