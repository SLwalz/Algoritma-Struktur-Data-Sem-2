/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author Farisa
 */
import java.util.Scanner;
public class PersegiPanjan22e {
    public int panjang22e;
    public int lebar22e;
    public static void main(String[] args) {
        Scanner kemal22 = new Scanner(System.in);
        PersegiPanjan22e[] ppArray = new PersegiPanjan22e[3];
        
        
        
        for (int i=0;i<ppArray.length;i++){
            ppArray[i]= new PersegiPanjan22e();
            System.out.println("Persegi panjang ke-"+i);
            System.out.println("masukkan penjang : ");
            ppArray[i].panjang22e=kemal22.nextInt();
            System.out.println("masukkan lebar : ");
            ppArray[i].lebar22e=kemal22.nextInt();
        }
        ppArray[0]=new PersegiPanjan22e();
        
        for (int i=0;i<ppArray.length;i++){
            System.out.println("persegi panjang ke-"+i);
            System.out.println("panjang: "+ppArray[i].panjang22e+", lebar: "+ppArray[i].lebar22e);
            
        }
    }
}
//ppArray[0]=new PersegiPanjan22e();
//        ppArray[0].panjang22e=110;
//        ppArray[0].lebar22e=30;
//        
//        ppArray[1]=new PersegiPanjan22e();
//        ppArray[1].panjang22e=80;
//        ppArray[1].lebar22e=40;
//        
//        ppArray[2]=new PersegiPanjan22e();
//        ppArray[2].panjang22e=100;
//        ppArray[2].lebar22e=20;
//        
//        System.out.println("Persegi panjang ke-0, panjang: "+ppArray[0].panjang22e+", lebar: "+ppArray[0].lebar22e);
//        System.out.println("Persegi panjang ke-1, panjang: "+ppArray[1].panjang22e+", lebar: "+ppArray[1].lebar22e);
//        System.out.println("Persegi panjang ke-2, panjang: "+ppArray[2].panjang22e+", lebar: "+ppArray[2].lebar22e);
