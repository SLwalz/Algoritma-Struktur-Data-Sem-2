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
public class MainBangunRuang22e {
    public static void main(String[] args) {
        Scanner kemal22e= new Scanner(System.in);
        int menu22e, counter=100;
        double jari, miring, alas, tinggi;
        
        MainBangunRuang22e[] bangunRuang=new MainBangunRuang22e[100];
        
        System.out.println("pilih bangun ruang\n1. kerucut\n2. limas persegi\n3. bola");
        menu22e=kemal22e.nextInt();
        switch (menu22e){
            case 1:
                System.out.println("input jari jari : ");
                jari=kemal22e.nextDouble();
                System.out.println("input sisi miring :");
                miring=kemal22e.nextDouble();
                Kerucut22e kerucut1=new Kerucut22e(jari, miring);
                System.out.println("1. volume\n2. luas permukaan");
                menu22e=kemal22e.nextInt();
                switch (menu22e){
                    case 1: 
                        System.out.println("volume = "+kerucut1.hitungVolumeKerucut());
                    break;
                    case 2:
                        System.out.println("luas permukaan = "+kerucut1.hitungLuasKerucut());
                    break;
                }
            break;
            case 2:
                System.out.println("input alas : ");
                alas=kemal22e.nextDouble();
                System.out.println("input tinggi : ");
                tinggi=kemal22e.nextDouble();
                LimasSegiempat22e limas1 = new LimasSegiempat22e(alas, tinggi);
                System.out.println("1. volume\n2. luas permukaan");
                menu22e=kemal22e.nextInt();
                switch (menu22e){
                    case 1: 
                        System.out.println("volume = "+limas1.hitungVolumeLimas());
                    break;
                    case 2:
                        System.out.println("luas permukaan = "+limas1.hitungLuasLimas());
                    break;
                }
            break;
            case 3:
                System.out.println("input jari-jari : ");
                jari=kemal22e.nextDouble();
                Bola22e bola1 = new Bola22e(jari);
                System.out.println("1. volume\n2. luas permukaan");
                menu22e=kemal22e.nextInt();
                switch (menu22e){
                    case 1: 
                        System.out.println("volume = "+bola1.hitungVolumeBola());
                    break;
                    case 2:
                        System.out.println("luas permukaan = "+bola1.hitungLuasBola());
                    break;
                }
            break;
            default:
                System.out.println("pilih yang ada");
        }
    }
}
