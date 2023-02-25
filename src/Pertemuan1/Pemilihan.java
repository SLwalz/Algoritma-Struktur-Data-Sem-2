/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan1;

/**
 *
 * @author Farisa
 */
import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        Scanner kemal22 = new Scanner(System.in);
        double tugas22e, uts22e, uas22e, nilaiAkhir22e;
        String nilaiHuruf22e="k", status22e="E";
        System.out.println("Program Penghitungan Nilai");
        System.out.println("==========================");
        System.out.print("Nilai Tugas = ");
        tugas22e=kemal22.nextDouble();
        System.out.print("Nilai UTS   = ");
        uts22e=kemal22.nextDouble();
        System.out.print("NIlai UAS   = ");
        uas22e=kemal22.nextDouble();
        nilaiAkhir22e=tugas22e*2/10+uts22e*35/100+uas22e*45/100;
        System.out.println("==========================");
        if (nilaiAkhir22e>80 && nilaiAkhir22e<=100){
            nilaiHuruf22e="A";
            status22e="LULUS";
        } else if(nilaiAkhir22e>73 && nilaiAkhir22e<=80){
            nilaiHuruf22e="B+";
            status22e="LULUS";
        } else if(nilaiAkhir22e>65 && nilaiAkhir22e<=73){
            nilaiHuruf22e="B";
            status22e="LULUS";
        } else if(nilaiAkhir22e>60 && nilaiAkhir22e<=65){
            nilaiHuruf22e="C+";
            status22e="LULUS";
        } else if(nilaiAkhir22e>50 && nilaiAkhir22e<=60){
            nilaiHuruf22e="C";
            status22e="LULUS";
        } else if(nilaiAkhir22e>39 && nilaiAkhir22e<=50){
            nilaiHuruf22e="D";
            status22e="TIDAK LULUS";
        } else if(nilaiAkhir22e<=39){
            nilaiHuruf22e="E";
            status22e="TIDAK LULUS";
        }
        System.out.printf("nilai akhir = %f \n",nilaiAkhir22e);
        System.out.printf("nilai huruf = %s \n",nilaiHuruf22e);
        System.out.println("==========================");
        System.out.println("ANDA "+status22e);
    }
}
