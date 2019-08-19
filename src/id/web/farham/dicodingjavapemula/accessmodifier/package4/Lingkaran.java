/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.web.farham.dicodingjavapemula.accessmodifier.package4;

/**
 *
 * @author Farham Harvianto
 */
// Kelas yang dideklarasikan sebagai final maka tidak bisa di jadikan sebagai induk kelas
/*
final class Lingkaran {
 
}
*/
public class Lingkaran {
    static final double PI = 3.141;
    
    int jari = 7;
 
    final double getLuas() {
        return PI * (jari * jari);
    }
}
