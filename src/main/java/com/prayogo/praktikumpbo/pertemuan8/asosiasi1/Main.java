/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan8.asosiasi1;

/**
 *
 * @author PRAYOGO
 */
public class Main {
    public static void main(String[] args) {
        Dosen ds = new Dosen("Hafi");
        MataKuliah mk1 = new MataKuliah("Analisis & Perancangan SI");
        MataKuliah mk2 = new MataKuliah("Sistem Operasi");
        
        ds.tambahMK(mk1);
        ds.tambahMK(mk2);
        ds.lihatMK();
    }
}
