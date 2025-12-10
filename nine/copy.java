package com.nine;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\java\\data\\test\\src\\com\\nine\\abc.txt");
        FileOutputStream fos = new FileOutputStream("D:\\java\\data\\test\\src\\com\\nine\\abc1.txt");
        byte[] bys=fis.readAllBytes();
        fos.write(bys);
        fos.close();
        fis.close();
    }
}
