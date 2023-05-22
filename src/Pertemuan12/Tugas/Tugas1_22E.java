/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan12.Tugas;

/**
 *
 * @author Farisa
 */
public class Tugas1_22E {
    int noAntri22e;
    String nama22e;
    Tugas1_22E prev,next;

    public Tugas1_22E(Tugas1_22E prev, int noAntri22e, 
            String nama22e, Tugas1_22E next) {
        this.noAntri22e = noAntri22e;
        this.nama22e = nama22e;
        this.prev = prev;
        this.next = next;
    } 
}
