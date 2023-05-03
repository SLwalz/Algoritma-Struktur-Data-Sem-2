/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10;

/**
 *
 * @author Farisa
 */
public class WarungQueue22e {
    Pembeli22e[] antrian22e;
    int front22e, rear22e, size22e, max22e;
    
    public WarungQueue22e(int n){
        max22e = n;
        antrian22e = new Pembeli22e[max22e];
        size22e = 0;
        front22e = rear22e = -1;
    }
    
    public boolean IsEmpty(){
        if (size22e==0){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsFull(){
        if (size22e==max22e){
            return true;
        } else {
            return false;
        }
    }
    
    public void Enqueue(Pembeli22e dt){
        if (IsFull()){
            System.out.println("Queue sudah penuh");
        } else {
            if(IsEmpty()){
                front22e = rear22e = 0;
            } else {
                if (rear22e == max22e -1){
                    rear22e = 0;
                } else {
                    rear22e++;
                }
            }
            antrian22e[rear22e]=dt;
            size22e++;
        }
    }
    
    public int Dequeue(){
        Pembeli22e dt = new Pembeli22e();
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian22e[front22e];
            size22e--;
            if (IsEmpty()){
                front22e = rear22e = -1;
            } else {
                if(front22e == max22e -1){
                    front22e = 0;
                } else {
                    front22e++;
                }
            }
        }
        return dt;
    }
    
    public void peek(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan "+antrian22e[front22e].nama22e+" "+antrian22e[front22e].noHP22e);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void peekRear(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan "+antrian22e[rear22e].nama22e+" "+antrian22e[rear22e].noHP22e);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void peekPosition(){
        
    }
    
    public void daftarPembeli(){
        
    }
}
