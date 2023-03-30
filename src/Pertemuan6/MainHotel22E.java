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
        HotelService22E daftar22e[] = new HotelService22E[5];
        String namaHotel22e, kotaHotel22e;
        int hargaHotel22e;
        byte bintangHotel22e;
        
        for (int i = 0; i < 5; i++){
        System.out.print("nama hotel : ");
        namaHotel22e=kemal22e.nextLine();
        System.out.print("nama kota : ");
        kotaHotel22e=kemal22e.nextLine();
        System.out.print("harga hotel : ");
        hargaHotel22e=kemal22e.nextInt();
        System.out.print("bintang hotel : ");
        bintangHotel22e=kemal22e.nextByte();
        
        }
    }
}
