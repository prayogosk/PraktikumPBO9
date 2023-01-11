/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan8.asosiasi2;

public class Main {
    public static void main(String[] args) {
        MataKuliah mk = new MataKuliah();
        
        mk.namaDosen = "Hanifa";
        mk.kodeMK = "INFO01";
        mk.namaMK = "PBO";
        
        
        mk.kodeMK1 = "INFO02";
        mk.namaMK2 = "Struktur data";
        
        mk.kodeMK3 = "INFO03";
        mk.namaMK4 = "Bigdata";
        
        mk.print();
        mk.printInfo();
        mk.printIn();
    }
}
