/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author Farisa
 */
public class Kerucut22e {
    public double jari22e, miring22e;
    
    public Kerucut22e(double jr, double mr){
    jari22e=jr;
    miring22e=mr;
    }
    
    public double hitungLuasKerucut(){
        return jari22e*(jari22e+miring22e)+22/7;
    }
    
    public double hitungVolumeKerucut(){
        return jari22e*jari22e*(Math.sqrt(miring22e*miring22e-jari22e*jari22e))*22/21;
    }
}
//Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan luas permukaan dan volume dari tiap jenis bangun ruang tersebut.
//Pada kerucut, inputan untuk atribut hanya jari-jari dan sisi miring
