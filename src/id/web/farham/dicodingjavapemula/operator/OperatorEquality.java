/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.web.farham.dicodingjavapemula.operator;

/**
 *
 * @author Farham Harvianto
 */
public class OperatorEquality {
    public static void main(String[] args) {
        int value1 = 5;
        int value2 = 4;
        boolean hasil;
        hasil = value1 == value2;
        System.out.println("Hasil 'value1 == value2' adalah " + hasil);
        System.out.println();
        System.out.println("Tidak sama dengan..");
        hasil = value1 != value2;
        System.out.println("Hasil 'value1 != value2' adalah " + hasil);
        System.out.println();
        System.out.println("Lebih besar dari..");
        hasil = value1 > value2;
        System.out.println("Hasil 'value1 > value2' adalah " + hasil);
        System.out.println();
        System.out.println("Sama atau lebih besar dari..");
        hasil = value1 >= value2;
        System.out.println("Hasil 'value1 >= value2' adalah " + hasil);
        System.out.println();
        System.out.println("Kurang dari..");
        hasil = value1 < value2;
        System.out.println("Hasil 'value1 < value2' adalah " + hasil);
        System.out.println();
        System.out.println("Sama atau kurang dari dengan..");
        hasil = value1 <= value2;
        System.out.println("Hasil 'value1 <= value2' adalah " + hasil);
        System.out.println();
    }
}
