package com.javarush.task.task18.task1818;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());
        File file3 = new File(reader.readLine());
        reader.close();


        FileOutputStream out = new FileOutputStream(file1);
        FileInputStream in1 = new FileInputStream(file2);
        FileInputStream in2 = new FileInputStream(file3);

        byte[] buffer = new byte[in1.available()];
        out.write(buffer);
        in1.close();

        buffer = new byte[in2.available()];
        out.write(buffer);
        in2.close();
        out.close();
    }
}