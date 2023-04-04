/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author Farisa%
 */
import java.util.Scanner;
public class MahasiswaMain22e {
    public static void main(String[] args) {
        Scanner kemal22 = new Scanner(System.in);
        Scanner kemal22e = new Scanner(System.in);
        
        PencarianMhs22e data22e = new PencarianMhs22e();
        int jumMhas22e = 5;
        
        System.out.println("----------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil");
        for (int i = 0; i < jumMhas22e; i++){
            System.out.println("--------------");
            System.out.print("Nim\t: ");
            int nim22e = kemal22.nextInt();
            System.out.print("Nama\t: ");
            String nama22e = kemal22e.nextLine();
            System.out.print("Umur\t: ");
            int umur22e = kemal22.nextInt();
            System.out.print("IPK\t: ");
            double ipk22e = kemal22.nextDouble();
            
            Mahasiswa22e m = new Mahasiswa22e(nim22e, nama22e, umur22e, ipk22e);
            data22e.tambah(m);
        }
        
        System.out.println("----------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa: ");
        data22e.tampil();
        
         System.out.println("_____________________________________________");
         System.out.println("_____________________________________________");
         System.out.println("Pencarian data : ");
         System.out.println("Masukkan Nim Mahasiswa yang dicari : ");
         System.out.print("NIM : ");
         int cari22e = kemal22.nextInt();
         System.out.println("menggunakan sequential Search");
         int posisi22e = data22e.FindSeqSearch22e(cari22e);
         
         data22e.TampilPosisi22e(cari22e, posisi22e);
         data22e.TampilData22e(cari22e, posisi22e);
         
         System.out.println("==============================================");
         System.out.println("menggunakan binary Search");
         posisi22e = data22e.FindBinarySearch22e(cari22e, 0, jumMhas22e - 1);
         
         data22e.TampilPosisi22e(cari22e, posisi22e);
         data22e.TampilData22e(cari22e, posisi22e);
    }
    
}
