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
public class MainLatihanPraktikum22e {
    public static void main(String[] args) {
        int i = 0;
        Scanner kemal22 = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("\tSISTEM PEMILIHAN SUARA BEM");
        System.out.println("===============================================");
        System.out.print("Masukkan jumlah pemberi suara : ");
        int elemen22e = kemal22.nextInt();
        LatihanPraktikum22e penyuara = new LatihanPraktikum22e(elemen22e);
        
        System.out.println("\n\tkandidat:");
        System.out.println("1. Rani \t3. Inglis\n2. Chloe \t4. Riku");
        System.out.println("===============================================");
        System.out.println("Silahkan vote menggunakan angka yang ada");
        
        do {
        int suara22e = kemal22.nextInt();
        switch (suara22e) {
            case 1:
                penyuara.voting22e[i]="Rani";
                i++;
                break;
            case 2:
                penyuara.voting22e[i]="Inglis";
                i++;
                break;
            case 3:
                penyuara.voting22e[i]="Chloe";
                i++;
                break;
            case 4:
                penyuara.voting22e[i]="Riku";
                i++;
                break;
            default:
                System.out.println("pilih kandidat yang ada");
        }
        
        } while (i < elemen22e);

        System.out.println("===============================================");
        System.out.println("Pemenang dari voting kali ini adalah "+penyuara.penghitungNama22e(penyuara.voting22e, 0, elemen22e - 1));
        System.out.println("===============================================");
    }
}
