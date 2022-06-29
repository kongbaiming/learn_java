package com.gitedit.stream;

import java.io.*;
import java.util.ArrayList;

/**
 * @author king
 */
public class TestObjectInputOutput {
    public static void main(String[] args) throws IOException {
        readObject();
    }

    public static void writeObject() throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("target/files"))) {
            ArrayList<User> list = new ArrayList<>();
            list.add(new User(1001, "king", "123456"));
            list.add(new User(1002, "kk", "123456"));
            oos.writeObject(list);
            oos.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readObject() throws IOException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("target/files"));) {
            ArrayList<User> list = (ArrayList) ois.readObject();
            for (User u : list
            ) {
                System.out.println(u.getId());
                System.out.println(u.getUname());
                System.out.println(u.getPwd());

            }
        } catch (FileNotFoundException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
