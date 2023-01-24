package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.function.Consumer;

public class FileIterator implements Iterator<String> {
    String path;
    FileReader fileReader;
    BufferedReader bufferedReader;
    String next;


    public FileIterator(String path) {
        this.path = path;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
        } catch (IOException e) {
            System.out.println("Не удается открыть или найти файл по заданному пути");
        }
    }

    @Override
    public boolean hasNext() {
        try {
            if ((next = bufferedReader.readLine()) != null) {
                return true;
            }
            return false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String next() {
        return next;
    }


}
