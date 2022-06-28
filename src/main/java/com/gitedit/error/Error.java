package com.gitedit.error;

import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * The type Error.
 *
 * @author king
 */
public class Error {
    /**
     * Test.
     */
    public static void test() {
        String str2 = "2345abc";
        Pattern p = compile("^\\d+$");
        Matcher m = p.matcher(str2);
        if (m.matches()) {
            System.out.println("数字");
        }

    }

    public static void test1() {
        FileReader reader = null;
        try {
            reader = new FileReader("/Users/king/IdeaProjects/learn_java/src/main/java/com/gitedit/error/file");
            char c1 = (char) reader.read();
            System.out.println(c1);
        } catch (IOException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void test2() throws ParseException {
        DateFormat df = new SimpleDateFormat("yyy-MM-dd");
        String str = "2049-10-01";
        Date d = df.parse(str);
        System.out.println("d = " + d);
    }

    public static void test3() {
        try (FileReader reader = new FileReader("/Users/king/IdeaProjects/learn_java/src/main/java/com/gitedit/error/file")) {
            char c1 = (char) reader.read();
            System.out.println("c1 = " + c1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws ParseException {
        test();
        test1();
        test2();
        test3();
    }

}
