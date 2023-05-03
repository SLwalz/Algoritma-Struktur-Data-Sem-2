/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10;

/**
 *
 * @author Farisa
 */
public class Queue22e {
    int[] data22e;
    int front22e, rear22e, size22e, max22e, keluar22e=0;
    
    public Queue22e(int n){
        max22e = n;
        data22e = new int[max22e];
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
    
    public void peek(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan "+data22e[front22e]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong"); 
        } else {
            int i = front22e;
            while (i != rear22e){
                System.out.print(data22e[i]+ " ");
                i = (i+1)%max22e;
            }
            System.out.println(data22e[i]+" ");
            System.out.println("Jumlah elemen = "+size22e);
        }
    }
    
    public void clear(){
        if(!IsEmpty()){
            front22e = rear22e = -1;
            size22e = 0;
            System.out.println("Queue berhasil dikosongkan"); 
        } else {
             System.out.println("Queue masih kosong"); 
        }
    }
    
    public void Enqueue(int dt){
        if (IsFull()){
            System.out.println("Queue sudah penuh");
            keluar22e = 1;
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
            data22e[rear22e]=dt;
            size22e++;
        }
    }
    
    public int Dequeue(){
        int dt = 0;
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
            keluar22e = 1;
        } else {
            dt = data22e[front22e];
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
}
