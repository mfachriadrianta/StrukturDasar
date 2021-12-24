package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.dasar.*;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Gitar.bunyi();
        Mobil.jumlahBanMobil();
        Motor.jumlahBanMotor();
        Kereta.jumlahBanKereta();

        Date date, tomorrow;
        date = new Date();
        tomorrow = DateUtils.addDays(date, 1);
        System.out.println("Hari ini " + date);
        System.out.println("Besok " + tomorrow);

        TipeData tipeData = new TipeData();
        tipeData.tipeData();

        TipeString.tipeString();

    }
}
