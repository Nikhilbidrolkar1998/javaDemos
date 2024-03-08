package com.inter.basics;

public class FileDetails {
    public static void main(String[] args) {
        ICompressor compressor=new ZipCompressor();
        compressor.compressFiles("file1.doc","file2.jpeg");

    }
}
