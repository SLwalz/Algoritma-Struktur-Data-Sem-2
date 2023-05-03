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
public class NasabahMain22e {
    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("-------------------------------");
    }
    
    public static void main(String[] args) {
        Scanner kemal22 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = kemal22.nextInt();
        Nasabah22e antri = new Nasabah22e(jumlah); 
        int pilih, max;
        
        do{
            menu();
            pilih = kemal22.nextInt();
            kemal22.nextLine();
            switch (pilih) {
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
                    
                    Nasabah22e nb = new Nasabah22e(norek, nama, alamat, umur, saldo);
                    kemal22.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah22e data = antri.Dequeue();
                    if(!"".equals(data.norek22e)&& !"".equals(data.nama22e) && !"".equals(data.alamat22e)
                                    && data.umur22e != 0 && data.saldo22e != 0){
                        System.out.println("Antrian yang keluar: "+data.norek22e+" "+data.nama22e+" "+
                                    data.alamat22e+" "+data.umur22e+" "+data.saldo22e);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
