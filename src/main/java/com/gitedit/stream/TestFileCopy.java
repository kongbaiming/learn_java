package com.gitedit.stream;

import java.io.*;

/**
 * @author king
 */
public class TestFileCopy {
    public static void main(String[] args) throws IOException {
        testReadWrite("/Users/king/IdeaProjects/learn_java/src/main/java/com/gitedit/stream/file", "target/file_copy.txt");
    }

    public static void copyFile(String src, String dest) throws IOException {
        try (FileReader fr = new FileReader(src);
             FileWriter fw = new FileWriter(dest)) {
            int temp;
            while ((temp = fr.read()) != -1) {
                fw.write(temp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void bufferCopyFile(String src, String dest) throws IOException {
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest);
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos);) {
            int temp;
            while ((temp = bis.read()) != -1) {
                bos.write(temp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void testReadWrite(String src, String dest) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(src));
             BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
        ) {
            String tempString = "";
            while ((tempString = br.readLine()) != null) {
                bw.write(tempString);
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
