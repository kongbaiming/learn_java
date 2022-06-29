package com.gitedit.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author king
 */
public class Stream {
    public static void main(String[] args) throws IOException {
        StringBuilder r = readFile();
        System.out.println("r = " + r);
    }

    public static StringBuilder readFile() throws IOException {
        try (FileInputStream fis = new FileInputStream("/Users/king/IdeaProjects/learn_java/src/main/java/com/gitedit/stream/file");) {
            int tmp = 0;
            StringBuilder sb = new StringBuilder();
            while ((tmp = fis.read()) != -1) {
                sb.append((char) tmp);
            }
            return sb;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
