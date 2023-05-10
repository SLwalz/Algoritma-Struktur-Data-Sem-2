/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan11;

/**
 *
 * @author Farisa
 */
public class SingleLinkedList_Tugas3 {
    Node_Tugas3 head22e;
    Node_Tugas3 tail22e;
    
    public boolean isEmpty(){
        return head22e == null;
    }
    
    public void print(){
        if(!isEmpty()){
            Node_Tugas3 tmp = head22e;
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
    
    public void addFirst(String input){
        Node_Tugas3 ndInput = new Node_Tugas3(input, null);
        if (isEmpty()){
            head22e = ndInput;
            tail22e = ndInput;
        } else {
            ndInput.next = head22e;
            head22e = ndInput;
        }
    }
    
    public void addLast(String input){
        Node_Tugas3 ndInput = new Node_Tugas3(input, null);
        if (isEmpty()){
            head22e = ndInput;
            tail22e = ndInput;
        } else {
            tail22e.next = ndInput;
            tail22e = ndInput;
        }
    }
    
    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else if (head22e == tail22e){
            head22e = tail22e = null;
        } else {
            Node_Tugas3 temp = head22e;
            while (temp.next != tail22e){
                temp = temp.next;
            }
            temp.next = null;
            tail22e = temp;
        }
    }
    
    
}
