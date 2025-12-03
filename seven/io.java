package com.seven;
import java.io.*;

public class io {


    public static void main(String[] args) throws IOException {
        FileReader fr1 = new FileReader("D:\\java\\data\\test\\src\\com\\seven\\abc.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        String s = "";
        while ((s = br1.readLine()) != null) {
            System.out.println(s);
        }
        FileWriter fw = new FileWriter("D:\\java\\data\\test\\src\\com\\seven\\abc123.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hello world\r\n");bw.close();
        fw.close();
        br1.close();
        fr1.close();
        bw.close();
        System.out.println("写入成功");

        }
    }

