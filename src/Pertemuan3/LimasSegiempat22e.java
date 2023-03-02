/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author Farisa
 */
public class LimasSegiempat22e {
    public double alas22e, tinggi22e;
    
    public LimasSegiempat22e(double a, double t){
        alas22e=a;
        tinggi22e=t;
    }
    
    public double hitungLuasLimas(){
        return (Math.sqrt(alas22e/2*alas22e/2+tinggi22e*tinggi22e))*alas22e/2*4+alas22e*alas22e;
    }
    
    public double hitungVolumeLimas(){
        return alas22e*alas22e*tinggi22e/3;
    }
}
//Pada limas segi empat sama sisi, inputan untuk atribut hanya panjang sisi alas dan tinggi limas