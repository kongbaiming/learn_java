package com.gitedit.stream;

import java.io.*;

/**
 * @author king
 */
public class TestInputStreamRead {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            String str = br.readLine();
            while (!"exit".equals(str)) {
                bw.write("键盘输入:" + str);
                bw.newLine();
                bw.flush();
                str = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
