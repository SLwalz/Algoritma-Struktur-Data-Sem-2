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
public class MainHotel22E {
    public static void main(String[] args) {
        Scanner kemal22e = new Scanner(System.in);
        HotelService22E daftar22e = new HotelService22E();
        
        Hotel22E hotel1 = new Hotel22E("Nusa Jaya", "BukitTinggi", 220000, 4);
        Hotel22E hotel2 = new Hotel22E("Grand Dafam", "Jember", 160000, 4);
        Hotel22E hotel3 = new Hotel22E("Heisenberg", "New Jersey", 3020500, 5);
        Hotel22E hotel4 = new Hotel22E("Pinkman", "Bangkok", 470000, 5);
        Hotel22E hotel5 = new Hotel22E("Crippled Only", "Ohio", 100500, 3);
        
        daftar22e.tambahHotel22e(hotel1);
        daftar22e.tambahHotel22e(hotel2);
        daftar22e.tambahHotel22e(hotel3);
        daftar22e.tambahHotel22e(hotel4);
        daftar22e.tambahHotel22e(hotel5);

        System.out.println("Hotel List");
        int menu22e;
        int ulang22e =1;
        do {
        System.out.println("============================");
        System.out.println("Urutkan Secara?");
        System.out.println("1. bintang dengan bubble sort");
        System.out.println("2. bintang dengan selection sort");
        System.out.println("3. harga dengan bubble sort");
        System.out.println("4. harga dengan selection sort");
        System.out.println("0. keluar");
        menu22e=kemal22e.nextInt();
        System.out.println("============================");
        switch (menu22e) {
            case 1:
            System.out.println("Pengurutan bintang dengan bubble sort");
            daftar22e.bubbleSortBintang();
            daftar22e.tampilAll22e();
            ulang22e=0;
            break;
        case 2:
            System.out.println("Pengurutan bintang dengan selection sort");
            daftar22e.selectionSortBintang();
            daftar22e.tampilAll22e();
            ulang22e=0;
            break;
        case 3:
            System.out.println("Pengurutan harga dengan bubble sort");
            daftar22e.bubbleSortHarga();
            daftar22e.tampilAll22e();
            ulang22e=0;
            break;
        case 4:
            System.out.println("Pengurutan harga dengan selection sort");
            daftar22e.selectionSortHarga();
            daftar22e.tampilAll22e();
            ulang22e=0;
            break;
        case 0:
            ulang22e=1;
            break;
        default:
            System.out.println("pilih menu 1 - 4");
            ulang22e=0;
            }
            System.out.println("============================");
        } while (ulang22e == 0);
    }
}
