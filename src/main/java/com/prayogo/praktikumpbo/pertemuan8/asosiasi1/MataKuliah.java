/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan8.asosiasi1;

/**
 *
 * @author PRAYOGO
 */
public class MataKuliah {
    private String kodeMK;
    private String namaMK;
    private int sksMK;
    
    public MataKuliah(String kd, String nm, int sks){
        kodeMK = kd;
        namaMK = nm;
        sksMK = sks;
    }
    
    public void displayMK(){
        System.out.println("Kode MK : "+ kodeMK);
        System.out.println("Nama MK : "+namaMK);
        System.out.println("SKS MK : "+sksMK);
    }
}
