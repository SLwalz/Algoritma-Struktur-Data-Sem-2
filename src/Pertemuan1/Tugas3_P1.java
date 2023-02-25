package Pertemuan1;

import java.util.Scanner;

public class Tugas3_P1 {
    public static void main (String args []){
        int angka22e, ulang=2, kelipatan4=4;
        Scanner kemal22 = new Scanner (System.in);
        System.out.print("input angka : ");
        angka22e=kemal22.nextInt();
        for (int i=0;i<angka22e;i++){
            if (ulang==kelipatan4){
                kelipatan4+=4;
                ulang+=2;
                System.out.print(ulang+", ");
            } else {
                System.out.print(ulang+", ");
            }
            ulang+=2;
        }
    }
}
