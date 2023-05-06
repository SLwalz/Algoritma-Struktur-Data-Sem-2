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
    
    public void Enqueue(Pembeli22e a){
        if (IsFull()){
            System.out.println("Antrian sudah penuh");
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
            antrian22e[rear22e] = a;
            size22e++;
        }
    }
    
    public Pembeli22e Dequeue(){
        Pembeli22e x = new Pembeli22e();
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
        } else {
            x = antrian22e[front22e];
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
        return x;
    }
    
    public void peek(){
        if (!IsEmpty()){
            System.out.println("Antrian terdepan \nnama: "+
                    antrian22e[front22e].nama22e+"\nno Hp: "+antrian22e[front22e].noHP22e);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    
    public void peekRear(){
        if (!IsEmpty()){
            System.out.println("Antrian paling belakang \nnama: "+
                    antrian22e[rear22e].nama22e+"\nno Hp: "+antrian22e[rear22e].noHP22e);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    
    public int peekPosition(String nama){
        boolean check = false;
        int posisi = 0;
        for(int i=0; i<size22e; i++){
            if(nama.equalsIgnoreCase(antrian22e[i].nama22e)){
                check=true;
                posisi=i+1;
                break;
            }
        }
        if(check==true){
            return posisi;
        } else {
            return 0;
        }
    }
    
    public void daftarPembeli(){
        if(IsEmpty()){
            System.out.println("Antrian masih kosong"); 
        } else {
            System.out.println("nama\tno HP");
            int i = front22e;
            while (i != rear22e){
                System.out.println(antrian22e[i].nama22e+"\t"+antrian22e[i].noHP22e);
                i = (i+1)%max22e;
            }
            System.out.println(antrian22e[i].nama22e+"\t"+antrian22e[i].noHP22e);
            System.out.println("Jumlah Antrian = "+size22e);
        }
    }
}
