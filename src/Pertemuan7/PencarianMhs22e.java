/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author Farisa
 */
public class PencarianMhs22e {
    Mahasiswa22e listMhs22e[] = new Mahasiswa22e[5];
    int idx;
    
     void tambah (Mahasiswa22e m){
        if(idx<listMhs22e.length){
            listMhs22e[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
     
    void tampil(){
        for (Mahasiswa22e m : listMhs22e){
            m.tampil22e();
            System.out.println("---------------------------");
        }
    }
     
     public int FindSeqSearch22e (int cari22e){
         int posisi22e = -1;
         for (int j = 0; j < listMhs22e.length; j++){
             if (listMhs22e[j].nim22e==cari22e){
                 posisi22e=j;
                 break;
             }
         }
         return posisi22e;
     }
     
     public void TampilPosisi22e(int x, int pos){
         if (pos!=-1){
             System.out.println("data : "+x+" ditemukan indeks "+pos);
         } else {
             System.out.println("data "+x+" tidak ditemukan");
         }
     }
     
     public void TampilData22e (int x, int pos){
         if (pos!=-1){
             System.out.println("Nim\t : "+x);
             System.out.println("Nama\t : "+listMhs22e[pos].nama22e);
             System.out.println("Umur\t : "+listMhs22e[pos].umur22e);
             System.out.println("IPK\t : "+listMhs22e[pos].ipk22e);
         } else {
             System.out.println("data "+x+" tidak ditemukan");
         }
     }
     
    public int FindBinarySearch22e(int cari22e, int left22e, int right22e){
        int mid22e;
        if(right22e >= left22e){
            mid22e = (left22e + right22e) / 2;
            if (cari22e == listMhs22e[mid22e].nim22e){
                return (mid22e);
            } else if(listMhs22e[mid22e].nim22e > cari22e) {
                return FindBinarySearch22e(cari22e, mid22e + 1, right22e);
            } else {
                return FindBinarySearch22e(cari22e, left22e, mid22e - 1);
            }
        }
        return -1;
    }
}
//left22e, mid22e - 1
//mid22e + 1, right22e