package br.com.matheus.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TestWritePrintStream {
    public static void main(String[] args) throws IOException {

        PrintWriter ps = new PrintWriter("lorem2.txt");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println();
        ps.println();
        ps.println("asfasdfsafdas dfs sdf asf assdß");

        ps.close();

        System.out.println();

    }
}
