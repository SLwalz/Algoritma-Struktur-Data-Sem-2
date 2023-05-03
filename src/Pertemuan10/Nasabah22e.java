/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10;

/**
 *
 * @author Farisa
 */
public class Nasabah22e {
    String norek22e, nama22e, alamat22e;
    int umur22e;
    double saldo22e;

    public Nasabah22e() {
    }
    
    public Nasabah22e(String norek22e, String nama22e, String alamat22e, int umur22e, double saldo22e) {
        this.norek22e = norek22e;
        this.nama22e = nama22e;
        this.alamat22e = alamat22e;
        this.umur22e = umur22e;
        this.saldo22e = saldo22e;
    }
    
    Nasabah22e[] data22e;
    int front22e, rear22e, size22e, max22e;
    
    public Nasabah22e(int n){
        max22e = n;
        data22e = new Nasabah22e[max22e];
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
            System.out.println("Elemen terdepan "+data22e[front22e].norek22e +" "+data22e[front22e].nama22e
                    +" "+data22e[front22e].alamat22e+" "+data22e[front22e].umur22e+" "+data22e[front22e].saldo22e);
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
                System.out.println(data22e[i].norek22e+ " "+data22e[i].nama22e+" "+data22e[i].alamat22e
                        +" "+data22e[i].umur22e+" "+data22e[i].saldo22e);
                i = (i+1)%max22e;
            }
            System.out.println(data22e[i].norek22e+ " "+data22e[i].nama22e+" "+data22e[i].alamat22e
                        +" "+data22e[i].umur22e+" "+data22e[i].saldo22e);
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
    
    public void Enqueue(Nasabah22e dt){
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
            data22e[rear22e]=dt;
            size22e++;
        }
    }
    
    public Nasabah22e Dequeue(){
        Nasabah22e dt = new Nasabah22e();
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
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
    
    public void peekRear(){
        if (!IsEmpty()){
            System.out.println("Elemen terbelekang "+data22e[rear22e].norek22e +" "+data22e[rear22e].nama22e
                    +" "+data22e[rear22e].alamat22e+" "+data22e[rear22e].umur22e+" "+data22e[rear22e].saldo22e);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}
