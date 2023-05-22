/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan12.Tugas;

/**
 *
 * @author Farisa
 */
public class Tugas1_method_22E {
    Tugas1_22E head;
    int size;
    
    public Tugas1_method_22E(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(int nomor22e, String nama22e){
        if(isEmpty()){
            head = new Tugas1_22E(null, nomor22e, 
                    nama22e, null);
        } else {
            Tugas1_22E newNode = new Tugas1_22E(null,
                    nomor22e, nama22e, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(int nomor22e, String nama22e){
        if(isEmpty()){
            addFirst(nomor22e, nama22e);
        } else {
            Tugas1_22E current = head;
            while (current.next != null){
                current = current.next;
            }
            Tugas1_22E newNode = new Tugas1_22E(current,
                    nomor22e, nama22e, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void removeFirst() throws Exception {
        if(isEmpty()){
            throw new Exception ("Antrian masih kosong");
        } else if (size == 1){
            removeLast();
        } else {
            System.out.println(head.nama22e + " telah selesai divaksinasi");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() throws Exception{
        if(head.next == null){
            System.out.println(head.nama22e + " telah selesai divaksinasi");
            head = null;
            size--;
            return;
        }
        Tugas1_22E current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    
    public void print(){
        if (!isEmpty()){
            int counter = 0;
            Tugas1_22E tmp = head;
            System.out.println("|" +"No."+ "\t|" +"Nama"+ "\t|");
            while (tmp != null){
                System.out.println("|"+tmp.noAntri22e + "\t|" +
                        tmp.nama22e +"\t|");
                tmp = tmp.next;
                counter++;
            }
            System.out.println("Sisa Antrian : "+counter);
        } else {
            System.out.println("Antrian Kosong");
        }
    }
}
