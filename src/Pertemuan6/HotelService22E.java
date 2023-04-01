/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author Farisa
 */
public class HotelService22E {
    Hotel22E[] rooms22e = new Hotel22E[5];
    int idx22e;

    void tambahHotel22e(Hotel22E h){
        if(idx22e<rooms22e.length){
            rooms22e[idx22e] = h;
            idx22e++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    
    void tampilAll22e(){
        for (Hotel22E h : rooms22e){
            h.tampil22e();
        }
    } 
    
    void bubbleSortBintang(){
         for (int i = 0;i < rooms22e.length-1;i++){
            for (int j = 1;j<rooms22e.length-i;j++){
                if(rooms22e[j].bintang22e > rooms22e[j-1].bintang22e){
                    Hotel22E tmp  = rooms22e[j];
                    rooms22e[j] = rooms22e[j-1];
                    rooms22e[j-1] = tmp;
                }
            }
        }
    }
    
    void selectionSortBintang(){
        for (int i=0;i < rooms22e.length-1;i++){
            int idxMax = i;
            for (int j=i+1;j < rooms22e.length; j++){
                if(rooms22e[j].bintang22e > rooms22e[idxMax].bintang22e){
                idxMax = j;
                }
            }
            Hotel22E tmp = rooms22e[idxMax];
            rooms22e[idxMax] = rooms22e[i];
            rooms22e[i] = tmp;
        }
    }
    
    void bubbleSortHarga(){
        for (int i = 0;i < rooms22e.length-1;i++){
            for (int j = 1;j<rooms22e.length-i;j++){
                if(rooms22e[j].harga22e < rooms22e[j-1].harga22e){
                    Hotel22E tmp  = rooms22e[j];
                    rooms22e[j] = rooms22e[j-1];
                    rooms22e[j-1] = tmp;
                }
            }
        }
    }
    
    void selectionSortHarga(){
        for (int i=0;i < rooms22e.length-1;i++){
            int idxMin = i;
            for (int j=i+1;j < rooms22e.length; j++){
                if(rooms22e[j].harga22e < rooms22e[idxMin].harga22e){
                idxMin = j;
                }
            }
            Hotel22E tmp = rooms22e[idxMin];
            rooms22e[idxMin] = rooms22e[i];
            rooms22e[i] = tmp;
        }
    }
}
