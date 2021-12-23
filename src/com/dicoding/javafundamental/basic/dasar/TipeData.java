package com.dicoding.javafundamental.basic.dasar;

public class TipeData {
    public static void tipeData() {
        // Byte
        // Range/Jangkauan tipe data byte sekitar -127 dan 127
        Byte abyte, bbyte;
        abyte = -100;
        bbyte = 100;
        System.out.println("Ini adalah tipe data Byte");
        System.out.println("Byte pertama "+ abyte + " dan " + "Byte kedua " + bbyte);

        // Short
        // Range/Jangkauan tipe data short sekitar -32,768 dan 32,767
        Short ashort, bshort;
        ashort = -32000;
        bshort = 32000;
        System.out.println("Ini adalah tipe data short");
        System.out.println("Short pertama " + ashort + " dan " + "Short kedua " + bshort);

        // Int
        // Range/Jangkauan tipe data int sekitar -2,147,483,648 dan 2,147,483,647
        Integer aInteger, bInteger;
        aInteger = -1111111111;
        bInteger = 1111111111;
        System.out.println("Ini adalah tipe data integer");
        System.out.println("Integer pertama " + aInteger + " dan " + "Integer kedua " + bInteger);

        // Long
        // Range/Jangkauan tipe data long sekitar -9,223,372,036,854,775,808 dan 9,223,372,036,854,775,807
        Long aLong, bLong;
        aLong = -9223372036854775808l;
        bLong = 9223372036854775807l;
        System.out.println("Ini adalah tipe data long");
        System.out.println("Long pertama " + aLong + " dan " + "Long kedua " + bLong);

        // Float
        // Menandakan angka desimal
        Float aFloat = 3.31f;
        System.out.println("Ini adalah tipe data float");
        System.out.println("Float " + aFloat);

        // Double
        // Memiliki persamaan dengan tipe data float, namun float memiliki kapasitas yang lebih besar
        Double aDouble = 3.31;
        System.out.println("Ini adalah tipe data double");
        System.out.println(aDouble);

        // Boolean
        // Menandakan pernyataan yaitu false or true
        Boolean aBoolean, bBoolean;
        aBoolean = true;
        bBoolean = false;
        System.out.println("Ini adalah tipe data boolean");
        System.out.println("Boolean pertama " + aBoolean + " dan " + "Boolean kedua " + bBoolean);

        // Char
        // Digunakan untuk menampung sebuah karakter yang dibungkus dengan tanda ('') dan berlaku untuk huruf
        Character aCharacter = 'P';
        System.out.println("Ini adalah tipe data char atau character");
        System.out.println("Character pertama " + aCharacter);
    }
}
