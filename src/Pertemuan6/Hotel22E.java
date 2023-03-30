/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author Farisa
 */
public class Hotel22E {
    String nama22e, kota22e;
    int harga22e;
    byte bintang22e;

    Hotel22E(String nm, String kt, int hrg, byte btg) {
        this.nama22e = nm;
        this.kota22e = kt;
        this.harga22e = hrg;
        this.bintang22e = btg;
    }
    
    void tampil22e(){
        System.out.println("Hotel "+nama22e);
        System.out.println("Kota "+kota22e);
        System.out.println("Harga per-malam = "+harga22e);
        System.out.println("Bintang : "+bintang22e);
    }
    
    
}
