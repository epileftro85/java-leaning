package com.anclasoft.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputService {
    private static InputService instance;
    private final BufferedReader reader;

    private InputService() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static InputService getInstance() {
        if (instance == null) {
            instance = new InputService();
        }
        return instance;
    }

    public static void reset() {
        if (instance != null && instance.reader != null) {
            try {
                instance.reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        instance = null;
    }

    public String readLine() throws IOException {
        return reader.readLine();
    }
}
