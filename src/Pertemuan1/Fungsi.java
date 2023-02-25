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
public class Fungsi {
    static int terlama22e, terbaru22e, deretFibo22e;

    static int perulangan (int banyak22e){
        terlama22e = 1;
        terbaru22e = 0;
        deretFibo22e = 1;
        for (int i = 0; i < banyak22e; i++){
            System.out.print(terbaru22e + ", ");
            deretFibo22e = terlama22e + terbaru22e;
            terlama22e = terbaru22e;
            terbaru22e = deretFibo22e;
        }
        return banyak22e;
    }

    static int rekursif22e(int banyak22e){
        if(banyak22e == 0 || banyak22e == 1){
        return banyak22e;
        } else {
        return (rekursif22e(banyak22e-1) + rekursif22e(banyak22e-2));
        }
    }

    public static void main(String[]args){
    int banyak22e, menu22e, ulang22e=0, j=0;
    Scanner kemal22e = new Scanner(System.in);
    do {
    System.out.print("Masukkan jumlah : ");
    banyak22e = kemal22e.nextInt();
    System.out.println("pilih mode\n1. perulangan\n2. rekursif");
    menu22e=kemal22e.nextInt();
    
    switch (menu22e){
        case 1:
        perulangan(banyak22e);
        break;
        case 2:
        for (int i=0; i < banyak22e; i++){
            System.out.print(rekursif22e(j)+", ");
            j++;
            }
        System.out.println();
        break;
        default:
            ulang22e=1;
            }
        } while(ulang22e==1);
    }
}