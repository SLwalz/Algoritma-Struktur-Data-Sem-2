/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author Farisa
 */
public class Mahasiswa22E {
    String nama22e;
    int thnMasuk22e, umur22e;
    double ipk22e;

    Mahasiswa22E(String n, int t, int u, double i) {
        this.nama22e = n;
        this.thnMasuk22e = t;
        this.umur22e = u;
        this.ipk22e = i;
    }
    
    void tampil(){
        System.out.println("Nama = "+nama22e);
        System.out.println("Tahun Masuk = "+thnMasuk22e);
        System.out.println("umur = "+umur22e);
        System.out.println("IPK = "+ipk22e);
    }
    
}
