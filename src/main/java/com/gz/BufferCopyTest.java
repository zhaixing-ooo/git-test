package com.gz;

import java.io.*;

public class BufferCopyTest {
        /*
         * BufferedInputStream    字节缓冲输入流
         * BufferedOutputStream   字节缓冲输出流
         *
         */
        public static void main(String[] args) {
            BufferedInputStream bis = null;
            BufferedOutputStream bos = null;
            try {
                //1.创建字节缓冲，输入输出流
                bis = new BufferedInputStream(new FileInputStream("凄美地.txt"));
                bos = new BufferedOutputStream(new FileOutputStream("COPY.txt"));
                //2.读写操作
                int i;
                while ((i = bis.read()) != -1) {
                    bos.write(i);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    //3.关闭流释放资源
                    if (bis != null) bis.close();
                    if (bos != null) bos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }
}
