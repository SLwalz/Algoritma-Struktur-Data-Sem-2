/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan12.Tugas;

/**
 *
 * @author Farisa
 */
public class Tugas2_method_22E {
    Tugas2Film_22E head;
    int size;
    
    public Tugas2_method_22E(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(int id22e, String judul22e, int rating22e){
        if(isEmpty()){
            head = new Tugas2Film_22E(null, id22e, judul22e, rating22e, null);
        } else {
            Tugas2Film_22E newNode = new Tugas2Film_22E(null, id22e, judul22e, rating22e, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(int id22e, String judul22e, int rating22e){
        if(isEmpty()){
            addFirst(id22e, judul22e, rating22e);
        } else {
            Tugas2Film_22E current = head;
            while (current.next != null){
                current = current.next;
            }
            Tugas2Film_22E newNode = new Tugas2Film_22E(current, id22e, judul22e, rating22e, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void add(int id22e, String judul22e, int rating22e, int index) throws Exception {
        if (isEmpty()){
            addFirst(id22e, judul22e, rating22e);
        } else if (index < 0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Tugas2Film_22E current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.prev == null){
                Tugas2Film_22E newNode = new Tugas2Film_22E(null, id22e, judul22e, rating22e, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Tugas2Film_22E newNode = new Tugas2Film_22E(current.prev, id22e, judul22e, rating22e, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public int size(){
        return size;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }
    
    public void print(){
        if (!isEmpty()){
            Tugas2Film_22E tmp = head;
            System.out.println("ID\tJudul\tRate");
            while (tmp != null){
                System.out.println(tmp.id22e + "\t" + tmp.judul22e + "\t" + tmp.rating22e);
                System.out.println("ID : "+tmp.id22e);
                System.out.println("    Judul : "+tmp.judul22e);
                System.out.println("    Rate : "+tmp.rating22e);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }
    
    public void removeFirst() throws Exception {
        if(isEmpty()){
            throw new Exception ("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception ("Linked List masih kosong, tidak dapat dihapus");
        } else if(head.next == null){
            head = null;
            size--;
            return;
        }
        Tugas2Film_22E current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size){
            throw  new Exception("Nilai indeks di luar batas");
        } else if (index == 0){
            removeFirst();
        } else {
            Tugas2Film_22E current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.next == null){
                current.prev.next = null;
            } else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
 
    public void sort () throws Exception {
        Tugas2Film_22E current = head;
        Tugas2Film_22E tmp;
        while (current.next != null){
            if(isEmpty()){
                throw new Exception("kosong");
            }
            else if (current.rating22e < current.next.rating22e){
                tmp = current;
                current = current.next;
                current.prev = tmp;
                current = current.next;
            } 
        } 
    }
    
    public void search(int x){
        Tugas2Film_22E current = head;
        while (current != null){
            if(current.id22e == x){
                current.print();
            }
            current = current.next;
        }
    }
    
    public void urut(){
        Tugas2Film_22E current = null, index = null;
        int temp;
        String temp2;
        
        if (head == null) {
            return;
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.rating22e < index.rating22e) {
                        temp = current.rating22e;
                        current.rating22e = index.rating22e;
                        index.rating22e = temp;
                        temp = current.id22e;
                        current.id22e = index.id22e;
                        index.id22e = temp;
                        temp2 = current.judul22e;
                        current.judul22e = index.judul22e;
                        index.judul22e = temp2;
                    }
                }
            }
        }
    }
}
