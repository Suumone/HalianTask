package com.example.demo.writers.Impl;

import com.example.demo.writers.WritersAbstract;

public class StringWriterImpl extends WritersAbstract {
    private String payload;

    public StringWriterImpl() {
        super();
    }

    @Override
    public void write(String payload) {
        if (!isClosed) {
            this.payload = payload;
        }
    }

    @Override
    public String read() {
        return payload;
    }

    @Override
    public void toLowerCase() {
        payload = payload.toLowerCase();
    }

    @Override
    public void toUpperCase() {
        payload = payload.toUpperCase();
    }

    @Override
    public void replaceStupid() {
        payload = payload.replace(STUPID, STUPID_REPLACEMENT);
    }

    @Override
    public void removeDuplicates() {
        payload = removeDuplicatesFromString(payload);
    }
}
