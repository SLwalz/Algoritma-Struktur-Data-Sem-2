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
public class Tugas2Main_22E {
    public static void menu (){
        System.out.println("================================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("================================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data di Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("0. Keluar");
        System.out.println("================================");
    }
    
    public static void main(String[] args) throws Exception{
        Tugas2_method_22E film = new Tugas2_method_22E();
        
        Scanner kemal22 = new Scanner(System.in);
        int id22e, rate22e, index, ulang = 0;
        String judul22e;

        do {
            menu();
            int menu = kemal22.nextInt();
        switch (menu) {
            case 1:
                System.out.print("ID : ");
                id22e = kemal22.nextInt();
                System.out.print("Judul : ");
                judul22e = kemal22.next();
                System.out.print("Rating : ");
                rate22e = kemal22.nextInt();
                
                film.addFirst(id22e, judul22e, rate22e);
                break;
            case 2:
                System.out.print("ID : ");
                id22e = kemal22.nextInt();
                System.out.print("Judul : ");
                judul22e = kemal22.next();
                System.out.print("Rating : ");
                rate22e = kemal22.nextInt();
                
                film.addLast(id22e, judul22e, rate22e);
                break;
            case 3:
                System.out.print("Masukkan ke index : ");
                index = kemal22.nextInt();
                System.out.print("ID : ");
                id22e = kemal22.nextInt();
                System.out.print("Judul : ");
                judul22e = kemal22.next();
                System.out.print("Rating : ");
                rate22e = kemal22.nextInt();
                
                film.add(id22e, judul22e, rate22e, index);
                break;
            case 4:
                film.removeFirst();
                break;
            case 5:
                film.removeLast();
                break;
            case 6:
                System.out.print("Masukkan index : ");
                index = kemal22.nextInt();
                film.remove(index);
                break;
            case 7:
                film.print();
                break;
            case 8:
                System.out.print("Masukkan ID : ");
                id22e = kemal22.nextInt();
                film.search(id22e);
                break;
            case 9:
                film.urut();
                break;
            case 0:
                System.out.println("thank you");
                ulang=1;
                break;
            default:
                System.out.println("masukkan menu yang tersedia");
            }
        } while (ulang==0);
    }
}
