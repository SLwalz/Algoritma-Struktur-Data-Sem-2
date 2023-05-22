/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan12.Tugas;

/**
 *
 * @author Farisa
 */
import java.util.Scanner;
public class Tugas1Main_22E {
    
    public static void menu(){
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++++++");
    }
    public static void main(String[] args) throws Exception {
        Tugas1_method_22E antrian = new Tugas1_method_22E();
        
        Scanner kemal22 = new Scanner(System.in);
        int ulang = 0;
        
        do {
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("  PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++++++");
        menu();
        int menu = kemal22.nextInt();
        
        switch (menu) {
            case 1:
                System.out.println("---------------------------------");
                System.out.println("Masukkan Data Penerima Vaksin");
                System.out.print("Nomor antrian : ");
                int nomor = kemal22.nextInt();
                System.out.print("Nama Penerima : ");
                String nama = kemal22.next();
                antrian.addLast(nomor, nama);
                break;
            case 2:
                antrian.removeFirst();
                break;
            case 3:
                System.out.println("---------------------------------");
                System.out.println("Daftar Pengantri Vaksin");
                System.out.println("---------------------------------");
                antrian.print();
                break;
            case 4:
                System.out.println("thank you");
                ulang=1;
                break;
            default:
                System.out.println("Masukkan menu yang ada");;
            }
        } while (ulang==0);
    }
}
