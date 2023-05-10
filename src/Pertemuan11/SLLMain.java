/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan11;

/**
 *
 * @author Farisa
 */
public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL22e = new SingleLinkedList();
        
//       singLL22e.print();
//       singLL22e.addFirst(890);
//       singLL22e.print();
//       singLL22e.addLast(760);
//       singLL22e.print();
//       singLL22e.addFirst(700);
//       singLL22e.print();
//       
//       singLL22e.insertAfter(700, 999);
//       singLL22e.print();
//       singLL22e.insertAt(3, 833);
//       singLL22e.print();
//       
//       
//       //praktikum2
//        System.out.println("Data pada indeks ke-1 = "+singLL22e.getData(1));
//        System.out.println("Data 3 berada pada indeks ke-"+singLL22e.indexOf(760));
//        //tugas 1
//        singLL22e.insertBefore(760, 999);
//        singLL22e.print();
//        //sampe sini
//        singLL22e.remove(999);
//        singLL22e.print();
//        singLL22e.removeAt(0);
//        singLL22e.print();
//        singLL22e.removeFirst();
//        singLL22e.print();
//        singLL22e.removeLast();
//        singLL22e.print();

        //tugas 2
        singLL22e.addFirst(1);
        singLL22e.addLast(9);
        singLL22e.insertAfter(1, 3);
        singLL22e.insertBefore(9, 7);
        singLL22e.insertAt(2, 5);
        singLL22e.print();
    }
}
