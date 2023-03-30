/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author Farisa
 */
public class DaftarMahasiswaBerprestasi22E {
    Mahasiswa22E listMhs22e[] = new Mahasiswa22E[5];
    int idx;
    
    void tambah (Mahasiswa22E m){
        if(idx<listMhs22e.length){
            listMhs22e[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    
    void tampil(){
        for (Mahasiswa22E m : listMhs22e){
            m.tampil();
            System.out.println("---------------------------");
        }
    }
    
    void bubbleSort(){
        for (int i = 0;i < listMhs22e.length-1;i++){
            for (int j = 1;j<listMhs22e.length-i;j++){
                if(listMhs22e[j].ipk22e > listMhs22e[j-1].ipk22e){
                    Mahasiswa22E tmp  = listMhs22e[j];
                    listMhs22e[j] = listMhs22e[j-1];
                    listMhs22e[j-1] = tmp;
                }
            }
        }
    }
    
    void selectionSort (){
        for (int i=0;i < listMhs22e.length-1;i++){
            int idxMin = i;
            for (int j=i+1;j < listMhs22e.length; j++){
                if(listMhs22e[j].ipk22e < listMhs22e[idxMin].ipk22e){
                idxMin = j;
                }
            }
            Mahasiswa22E tmp = listMhs22e[idxMin];
            listMhs22e[idxMin] = listMhs22e[i];
            listMhs22e[i] = tmp;
        }
    }
    
    void insertionSort(){
        for (int i = 1; i < listMhs22e.length; i++){
            Mahasiswa22E temp = listMhs22e[i];
            int j = i;
            while (j > 0 && listMhs22e[j-1].ipk22e < temp.ipk22e){
                listMhs22e[j] = listMhs22e[j-1];
                j--;
            }
            listMhs22e[j] = temp;
        }
    }
}
