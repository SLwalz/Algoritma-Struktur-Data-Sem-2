/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author Farisa
 */
import java.util.Scanner;
public class StackMain22e {
    public static void main(String[] args) {
    //Stack22e stk = new Stack22e(5);
    Scanner kemal22e = new Scanner(System.in);
    
    System.out.print("Masukkan banyak data yang diinginkan: ");
    int banyak22e = kemal22e.nextInt();
    Stack22e stk = new Stack22e(banyak22e);
    System.out.println("=================================");

    int counter=0;
    //char pilih22e;
    do {
        kemal22e.nextLine();
        System.out.print("Jenis: ");
        String jenis22e = kemal22e.nextLine();
        System.out.print("Warna: ");
        String warna22e = kemal22e.nextLine();
        System.out.print("Merk: ");
        String merk22e = kemal22e.nextLine();
        System.out.print("Ukuran: ");
        String ukuran22e = kemal22e.nextLine();
        System.out.print("Harga: ");
        double harga22e = kemal22e.nextDouble();
        System.out.println("=================================");
        Pakaian22e p = new Pakaian22e(jenis22e, warna22e, merk22e, ukuran22e, harga22e);
        counter++;
        // System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
        // pilih22e = kemal22e.next().charAt(0);
        // kemal22e.nextLine();
        stk.push(p);

    } while (counter != banyak22e);//(pilih22e == 'y' || pilih22e == 'Y');

    
    int ulang = 0;
    do {
    //System.out.println("===================");
        System.out.println("Menu");
        System.out.println("1. Print\n2. Pop\n3. Peek\n4. getMin\n0. Exit");
        System.out.print("pilihan: ");
        int menu = kemal22e.nextInt();
        switch (menu){
        case 1:
        stk.print();
        break;
        case 2:
        stk.pop();
        break;
        case 3:
        stk.peek();
        break;
        case 4:
        stk.getMin22e();
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
