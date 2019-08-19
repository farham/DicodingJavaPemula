/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.web.farham.dicodingjavapemula.accessmodifier.package2;

/**
 *
 * @author Farham Harvianto
 */
import id.web.farham.dicodingjavapemula.accessmodifier.package1.KelasA;

public class KelasB extends KelasA{
    
    protected void methodC() {
        super.methodC();
        System.out.println("Contoh pemanggilan protected dari package luar");
    }
}
