package com.example.demo.writers;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class WritersAbstract {
    protected final static String STUPID = "stupid";
    protected final static String STUPID_REPLACEMENT = "s*****";
    protected final static Pattern pattern = Pattern.compile("(?i)(\\b\\w+\\b)(.*?) \\b\\1\\b");

    protected boolean isClosed;

    public WritersAbstract() {
        this.isClosed = false;
    }

    public void close() {
        isClosed = true;
    }

    public abstract void write(String data) throws IOException;

    public abstract String read() throws IOException;

    public abstract void toLowerCase() throws IOException;

    public abstract void toUpperCase() throws IOException;

    public abstract void replaceStupid() throws IOException;

    public abstract void removeDuplicates() throws IOException;

    protected String removeDuplicatesFromString(String text) {
        Matcher m = pattern.matcher(text);
        while (m.find()) {
            text = m.replaceAll("$1$2");
            m = pattern.matcher(text);
        }
        return text;
    }
}
