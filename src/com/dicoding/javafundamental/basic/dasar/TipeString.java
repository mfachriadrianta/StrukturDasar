package com.dicoding.javafundamental.basic.dasar;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TipeString {
    public static void tipeString(){
        // String
        String astring = "Hello pai!";
        System.out.println(astring);
        Integer integer = astring.length();
        System.out.println("Panjang dari sebuah string " + integer);

        // Array char[]
        // untuk menghasilkan himpunan berupa huruf maupun angka
        char[] achar = new char[]{'f','a','c','h','r','i'};
        String convertachar = String.valueOf(achar);
        System.out.println("Tipe data char[] (himpunan)");
        System.out.printf("Char[] himpunan " + convertachar);

    }
}
