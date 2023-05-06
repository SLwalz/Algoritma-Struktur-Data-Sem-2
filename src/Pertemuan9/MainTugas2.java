package Pertemuan9;

import java.util.Scanner;

public class MainTugas2 {
    public static void main(String[] args) {
        Scanner kemal22e = new Scanner(System.in);
        Scanner k = new Scanner(System.in);
        Tugas2 struk22e = new Tugas2(8);
        
        int counter=0;
        do {
            System.out.print("Nomor transaksi: ");
            int noTrans22e = kemal22e.nextInt();
            System.out.print("Tanggal pembelian (dd/mm/yy): ");
            String tglBeli22e = kemal22e.next();
            System.out.print("Jumlah barang: ");
            int jumlah22e = kemal22e.nextInt();
            System.out.print("Total harga: ");
            int total22e = kemal22e.nextInt();
            System.out.println("=================================");
            Tugas2 p = new Tugas2(noTrans22e, jumlah22e, total22e, tglBeli22e);
            counter++;
            struk22e.push(p);

        } while (counter != 8);
        
        int ulang = 0;
        do {
            System.out.println("Menu");
            System.out.println("1. Lihat Semua Struk\n2. Ambil Struk\n3. Lihat Struk Terbaru\n0. Exit");
            System.out.print("pilihan: ");
            int menu = kemal22e.nextInt();
            switch (menu){
                case 1:
                struk22e.print();
                break;
                case 2:
                struk22e.pop();
                break;
                case 3:
                struk22e.peek();
                break;
                case 0:
                ulang=1;
                break;
                default:
                System.out.println("pilih menu yang ada!!!");
                System.out.println("=========================");
            }
        } while (ulang == 0);
    }
}
