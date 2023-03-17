/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5BruteConquer;

/**
 *
 * @author Farisa
 */
import java.util.*;
public class MainPangkat22e {
    public static void main(String[] args) {
        Scanner kemal22 = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = kemal22.nextInt();
        
        Pangkat22E[] png22e = new Pangkat22E[elemen];
        
        for (int i=0;i<elemen;i++){
            png22e[i]=new Pangkat22E();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
            png22e[i].nilai22e = kemal22.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
            png22e[i].pangkat22e = kemal22.nextInt();
        }
        
        System.out.println("====================================================");
        System.out.println("Hasil Pangkat dengan Brute Force");
        for (int i=0;i<elemen;i++){
            System.out.println("Nilai "+png22e[i].nilai22e+" pangkat "+png22e[i].pangkat22e+" adalah : "+png22e[i].pangkatBF22e(png22e[i].nilai22e, png22e[i].pangkat22e));
        }
        System.out.println("====================================================");
        System.out.println("Hasil Pangkat dengan Divide Conquer");
        for (int i=0;i<elemen;i++){
            System.out.println("Nilai "+png22e[i].nilai22e+" pangkat "+png22e[i].pangkat22e+" adalah : "+png22e[i].pangkatDC22e(png22e[i].nilai22e, png22e[i].pangkat22e));
        }
        System.out.println("====================================================");
    }
}
