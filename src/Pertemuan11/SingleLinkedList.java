/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan11;

/**
 *
 * @author Farisa
 */
public class SingleLinkedList {
    Node head22e;
    Node tail22e;
    
    public boolean isEmpty(){
        return head22e == null;
    }
    
    public void print(){
        if(!isEmpty()){
            Node tmp = head22e;
            System.out.print("Isi Linked List:\t");
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }
    
    public void addFirst(int input){
        Node ndInput = new Node(input, null);
        if (isEmpty()){
            head22e = ndInput;
            tail22e = ndInput;
        } else {
            ndInput.next = head22e;
            head22e = ndInput;
        }
    }
    
    public void addLast(int input){
        Node ndInput = new Node(input, null);
        if (isEmpty()){
            head22e = ndInput;
            tail22e = ndInput;
        } else {
            tail22e.next = ndInput;
            tail22e = ndInput;
        }
    }
    
    public void insertAfter(int key, int input){
        Node ndInput = new Node (input, null);
        Node temp = head22e;
        do {
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next==null) {
                    tail22e = ndInput;
                } 
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    
    public void insertAt(int index, int input){
        if(index < 0){
            System.out.println("index salah");
        } else if (index == 0){
            addFirst(input);
        } else {
            Node temp = head22e;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next == null){
                tail22e = temp.next;
            }
        }
    }
    
    //praktikum 2
    
    public int getData (int index){
        Node tmp = head22e;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    public int indexOf (int key){
        Node tmp = head22e;
        int index = 0;
        while (tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        if (tmp == null){
            return -1;
        } else {
            return index;
        }
    }
    
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else if (head22e == tail22e){
            head22e = tail22e = null;
        } else {
            head22e = head22e.next;
        }
    }
    
    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else if (head22e == tail22e){
            head22e = tail22e = null;
        } else {
            Node temp = head22e;
            while (temp.next != tail22e){
                temp = temp.next;
            }
            temp.next = null;
            tail22e = temp;
        }
    }
    
    public void remove(int key){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else {
            Node temp = head22e;
            while (temp != null){
                if((temp.data == key) && (temp == head22e)){
                    this.removeFirst();
                    break;
                } else if (temp.next.data == key){
                    temp.next = temp.next.next;
                    if (temp.next == null){
                        tail22e = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    
    public void removeAt (int index){
        if(index==0){
            removeFirst();
        } else {
            Node temp = head22e;
            for (int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail22e = temp;
            }
        }
    }
    
    
    //tugas 1
    public void insertBefore(int key, int input){
        Node ndInput = new Node(input, null);
        Node temp = head22e;
        do {
            if(temp.next.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next==null) {
                    tail22e = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
}
