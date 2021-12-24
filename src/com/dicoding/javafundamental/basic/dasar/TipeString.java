package com.dicoding.javafundamental.basic.dasar;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TipeString {
    public static void tipeString(){

        // String
        String astring = "Hello pai!";
        System.out.println(astring);
        // Mengetahui panjang dari sebuah string
        Integer integer = astring.length();
        System.out.println("Panjang dari sebuah string " + integer);
        // Mengambil karakter dari sebuah string
        char charGetCharacter = astring.charAt(3);
        System.out.println(charGetCharacter);

        // Array char[]
        // untuk menghasilkan himpunan berupa huruf maupun angka
        char[] achar = new char[]{'f','a','c','h','r','i'};
        String convertachar = String.valueOf(achar);
        System.out.println("Tipe data char[] (himpunan)");
        System.out.printf("Char[] himpunan " + convertachar);

        // Berikut pengertiannya lebih lanjut :
        // 1 length()                                   = Digunakan untuk mengetahui panjang atau jumlah karakter dalam string.
        // 2 charAt(int index)                          = Digunakan untuk mengambil sebuah karakter berdasarkan indeks tertentu.
        // 3 format(String format, Object… args)	    = Digunakan untuk memformat sebuah string.
        // 4 substring(int beginIndex)                  = Mengembalikan/menghasilkan substring berdasarkan indeks yang diberikan.
        // 5 contains(CharSequence s)                   = Mengembalikan/menghasilkan nilai true atau false setelah mencocokkan karakter.
        // 6 equals(Object object)                      = Memeriksa apakah nilai objek sama dengan nilai string.
        // 7 isEmpty()                                  = Memeriksa apakah sebuah string itu kosong atau tidak.
        // 8 concat(String s)                           = Mengkonsolidasikan sebuah string.
        // 9 replace(char a, char b)                    = Mengganti suatu karakter di dalam string.
        // 10 indexOf(String a)                         = Mengetahui indeks dari sebuah substring.
        // 11 toLowerCase()                             = Mengubah format string menjadi huruf kecil semua.
        // 12 toUpperCase()                             = Mengubah format string menjadi huruf kapital semua.
        // 13 trim()                                    = Menghapus spasi awal dan akhir dari string.
        // 14 valueOf(int value)                        = Mengkonversi tipe yang diberikan menjadi sebuah string.
        // 15 compareTo()                               = Membandingkan dua nilai

    }
}
