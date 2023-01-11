/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan8.asosiasi1;

public class Dosen extends MataKuliah{
    private String namaDosen;
    MataKuliah MK[];
    private String nppDosen;
    int juml;
    
    public Dosen(String n, String npp, int jml){
        namaDosen = n;
        MK = new Matakuliah[2];
        nppDosen = npp;
        juml = jml;
    }
    
    public void tambahMK(MataKuliah MK){
        MK[juml]=mk;
        juml++;
    }
    
    public void lihatMK(){
        System.out.println("namaDosen");
        for(int i =0; i<juml, i++){
            MK[i].tambahMK();
        }
    }
}
