/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author Farisa
 */
public class ArrayBalok22e {
    public static void main(String[] args) {
        Balok22e[] blArray = new Balok22e[3];
        blArray[0]=new Balok22e(100, 30, 12);
        blArray[1]=new Balok22e(120, 40, 15);
        blArray[2]=new Balok22e(210, 50, 25);
        
        for (int i=0;i<3;i++){
            System.out.println("vloume balook ke "+i+": "+blArray[i].hitungVolume());
        }
                
    }
}
