package br.com.matheus.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriteFileWriter {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.newLine();
        bw.write("asfasdfsafdas dfs sdf asf assdß");

        bw.close();

    }
}