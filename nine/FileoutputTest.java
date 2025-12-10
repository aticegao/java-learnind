package com.nine;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\java\\data\\test\\src\\com\\nine\\bcd.txt",true);
        //public void write(int b):向文件中写一个字节数据
        // public void write(byte[]b):向文件中写一个字节数组数据
        // public void write(byte[]b,int off,int len):向文件中写字节数组的一部分
        fos.write(97);
        byte[] bys ={97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122};
        fos.write("\r\n".getBytes());
        fos.write(bys);
        fos.write("\r\n".getBytes());
        fos.write(bys,0,5);
        fos.write("\r\n".getBytes());
        fos.write("hello".getBytes());
        fos.close();
    }
}
