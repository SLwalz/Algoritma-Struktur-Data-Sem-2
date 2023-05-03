/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author Farisa
 */
public class Stack22e {
    int size22e, top22e;
    Pakaian22e data22e[];

    public Stack22e(int size){
        this.size22e = size;
        data22e = new Pakaian22e[size];
        top22e = -1;
    }

    public boolean isEmpty(){
        if (top22e == -1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if (top22e == size22e-1){
            return true;
        } else {
            return false;
        }
    }

    public void push(Pakaian22e pkn){
        if (!isFull()){
            top22e++;
            data22e[top22e] = pkn;
        } else {
            System.out.println("Isi stack penuh!!");
        }
    }

    public void pop(){
        if (!isEmpty()){
            Pakaian22e x = data22e[top22e];
            top22e--;
            System.out.println("Data yang keluar: "+ x.jenis22e +" "+ x.warna22e +
                    " "+ x.merk22e +" "+ x.ukuran22e +" "+ x.harga22e);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek(){
        System.out.println("Elemen teratas: "+ data22e[top22e].jenis22e +" "+
                data22e[top22e].warna22e +" "+ data22e[top22e].merk22e +" "+
                data22e[top22e].ukuran22e +" "+ data22e[top22e].harga22e);
    }

    public void print(){
        System.out.println("Isi stack: ");
        for (int i=top22e; i>=0; i--){
            System.out.println(data22e[i].jenis22e +" "+
            data22e[i].warna22e +" "+ data22e[i].merk22e +" "+
            data22e[i].ukuran22e +" "+ data22e[i].harga22e);
        }
        System.out.println("");
    }

    public void clear(){
        if (!isEmpty()){
            for (int i = top22e; i >= 0; i--){
                top22e--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void getMin22e(){
        if (!isEmpty()){
            Pakaian22e min = new Pakaian22e(data22e[0].harga22e);
            for (int i = 0; i<data22e.length; i++){
                if (min.harga22e >= data22e[i].harga22e){
                    min.harga22e = data22e[i].harga22e;
                }
                i++;
            }
            System.out.println("Harga Minimal Dari data tersebut adalah Rp "+min.harga22e);
        }
    }
}
