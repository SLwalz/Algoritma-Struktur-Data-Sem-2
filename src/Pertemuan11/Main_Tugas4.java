/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan11;

/**
 *
 * @author Farisa
 */
import java.util.Scanner;
public class Main_Tugas4 {
    
    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek semua antrian");
        System.out.println("4. Keluar");
        System.out.println("-------------------------------");
    }
    
    public static void main(String[] args) {
        SSL_Tugas4 antri = new SSL_Tugas4();
        Scanner kemal22 = new Scanner(System.in);
        int counter = 0;
        int keluar = 0;
        do{
            menu();
            int menu = kemal22.nextInt();
            kemal22.nextLine();
            switch (menu) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = kemal22.nextLine();
                    System.out.print("Nama: ");
                    String nama = kemal22.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = kemal22.nextLine();
                    System.out.print("Umur: ");
                    int umur = kemal22.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = kemal22.nextDouble();
                    counter++;
                    kemal22.nextLine();
                    if(counter==1){
                        antri.addLast(norek, nama, 
                                alamat, umur, saldo);
                    } else {
                        antri.addFirst(norek, nama, 
                                alamat, umur, saldo);
                    }
                    break;
                    
                case 2:
                    antri.removeFirst();
                    break;
                case 3:
                    antri.print();
                    break;
                case 4:
                    keluar=1;
                    break;
            }
        } while (keluar==0);
    }
}
