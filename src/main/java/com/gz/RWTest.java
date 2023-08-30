package com.gz;

import java.io.*;

public class RWTest {
    public static void main(String[] args){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
          br = new BufferedReader(new FileReader("凄美地.txt"));
          bw = new BufferedWriter(new FileWriter("COPY.txt"));
            String line;
            while((line = br.readLine())!=null){
                bw.write(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(br != null)br.close();
                if(bw != null)bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
