package br.com.matheus.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestUnicodeEEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String s = "C";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes("UTF-8");
        System.out.println((bytes.length + " , " + "UTF-8"));

        bytes = s.getBytes("windows-1252");
        System.out.println((bytes.length + " , " + "windows-1252"));

        bytes = s.getBytes("UTF-16");
        System.out.println((bytes.length + " , " + "UTF-16"));

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println((bytes.length + " , " + "US_ASCII"));
    }
}
