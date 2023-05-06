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
public class WarungMain {
    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Daftar Antrian baru");
        System.out.println("2. Check Out Antrian");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("6. Cek posisi anda");
        System.out.println("0. Keluar");
        System.out.println("-------------------------------");
    }
    
    public static void main(String[] args) {
        Scanner kemal22 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas Antrian: ");
        int jumlah = kemal22.nextInt();
        WarungQueue22e antri = new WarungQueue22e(jumlah); 
        int pilih;
        
        do{
            menu();
            pilih = kemal22.nextInt();
            kemal22.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = kemal22.next();
                    System.out.print("No HP: ");
                    int noHP = kemal22.nextInt();
                    
                    Pembeli22e nb = new Pembeli22e(nama, noHP);
                    kemal22.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Pembeli22e antrian = antri.Dequeue();
                    if(!"".equals(antrian.nama22e) && antrian.noHP22e != 0){
                        System.out.println("Antrian yang keluar: "
                                + ""+antrian.nama22e+" "+antrian.noHP22e);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.daftarPembeli();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("nama: ");
                    String name = kemal22.nextLine();
                    System.out.println("anda berada di posisi "
                            +antri.peekPosition(name) +" dari "+antri.size22e+" orang");
                    break;
                case 0:
                    System.out.println("THANK YOU");
                    pilih=0;
            }
        } while (pilih >= 1 && pilih <= 6);
    }
}
