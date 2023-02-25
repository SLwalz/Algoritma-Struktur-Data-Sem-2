package Pertemuan1;

import java.util.Scanner;

/**
 *
 * @author Farisa
 */
public class Tugas2_p1 {
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
