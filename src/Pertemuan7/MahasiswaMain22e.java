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
    public int input;
    public static void main(String[] args) {
        Scanner kemal22 = new Scanner(System.in);
        Scanner kemal22e = new Scanner(System.in);
        
       
        System.out.print("Masukkan banyak data mahasiswa yang diingikan : ");
        int jumMhas22e = kemal22.nextInt();
        int counter=0;
        PencarianMhs22e data22e = new PencarianMhs22e(jumMhas22e);
        System.out.println("----------------------------------------------");
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
            counter++;
            //merge sort
            if (counter==jumMhas22e){
                data22e.mergeSort22e(m, jumMhas22e);
            }
        }
        
        System.out.println("----------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa: ");
        data22e.tampil();
        System.out.println("SEARCH DATA");
        System.out.println("1. dengan NIM dan sequential search");
        System.out.println("2. dengan nama dan sequential search");
        System.out.println("3. dengan NIM dan binary search");
        int ulang = 1;

        do {
        ulang = 1;
        System.out.print("MENU : ");
        int menu22e = kemal22.nextInt();
        switch (menu22e){
            case 1:
            System.out.println("_____________________________________________");
            System.out.println("_____________________________________________");
            System.out.println("Masukkan NIM Mahasiswa yang dicari : ");
            System.out.print("NIM: ");
            int cari22e = kemal22e.nextInt();
            int posisi22e = data22e.FindSeqSearch22e(cari22e);
            data22e.TampilPosisi22e(cari22e, posisi22e);
            data22e.TampilData22e(cari22e, posisi22e);
            break;
            
            case 2:
            System.out.println("_____________________________________________");
            System.out.println("_____________________________________________");
            System.out.println("Masukkan Nama Mahasiswa yang dicari : ");
            System.out.print("Nama: ");
            String cariNama22e = kemal22e.nextLine();
            int posisiNama22e = data22e.FindSeqByName22e(cariNama22e);
            data22e.TampilPosisiByName22e(cariNama22e, posisiNama22e);
            data22e.TampilDataByName22e(cariNama22e, posisiNama22e);
            break;

            case 3:
            System.out.println("_____________________________________________");
            System.out.println("_____________________________________________");
            System.out.println("Masukkan NIM Mahasiswa yang dicari : ");
            System.out.print("NIM: ");
            int cariBinary22e = kemal22e.nextInt();
            int posisiBinary22e = data22e.FindBinarySearch22e(cariBinary22e, 0, jumMhas22e - 1);
            data22e.TampilPosisi22e(cariBinary22e, posisiBinary22e);
            data22e.TampilData22e(cariBinary22e, posisiBinary22e);
            break;

            default:
            System.out.println("pilih menu yanng ada saja");
            ulang=0;
            }
        } while (ulang==0);
    }
}
