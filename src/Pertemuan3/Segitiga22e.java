/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author Farisa
 */
public class Segitiga22e {
    public int alas;
    public int tinggi;

    public Segitiga22e(int a, int t) {
        alas = a;
        tinggi = t;
    }
    
    public int hitungLuas(){
        return alas*tinggi/2;
    }
    
    public int hitungKeliling(){
        return (int) (Math.sqrt(alas*alas+tinggi*tinggi)+alas+tinggi);
    }
    
    public static void main(String[] args) {
        Segitiga22e[] sgArray=new Segitiga22e[4];
        sgArray[0]=new Segitiga22e(10, 4);
        sgArray[1]=new Segitiga22e(20, 10);
        sgArray[2]=new Segitiga22e(15, 6);
        sgArray[3]=new Segitiga22e(25, 10);
        
        for (int i=0;i<sgArray.length;i++){
            System.out.println("segitiga ke-"+i+"luas = "+sgArray[i].hitungLuas()+", keliling = "+sgArray[i].hitungKeliling());
        }
    }
}
