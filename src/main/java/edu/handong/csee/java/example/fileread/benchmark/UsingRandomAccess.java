package edu.handong.csee.java.example.fileread.benchmark;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by sherxon on 4/28/17. https://github.com/sherxon/AlgoDS/tree/master/src/oi
 */
public class UsingRandomAccess {
    public static void main(String[] args) throws IOException {
        //-------------- Test reading 1 MB file. --------------------
        StopWatch.start();
        RandomAccessFile file1=new RandomAccessFile(new File(DumpDataWriter.input1MB), "r");
        while (file1.read()!=-1);
        long duration = StopWatch.stop();
        System.out.println(duration + " milsec");
        
        file1.close();
        
        StopWatch.start();
        RandomAccessFile file2=new RandomAccessFile(new File(DumpDataWriter.input10MB), "r");
        while (file2.read()!=-1);
        long duration2 = StopWatch.stop();
        System.out.println(duration2 + " milsec");
        
        file2.close();
    }
}
