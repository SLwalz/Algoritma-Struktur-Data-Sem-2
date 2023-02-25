/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author Farisa
 */
public class Buku22e {
    String nama22e, pengarang22e, penerbit22e; 
    int hargaSatuan22e, jumlah22e, total22e, diskon22e;
    
    Buku22e(){
    }
    
    Buku22e(String nm, String pgrg, String pnb, int hrg, int jml){
        nama22e=nm;
        pengarang22e=pgrg;
        penerbit22e=pnb;
        hargaSatuan22e=hrg;
        jumlah22e=jml;
    }
    
    void tampilBuku(){
        System.out.println("nama : "+nama22e);
        System.out.println("pengarang : "+pengarang22e);
        System.out.println("penerbit : "+penerbit22e);
        System.out.println("harga satuan : "+hargaSatuan22e);
        System.out.println("jumlah yang dibeli : "+jumlah22e);
        System.out.println("harga yang dibayar : "+total22e);
        System.out.println("====================");
        
    }   
    
    int hitungHargaTotal(){
         total22e=hargaSatuan22e*jumlah22e;
         return total22e;
    }
    
    int hitungDiskon(){
        if (total22e>100000){
            diskon22e=total22e/10;
        } else if(total22e>=50000 && total22e<=100000) {
            diskon22e=total22e*5/100;
        } 
        return total22e;
    }
    
    int hitungHargaBayar(){
        total22e-=diskon22e;
        return total22e;
    }
}
