/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1;

import java.util.Scanner;

/**
 *
 * @author Farisa
 */
public class Perulangan {
    public static void main (String args[]){
        Scanner kemal22 = new Scanner (System.in);
        long nim22e;
        String hari22e[]={"senin","selasa","rabu","kamis","jumat","sabtu","minggu"};
        System.out.println("masukkan nim = ");
        nim22e=kemal22.nextLong();
        nim22e = nim22e%100;
        if(nim22e<10){
            nim22e+=10;
        }
        for (int i=0;i<nim22e;i++){
            System.out.println(hari22e[i%7]+" ");
        }
    }
}
