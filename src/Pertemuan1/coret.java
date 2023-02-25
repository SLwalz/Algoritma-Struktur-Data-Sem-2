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

public class coret {
    public static void main(String args[]) {
        Scanner kemal22 = new Scanner (System.in);
        double saldoAwal22e=1000000, saldoAkkhir22e=1500000, bulan22e;
        System.out.print("input saldo awal = ");
        saldoAwal22e=kemal22.nextDouble();
        System.out.print("input saldo akhir = ");
        saldoAkkhir22e=kemal22.nextDouble();
        bulan22e=(saldoAkkhir22e-saldoAwal22e)/(saldoAwal22e*2/100);
        System.out.println("lama waktu menabung adalah "+bulan22e+ " bulan");
    }
    
}
