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
    
    Mahasiswa22e listMhs22e[];
    PencarianMhs22e(int input) {
        listMhs22e = new Mahasiswa22e[input];
    }
    
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

     public int FindSeqByName22e (String cari22e){
        int posisi22e = -1;
        int counter = 0;
         for (int j = 0; j < listMhs22e.length; j++){
             if (listMhs22e[j].nama22e.equalsIgnoreCase(cari22e)){
                 posisi22e=j;
                 counter++;
             }
         }
         if (counter>1){
            posisi22e=listMhs22e.length+1;
            return posisi22e;
         }
         return posisi22e;
     }
     
     public void TampilPosisiByName22e(String x, int pos){
        if (pos==listMhs22e.length+1){
            System.out.println("DATA ADA DOUBLE!!");
        }
        else if (pos!=-1){
            System.out.println("data : "+x+" ditemukan indeks "+pos);
        } else {
            System.out.println("data "+x+" tidak ditemukan");
        }
    }

    public void TampilDataByName22e (String x, int pos){
        if (pos==listMhs22e.length+1){
            System.out.println("DATA ADA DOUBLE!!");
        }
         else if (pos!=-1){
            System.out.println("Nama\t : "+x);
            System.out.println("NIM\t : "+listMhs22e[pos].nim22e);
            System.out.println("Umur\t : "+listMhs22e[pos].umur22e);
            System.out.println("IPK\t : "+listMhs22e[pos].ipk22e);
        } else {
            System.out.println("data "+x+" tidak ditemukan");
        }
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
     

    // binary dan merge

    public int FindBinarySearch22e(int cari22e, int left22e, int right22e){
        int mid22e;
        if(right22e >= left22e){
            mid22e = (left22e + right22e) / 2;
            if (cari22e == listMhs22e[mid22e].nim22e){
                return (mid22e);
            } else if(listMhs22e[mid22e].nim22e > cari22e) {
                return FindBinarySearch22e(cari22e, left22e, mid22e - 1);
            } else {
                return FindBinarySearch22e(cari22e, mid22e + 1, right22e);
            }
        }
        return -1;
    }
    
    public void merge22e(Mahasiswa22e []data22e, int left22e, int middle22e, int right22e){
          Mahasiswa22e[] temp = new Mahasiswa22e[data22e.length];
          for (int i = left22e; i<= right22e; i++){
              temp[i] = data22e[i];
          }
          int a = left22e;
          int b = middle22e + 1;
          int c = left22e;
          
          while (a <= middle22e && b <= right22e){
              if (temp[a].nim22e <= temp[b].nim22e){
                  data22e[c] = temp[a];
                  a++;
              } else {
                  data22e[c] = temp[b];
                  b++;
              }
              c++;
          }
        while (a <= middle22e) {
            data22e[c] = temp[a];
            a++;
            c++;
        }
    }
    
    public void sort22e(Mahasiswa22e data22e, int left22e, int right22e){
        if (left22e < right22e){
            int middle22e = (left22e + right22e)/2;
            sort22e(data22e, left22e, middle22e);
            sort22e(data22e, middle22e+1, right22e);
            merge22e(listMhs22e, left22e, middle22e, right22e);
        }
    }
    
     public void mergeSort22e(Mahasiswa22e data22e, int jumlah22e){
        sort22e(data22e, 0, jumlah22e-1);
    }
}