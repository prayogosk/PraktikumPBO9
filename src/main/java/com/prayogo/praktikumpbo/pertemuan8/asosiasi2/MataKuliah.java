/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan8.asosiasi2;

public class MataKuliah {
    String namaDosen;
    String kodeMK;
    String namaMK;
    String kodeMK1;
    String namaMK2;
    String kodeMK3;
    String namaMK4;
    int sksMK;
    
    public void print(){
        System.out.println("Nama Dosen : "+namaDosen);
        System.out.print("Kode MK : "+kodeMK);
        System.out.print("    Nama MK : "+namaMK);
        System.out.print(" -  Sks MK : "+sksMK);
    }
    
    public void printInfo(){
        System.out.println();
        System.out.print("Kode MK : "+kodeMK1);
        System.out.print("    Nama MK : "+namaMK2);
        System.out.print(" -  Sks MK : "+sksMK);
    }

    public void printIn(){
        System.out.println();
        System.out.print("Kode MK : "+kodeMK3);
        System.out.print("    Nama MK : "+namaMK4);
        System.out.print(" -  Sks MK : "+sksMK);
    }
}
