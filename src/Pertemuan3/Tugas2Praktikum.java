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
    
static void main (String args[]){
int counter=0;
Scanner kemal22 = new Scanner(System.in);
dataMahasiswa[] mahasiswa = new dataMahasiswa[3];
do{
System.out.println("Data Mahasiswa Ke-"+i)
System.out.print("input nama : ");
mahasiswa[i].nama=kemal22.nextLine();
System.out.print("input NIM: ");
mahasiswa[i].nim=kemal22.nextInt();
System.out.print("input Gender: ");
mahasiswa[i].jenisKelamin=kemal22.nextLine();
System.out.print("input IPK : ");
mahasiswa[i].ipk=kemal22.nextDouble();
i+=1;
} while(i==3);
int a=0;
do{
mahasiswa[a].cetakData();
a+=1;
} while(a==3);
}
}

public class dataMahasiswa {
public int nim, i;
    public String nama, jenisKelamin;
    public Double ipk;
dataMahasiswa(String nm, int nim, String jk, double ip){
nama=nm;
nim=nim;
jenisKelamin=jk;
ipk=ip;
}
public void cetakData(){
do{
System.out.println("Data Mahasiswa Ke-"+);
System.out.println("Nama : "+nama);
System.out.println("NIM : "+nim);
System.out.println("Jenis Kelamin : "+jenisKelamin);
System.out.println("IPK : "+ipk);
i+=1;
} while(i==3);
}
}
