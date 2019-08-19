/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.web.farham.dicodingjavapemula.accessmodifier.package4;

/**
 *
 * @author Farham Harvianto
 * 
 Penjelasan
 - Transient memiliki hubungan dengan proses serialisasi (serializing). 
 Serialisasi adalah proses konversi suatu objek menjadi byte agar dapat ditransmisikan.

 - Variabel yang dideklarasikan sebagai transient maka akan tidak dijaga nilainya 
   di dalam proses serialisasi. Contoh penggunaannya adalah seperti ini.
 */

import java.io.Serializable;
import java.text.StringCharacterIterator;
import java.util.*;
import java.io.*;

public class TestSerialize implements Serializable{
    // Variabel ini tidak akan dijaga nilainya
    transient int nilaiA;
 
    // Variabel ini akan dijaga nilainya
    double nilaiB;
    String nilaiC;
}

/*
Synchronized modifier digunakan untuk membatasi akses ke suatu 
variable/methods yang hanya boleh dilakukan oleh satu thread. 
Ketika ada 2 thread yang ingin mengakses synchronized variable/methods, 
maka prosesnya akan dilakukan secara serial (bergantian).
*/
/*
public synchronized void showData() {
 
}
*/