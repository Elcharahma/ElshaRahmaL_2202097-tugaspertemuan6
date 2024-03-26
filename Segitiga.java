/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbokelasobjek.pertemuan6kelasobjek;

/**
 *
 * @author ELSHA
 */
public class Segitiga {
    double alas =1;
    double tinggi = 1;
    double sisi = 1;
    
    /*Mengembalikan Nilai Luas Segitiga*/
    double getLuas(){
        return alas * tinggi / 2;
    }
    
    /*Mengembalikan Nilai Keliling Segitiga*/
    double getKeliling(){
        double sisi_miring = Math.sqrt((alas*alas) + (tinggi*tinggi));
        return  alas + tinggi + sisi_miring;
    }
    
    void setAlas(double newAlas){
        alas = newAlas;
    }
    void setTinggi(double newTinggi){
        tinggi = newTinggi;
    }
    void setSisi(double newSisi){
        sisi = newSisi;
    }
}
