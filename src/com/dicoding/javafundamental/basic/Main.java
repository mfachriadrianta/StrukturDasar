package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.musik.Gitar;
import com.dicoding.javafundamental.basic.tipedata.User;
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

        User user = new User();
        user.tipeData();


    }
}
