/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

public class Mahasiswa22e {
    int nim22e;
    String nama22e;
    int umur22e;
    double ipk22e;

    Mahasiswa22e(int ni, String n, int u, double i) {
        this.nim22e = ni;
        this.nama22e = n;
        this.umur22e = u;
        this.ipk22e = i;
    }

    Mahasiswa22e(int nim) {
        this.nim22e = nim;
    }
    
    void tampil22e(){
        System.out.println("Nim  = "+nim22e);
        System.out.println("Nama = "+nama22e);
        System.out.println("Umur = "+umur22e);
        System.out.println("IPK  = "+ipk22e);
    }    
}
