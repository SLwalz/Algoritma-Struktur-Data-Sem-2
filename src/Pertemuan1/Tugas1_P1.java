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
public class Tugas1_P1 {
    public static void main (String args[]){
    Scanner kemal22 = new Scanner(System.in);
    int menu22e, ulang22e=0, total22e=0, dataLaundry22e[] = {4,15,6,11};
    String laundry22e[] = {"ani","budi","bina","cita"};
    do {
        System.out.println("SELAMAT DATANG DI SMILE LAUNDRY");
        System.out.println("===============================");
        System.out.println("1. Data laundry");
        System.out.println("2. Pendapatan");
        System.out.println("0. keluar");
        System.out.print("pilih menu: ");
        menu22e=kemal22.nextInt();
        System.out.println("===============================");
        switch (menu22e){
            case 1:
            System.out.println("nama\t| berat");
            for (int i=0;i<dataLaundry22e.length;i++){
                System.out.printf("%s\t| %d kg\n",laundry22e[i],dataLaundry22e[i]);
            }
            System.out.println("===============================");
            ulang22e=1;
            break;
            case 2:
            for (int i=0;i<dataLaundry22e.length;i++){
                int temp=0, temp2=0;
                if (dataLaundry22e[i]>10){
                    temp=dataLaundry22e[i]*4500;
                    temp2=temp*5/100;
                    temp=temp-temp2;
                    total22e+=temp;
                } else {
                    temp=dataLaundry22e[i]*4500;
                    total22e+=temp;
                }

            }
            System.out.printf("pendapatan yang didapat sebanyak Rp %d\n",total22e);
            System.out.println("===============================");
            ulang22e=1;
            break;
            case 0:
            System.out.println("THANK YOU");
            System.out.println("===============================");
            ulang22e=0;
            break;
        }
        } while (ulang22e==1);
    }
}