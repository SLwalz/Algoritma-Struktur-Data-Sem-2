/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author Farisa
 */
import java.util.Scanner;
public class MainMahasiswa {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi22E list22e = new DaftarMahasiswaBerprestasi22E();
        Mahasiswa22E m1 = new Mahasiswa22E("Nusa", 2017, 25, 3);
        Mahasiswa22E m2 = new Mahasiswa22E("Rara", 2012, 19, 4);
        Mahasiswa22E m3 = new Mahasiswa22E("Dompu", 2018, 19, 3.5);
        Mahasiswa22E m4 = new Mahasiswa22E("Abdul", 2017, 23, 2);
        Mahasiswa22E m5 = new Mahasiswa22E("Ummi", 2019, 21, 3.75);
        
        list22e.tambah(m1);
        list22e.tambah(m2);
        list22e.tambah(m3);
        list22e.tambah(m4);
        list22e.tambah(m5);
        
        System.out.println("Data Mahasiswa sebelum sorting = ");
        list22e.tampil();
        
//        System.out.println("Data Mahasiswa setelah sorting desc berdasarkan ipk");
//        list22e.bubbleSort();
//        list22e.tampil();
//        
//        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan ipk");
//        list22e.selectionSort();
//        list22e.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan ipk");
        list22e.insertionSort();
        list22e.tampil();
    }
}
