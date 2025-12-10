package com.nine;

import java.io.FileInputStream;
import java.io.IOException;

public class FileinputTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\java\\data\\test\\src\\com\\nine\\abc.txt");
//        byte[] bys = new byte[1024];
//        int len;
//        while ((len=fis.read(bys)) != -1) {
//            System.out.println(new String(bys, 0, len));
//        }
//        fis.close();
          byte[] byt=fis.readAllBytes();
          System.out.println(new String(byt));
          fis.close();

    }
}
