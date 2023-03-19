/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5BruteConquer;

/**
 *
 * @author Farisa
 */
public class LatihanPraktikum22e {
    public int elemen22e;
    public String voting22e[];

    public LatihanPraktikum22e(int elm) {
        this.elemen22e=elm;
        this.voting22e=new String[elemen22e];
    }
    
    public String penghitungNama22e(String[] kandidat22e, int awal22e, int akhir22e){
        if (awal22e==akhir22e){
            return kandidat22e[awal22e];
        } else {
            int tengah22e = (awal22e + akhir22e)/2;
            String suaraKiri22e = penghitungNama22e(kandidat22e, awal22e, tengah22e);
            String suaraKanan22e = penghitungNama22e(kandidat22e, tengah22e + 1, akhir22e);
            
            int banyakKiri22e = penghitungSuara22e(kandidat22e, suaraKiri22e, awal22e, akhir22e);
            int banyakKanan22e = penghitungSuara22e(kandidat22e, suaraKanan22e, awal22e, akhir22e);
            
            return (banyakKiri22e > banyakKanan22e) ? suaraKiri22e : suaraKanan22e;
        }
    }
    
    public int penghitungSuara22e(String[] names22e, String name22e, int start22e, int end22e) {
    int counter22e = 0;
    for (int i = start22e; i <= end22e; i++) {
        if (names22e[i].equals(name22e)) {
            counter22e++;
        }
    }
    return counter22e;
    }
}
