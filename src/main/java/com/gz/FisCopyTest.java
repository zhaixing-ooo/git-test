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
            byte[] bys = new byte[1024];
            int len;
            while((len = fis.read(bys))!=-1){
                fos.write(bys,0,len);
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
