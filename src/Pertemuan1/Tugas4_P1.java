package Pertemuan1;
import java.util.Scanner;
public class Tugas4_P1 {
    static double panjang22e, tinggi22e, lebar22e, ulang22e=0, luas22e, jari22e;
    public static void main (String args[]){
        int menu22;
    Scanner kemal22 = new Scanner(System.in);
    do {
    System.out.println("1. hitung luas segitiga");
    System.out.println("2. hitung luas persegi");
    System.out.println("3. hitung luas lingkaran");
    System.out.print("pilih menu = ");
    menu22=kemal22.nextInt();
    System.out.println("=============================");
    switch (menu22){
        case 1:
        System.out.print("masukkan panjang alas : ");
        panjang22e=kemal22.nextDouble();
        System.out.print("masukkan tinggi : ");
        tinggi22e=kemal22.nextDouble();
        segitiga();
        System.out.println("=============================");
        System.out.println("luas segitiga "+luas22e);
        menu();
        break;

        case 2:
        System.out.print("masukkan panjang : ");
        panjang22e=kemal22.nextDouble();
        System.out.print("masukkan lebar : ");
        lebar22e=kemal22.nextDouble();
        persegi();
        System.out.println("=============================");
        System.out.println("luas persegi panjang "+luas22e);
        menu();
        break;

        case 3:
        System.out.print("masukkan jari jari : ");
        jari22e=kemal22.nextDouble();
        lingkaran();
        System.out.println("=============================");
        System.out.println("luas lingkaran "+luas22e);
        menu();
        break;

        default:
        System.out.println("menu salah");
        ulang22e=1;
            }
        } while (ulang22e == 1);
    }
    static double segitiga (){
        luas22e=panjang22e*tinggi22e/2;
        return luas22e;
    }
    static double persegi (){
        luas22e=panjang22e*lebar22e;
        return luas22e;
    }
    static double lingkaran (){
        luas22e=jari22e*jari22e*22/7;
        return luas22e;
    }
    static double menu (){
        Scanner kemal22 = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("1. kembali ke menu");
        System.out.println("0. akhiri program");
        ulang22e=kemal22.nextDouble();
        return ulang22e;
    }
}
