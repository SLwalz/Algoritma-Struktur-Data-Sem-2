/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan11;

/**
 *
 * @author Farisa
 */
public class Node_Tugas4 {
    String norek22e, nama22e, alamat22e;
    int umur22e;
    double saldo22e;
    Node_Tugas4 next;
    
    public Node_Tugas4(String norek22e, String nama22e, 
            String alamat22e, int umur22e, 
            double saldo22e, Node_Tugas4 berikutnya) {
        this.norek22e = norek22e;
        this.nama22e = nama22e;
        this.alamat22e = alamat22e;
        this.umur22e = umur22e;
        this.saldo22e = saldo22e;
        this.next = berikutnya;
    }
}
