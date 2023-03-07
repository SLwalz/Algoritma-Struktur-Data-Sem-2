/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author Farisa
 */
import java.util.Scanner;
public class Tugas2Praktikum {
    
public static void main (String args[]){
    int ulang=0, nim=0;
    String nama, jk;
    double ipk=0;
    Scanner kemal22 = new Scanner(System.in);
    dataMahasiswa[] mahasiswa = new dataMahasiswa[3];
    do{
    System.out.println("Data Mahasiswa Ke-"+ulang);
    System.out.print("input nama : ");
    nama=kemal22.nextLine();
    kemal22.nextLine();
    System.out.print("input NIM: ");
    nim=kemal22.nextInt();
    System.out.print("input Gender: ");
    jk=kemal22.nextLine();
    kemal22.nextLine();
    System.out.print("input IPK : ");
    ipk=kemal22.nextDouble();
    mahasiswa[ulang]= new dataMahasiswa(nama,nim,jk,ipk);
    ulang+=1;
    } while(ulang<3);
    
    int a=0;
    do{
    mahasiswa[a].cetakData();
    a+=1;
        } while(a<3);
    }
}

class dataMahasiswa {
    public int nim;
    public String nama, jenisKelamin;
    public Double ipk;
    dataMahasiswa(String nam, int nm, String jk, double ip){
    nama=nam;
    nim=nm;
    jenisKelamin=jk;
    ipk=ip;
    }
public void cetakData(){
    int i=0;
    System.out.println("=======================");
    do{
    System.out.println("Data Mahasiswa Ke-"+i);
    System.out.println("Nama : "+nama);
    System.out.println("NIM : "+nim);
    System.out.println("Jenis Kelamin : "+jenisKelamin);
    System.out.println("IPK : "+ipk);
    i+=1;
        } while(i<3);
    }
}
