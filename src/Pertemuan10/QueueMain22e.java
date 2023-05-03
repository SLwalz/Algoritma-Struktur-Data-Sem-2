/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10;

/**
 *
 * @author Farisa
 */
import java.util.Scanner;
public class QueueMain22e {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("--------------------------");
    }
    
    public static void main(String[] args) {
        Scanner kemal22 = new Scanner(System.in);
        int pilih;
        System.out.print("Masukkan kapasitas queue: ");
        int n = kemal22.nextInt();
        
        Queue22e Q = new Queue22e(n);
//        do {
            do {
        menu();
        pilih = kemal22.nextInt();
        switch (pilih) {
            case 1:
                System.out.print ("Masukkan data baru: ");
                int dataMasuk = kemal22.nextInt();
                Q.Enqueue (dataMasuk);
                break;
            case 2:
                int dataKeluar = Q.Dequeue();
                if (dataKeluar != 0) {
                System.out.println("Data yang dikeluarkan: " + dataKeluar);
                break;
                }
            case 3:
                Q.print();
                break;
            case 4:
                Q.peek();
                break;
            case 5:
                Q.clear();
                break;
                } 
            } while(Q.keluar22e == 0);
//        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
