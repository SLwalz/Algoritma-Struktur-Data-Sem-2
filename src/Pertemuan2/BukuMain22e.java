/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author Farisa
 */
import java.util.Scanner;
public class BukuMain22e {
    public static void main(String[] args) {
        int menu22e, ulang=0, banyak;
    Scanner kemal22e = new Scanner(System.in);
    do {
        System.out.println("pilih judul buku yang kamu mau");
        System.out.println("1. How Not to be Autistic");
        System.out.println("2. How to Get a GRILLfriend");
        System.out.println("3. Memes that Conquer the World");
        System.out.println("0. keluar");
        menu22e=kemal22e.nextInt();
        System.out.println("mau berapa  banyak?");
        banyak=kemal22e.nextInt();
        
        switch (menu22e){
            case 1:
        Buku22e buku1 = new Buku22e("How Not to be Autistic","Alan","Gramedia",120000,banyak);
        buku1.hitungHargaTotal();
        buku1.hitungDiskon();
        buku1.hitungHargaBayar();
        buku1.tampilBuku();
        ulang=1;
        break;
            case 2:
        Buku22e buku2 = new Buku22e("How to Get a GRILLfriend","Einstien","Elex",40000,banyak);
        buku2.hitungHargaTotal();
        buku2.hitungDiskon();
        buku2.hitungHargaBayar();
        buku2.tampilBuku();
        ulang=1;
        break;
            case 3:
        Buku22e buku3 = new Buku22e("Memes that Conquer the World","Rick Astley","Seven Seas Entertainment",10000,banyak);
        buku3.hitungHargaTotal();
        buku3.hitungDiskon();
        buku3.hitungHargaBayar();
        buku3.tampilBuku();
        ulang=1;
        break;
            case 0:
                System.out.println("thanks");
                ulang=0;
                break;
            default:
                System.out.println("PILIH JUDUL YANG ADA SAJA");
                System.out.println("============================");
                ulang=1;
        }
    } while (ulang==1);
    }
}
