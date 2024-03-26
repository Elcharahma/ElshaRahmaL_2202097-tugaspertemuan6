/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbokelasobjek.pertemuan6kelasobjek;

/**
 *
 * @author ELSHA
 */
public class Pertemuan6KelasObjek {

    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga();
        System.out.println("Alas "+segitiga1.alas+" Tinggi "+segitiga1.tinggi+" Sisi "+segitiga1.sisi);
        System.out.println("Luas nya adalah "+segitiga1.getLuas());
        System.out.println("Keliling nya adalah "+segitiga1.getKeliling());
        System.out.println("==============================");
        
        Segitiga segitiga2 = new Segitiga();
        segitiga2.alas = 30;
        segitiga2.tinggi = 10;
        segitiga2.sisi = 90;
        System.out.println("Alas "+segitiga2.alas+" Tinggi "+segitiga2.tinggi+" Sisi "+segitiga2.sisi);
        System.out.println("Luas nya adalah "+segitiga2.getLuas());
        System.out.println("Keliling nya adalah "+segitiga2.getKeliling());
        System.out.println("==============================");
        
        Segitiga segitiga3 = new Segitiga();
        segitiga3.alas = 20;
        segitiga3.tinggi = 30;
        segitiga3.sisi = 60;
        System.out.println("Alas "+segitiga3.alas+" Tinggi "+segitiga3.tinggi+" Sisi "+segitiga3.sisi);
        System.out.println("Luas nya adalah "+segitiga3.getLuas());
        System.out.println("Keliling nya adalah "+segitiga3.getKeliling());
        System.out.println("==============================");
        
        Segitiga segitiga4 = new Segitiga();
        segitiga4.setAlas(50);
        segitiga4.setTinggi(60);
        segitiga4.setSisi(40);
        System.out.println("Alas "+segitiga4.alas+" Tinggi "+segitiga4.tinggi+" Sisi "+segitiga4.sisi);
        System.out.println("Luas nya adalah "+segitiga4.getLuas());
        System.out.println("Keliling nya adalah "+segitiga4.getKeliling());
    }
}
