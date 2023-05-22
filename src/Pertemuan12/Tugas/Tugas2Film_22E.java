/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan12.Tugas;

/**
 *
 * @author Farisa
 */
public class Tugas2Film_22E {
    int id22e, rating22e;
    String judul22e;
    Tugas2Film_22E prev, next;

    public Tugas2Film_22E(Tugas2Film_22E prev, int id22e, String judul22e, int rating22e, Tugas2Film_22E next) {
        this.id22e = id22e;
        this.rating22e = rating22e;
        this.judul22e = judul22e;
        this.prev = prev;
        this.next = next;
    }
    
    public void print(){
        System.out.println("--------------------------------");
        System.out.println("ID : "+id22e);
        System.out.println("Judul : "+judul22e);
        System.out.println("Rating : "+rating22e);
    }
}
