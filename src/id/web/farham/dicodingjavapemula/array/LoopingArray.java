/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.web.farham.dicodingjavapemula.array;

/**
 *
 * @author Farham Harvianto
 */
public class LoopingArray {
    public static void main(String[] args) {
        int[] arrInt = new int[100];
 
        // Inisiasi dan menampilkan arrInt dari elemen ke 1 sampai 1000000
        for (int x = 0; x < arrInt.length; x++) {
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }
    }
}
