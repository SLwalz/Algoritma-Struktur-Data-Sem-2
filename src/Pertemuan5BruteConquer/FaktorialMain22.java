/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5BruteConquer;

/**
 *
 * @author Farisa
 */
import java.time.LocalTime;
import java.util.*;
public class FaktorialMain22 {
    public static void main(String[] args) {
        Scanner kemal22 = new Scanner (System.in);
        System.out.println("==================================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = kemal22.nextInt();
        
        Faktorial22E [] fk22E = new Faktorial22E[elemen];
        for (int i=0;i<elemen;i++){
            fk22E[i]=new Faktorial22E();
            System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
            fk22E[i].nilai22E = kemal22.nextInt();
        }
        
        System.out.println("==================================================================");
        System.out.println("Hasil faktorial dengan Brute Force");
        for (int i=0;i<elemen;i++){
            System.out.println("Faktorial dari nilai "+fk22E[i].nilai22E+" adalah : "+fk22E[i].faktorialBF22E(fk22E[i].nilai22E));
        }

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);
        System.out.println("==================================================================");
        System.out.println("Hasil Faktorial dengan Divide dan Conquer");
        for (int i=0;i<elemen;i++){
            System.out.println("Faktorial dari nilai "+fk22E[i].nilai22E+" adalah : "+fk22E[i].faktorialDC22E(fk22E[i].nilai22E));
        }

        LocalTime currentTime2 = LocalTime.now();
        System.out.println("Current time: " + currentTime2);
        System.out.println("==================================================================");
    }
}
