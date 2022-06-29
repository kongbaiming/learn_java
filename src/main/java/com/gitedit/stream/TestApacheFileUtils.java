package com.gitedit.stream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @author king
 * 使用Apache IO
 */
public class TestApacheFileUtils {
    public static void main(String[] args) throws IOException {
        writeFile();
        readFile();
        readUrl();
        fileCopy();
    }

    public static void writeFile() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(Math.random()).append("\n");
        }
        try {
            FileUtils.write(new File("target/files"), sb.toString(), "UTF-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile() throws IOException {
        List<String> content = FileUtils.readLines(new File("target/files"), "utf-8");
        for (String temp : content
        ) {
            System.out.println("temp = " + temp);
        }
    }

    public static void readUrl() throws IOException {
        URL url = new URL("http://ddns.gitedit.com:3000/");
        InputStream is = url.openStream();
        String content = IOUtils.toString(is, StandardCharsets.UTF_8);
        System.out.println("content = " + content);

    }

    public static void fileCopy() {
        File srcFile = new File("target/files");
        File destFile = new File("target/files-bak");
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
