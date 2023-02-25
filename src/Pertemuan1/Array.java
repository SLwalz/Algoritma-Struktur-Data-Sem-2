/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1;

/**
 *
 * @author Farisa
 */
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner kemal22 = new Scanner(System.in);
        int menu22e, cabang22e, ulangi22e=0, ulang22e=0;
        int[][] stok22e={{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};
        do {
        System.out.println("Toko Bunga RoyalGarden");
        System.out.println("=========================");
        System.out.println("1. jumlah stok seluruh cabang");
        System.out.println("2. hitung pendapatan");
        System.out.println("3. update stok bunga");
        System.out.print("pilih menu = ");
        menu22e=kemal22.nextInt();
        System.out.println("=========================");
        switch (menu22e){
            case 1:
            int aglonema22e=0, keladi22e=0, alocasia22e=0, mawar22e=0;
                for(int i=0;i<stok22e[0].length;i++){
                    aglonema22e+=stok22e[i][0];
                }
                for(int i=0;i<stok22e[0].length;i++){
                    keladi22e+=stok22e[i][1];
                }
                for(int i=0;i<stok22e[0].length;i++){
                    alocasia22e+=stok22e[i][2];
                }
                for(int i=0;i<stok22e[0].length;i++){
                    mawar22e+=stok22e[i][3];
                }

                System.out.printf("Stok\nAglonema=%d\nKeladi=%d\nAlocasia=%d\nMawar=%d\n",aglonema22e,keladi22e,alocasia22e,mawar22e);
                System.out.println("=========================");
                System.out.println("0. akhiri program");
                System.out.println("1. kembali ke menu");
                ulangi22e=kemal22.nextInt();
            break;




            case 2:
            do{
                int aglonemaHarga22e=0, keladiHarga22e=0, alocasiaHarga22e=0, mawarHarga22e=0, total22e=0;
                System.out.println("pilih cabang RoyalGarden(1-4)");
                cabang22e=kemal22.nextInt();
                switch (cabang22e){
                    case 1:
                        aglonemaHarga22e=stok22e[0][0]*75000;
                        keladiHarga22e=stok22e[0][1]*50000;
                        alocasiaHarga22e=stok22e[0][2]*60000;
                        mawarHarga22e=stok22e[0][3]*10000;  
                        total22e=aglonemaHarga22e+keladiHarga22e+alocasiaHarga22e+mawarHarga22e;
                        System.out.println("total Rp "+total22e);
                        ulang22e = 0;
                    break;
                    case 2:
                        aglonemaHarga22e=stok22e[1][0]*75000;
                        keladiHarga22e=stok22e[1][1]*50000;
                        alocasiaHarga22e=stok22e[1][2]*60000;
                        mawarHarga22e=stok22e[1][3]*10000;
                        total22e=aglonemaHarga22e+keladiHarga22e+alocasiaHarga22e+mawarHarga22e;
                        System.out.println("total Rp "+total22e);
                        ulang22e = 0;
                    break;
                    case 3:
                        aglonemaHarga22e=stok22e[2][0]*75000;
                        keladiHarga22e=stok22e[2][1]*50000;
                        alocasiaHarga22e=stok22e[2][2]*60000;
                        mawarHarga22e=stok22e[2][3]*10000;
                        total22e=aglonemaHarga22e+keladiHarga22e+alocasiaHarga22e+mawarHarga22e;
                        System.out.println("total Rp "+total22e);
                        ulang22e = 0;
                    break;
                    case 4:
                        aglonemaHarga22e=stok22e[3][0]*75000;
                        keladiHarga22e=stok22e[3][1]*50000;
                        alocasiaHarga22e=stok22e[3][2]*60000;
                        mawarHarga22e=stok22e[3][3]*10000;
                        total22e=aglonemaHarga22e+keladiHarga22e+alocasiaHarga22e+mawarHarga22e;
                        System.out.println("total Rp "+total22e);
                        ulang22e = 0;
                    break;
                    default:
                        ulang22e = 1;
                        System.out.println("masukkan nomor 1-4");
                }
            } while(ulang22e==1);
            System.out.println("=========================");
            System.out.println("0. akhiri program");
            System.out.println("1. kembali ke menu");
            ulangi22e=kemal22.nextInt();
            break;
            case 3:
                int mengulang22e=0;
                System.out.print("apa anda yakin untuk mengupdate? (1/0)");
                mengulang22e=kemal22.nextInt();
                while (mengulang22e==1){
                stok22e[0][0]-=1;
                stok22e[0][1]-=2;
                stok22e[0][3]-=5;
                mengulang22e=0;
                }
                System.out.println("=========================");
                System.out.println("0. akhiri program");
                System.out.println("1. kembali ke menu");
                ulangi22e=kemal22.nextInt();
            break;

            default:
            System.out.println("pilih menu yang ada");
            ulang22e=1;
            break;
            
            }
        } while (ulangi22e==1);
        System.out.println("=========================");
        System.out.println("THANK YOU!!");
    }
}