/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan11;

/**
 *
 * @author Farisa
 */
public class SSL_Tugas4 {
    Node_Tugas4 head22e;
    Node_Tugas4 tail22e;
    
    public boolean isEmpty(){
        return head22e == null;
    }
    
    public void print(){
        if(!isEmpty()){
            Node_Tugas4 tmp = head22e;
            System.out.println("Antrian (paling bawah adalah antrian pertama: ");
            while (tmp != null){
                System.out.print(tmp.norek22e+" "+tmp.nama22e+" "
                        +tmp.alamat22e+" "+tmp.umur22e+" "+tmp.saldo22e+"\n");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }
    
    public void addFirst(String norek22e, String nama22e, 
            String alamat22e, int umur22e, double saldo22e){
        Node_Tugas4 ndInput = new Node_Tugas4(norek22e, nama22e, alamat22e, 
                umur22e, saldo22e, null);
        if (isEmpty()){
            head22e = ndInput;
            tail22e = ndInput;
        } else {
            ndInput.next = head22e;
            head22e = ndInput;
        }
    }
    
    public void addLast(String norek22e, String nama22e, 
            String alamat22e, int umur22e, double saldo22e){
        Node_Tugas4 ndInput = new Node_Tugas4(norek22e, nama22e, 
                alamat22e, umur22e, saldo22e, null);
        if (isEmpty()){
            head22e = ndInput;
            tail22e = ndInput;
        } else {
            tail22e.next = ndInput;
            tail22e = ndInput;
        }
    }
    
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else if (head22e == tail22e){
            head22e = tail22e = null;
        } else {
            Node_Tugas4 temp = head22e;
            while (temp.next != tail22e){
                temp = temp.next;
            }
            temp.next = null;
            tail22e = temp;
        }
    }
}
