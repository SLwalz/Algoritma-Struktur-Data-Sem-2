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
public class MainSum22e {
    public static void main(String[] args) {
        Scanner kemal22 = new Scanner (System.in);
        System.out.println("==============================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = kemal22.nextInt();
        
        Sum22e sm22e = new Sum22e(elm);
        System.out.println("==============================================");
        for (int i = 0; i < sm22e.elemen22e; i++){
            System.out.print("Masukkan untung bulan ke - "+(i+1)+" = ");
            sm22e.keuntungan22e[i] = kemal22.nextDouble();
        }
        
        System.out.println("==============================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+sm22e.elemen22e+" bulan adalah = "+sm22e.totalBF22e(sm22e.keuntungan22e));
        System.out.println("==============================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama "+sm22e.elemen22e+" bulan adalah = "+sm22e.totalDC22e(sm22e.keuntungan22e, 0, sm22e.elemen22e-1));
    }
}
