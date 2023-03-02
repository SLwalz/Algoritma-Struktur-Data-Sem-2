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
                for (int i=counter;i<bangunRuang.length;i++){
                    
                }
                System.out.println("input jari jari : ");
                jari=kemal22e.nextDouble();
                System.out.println("input sisi miring :");
                miring=kemal22e.nextDouble();
                Kerucut22e kerucut1=new Kerucut22e(jari, miring);
                
            break;
            case 2:
                
            break;
            case 3:
                
            break;
            default:
                System.out.println("pilih yang ada");
        }
    }
}
