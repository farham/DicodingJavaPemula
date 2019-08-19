/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.web.farham.dicodingjavapemula.propertimetode;

/**
 *
 * @author Farham Harvianto
 */
public class Hewan {
    // Properti atau fields
    // Inisiasi dengan nilai inisial
    double tinggi = 30;
    double berat = 3;
    // Inisiasi melalui konstruktor
    int umur;
    // Konstruktor dengan parameter
    Hewan(int umur) {
        this.umur = umur;
        System.out.println("Halo, saya Kucing dengan Umur" + this.umur + " dengan Berat "+ this.berat +", dan Tinggi "+ this.tinggi);
    }
    // List Metode
    void lari(){
        System.out.println("Berlari dengan sangat cepat..");
    }
    void jalan(){
        System.out.println("Berjalan dengan pelan..");
    }
    void makan(){
        System.out.println("Makan dengan menggunakan mulut..");
    }
    
    // Nilai Balik
    double getBerat() {
        return berat;
    }
    double getTinggi() {
        return tinggi;
    }
    int getUmur() {
        return umur;
    }
}
