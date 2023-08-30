package com.gz;

import java.io.*;

public class FisCopyTest {
    public static void main(String[] args){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            int i ;
           fis = new FileInputStream(new File("凄美地.txt"));
            fos = new FileOutputStream(new File("COPY.txt"));
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(fis != null){
                    fis.close();
                }
                if (fos != null){
                    fos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
