/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.web.farham.dicodingjavapemula.basic;

import id.web.farham.dicodingjavapemula.basic.hewan.Sapi;
import id.web.farham.dicodingjavapemula.basic.kendaraan.Kereta;
import id.web.farham.dicodingjavapemula.basic.kendaraan.Mobil;
import id.web.farham.dicodingjavapemula.basic.kendaraan.Motor;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

/**
 *
 * @author Farham Harvianto
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Sapi.bunyi();
        
        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();
        
        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);
    }
}
