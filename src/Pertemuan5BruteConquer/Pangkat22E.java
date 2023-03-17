/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5BruteConquer;

/**
 *
 * @author Farisa
 */
public class Pangkat22E {
    public int nilai22e, pangkat22e;
    
    public int pangkatBF22e(int a, int n){
        int hasil22e=1;
        for (int i=0;i<n;i++){
            hasil22e = hasil22e * a;
        }    
        return hasil22e;
    }
    
    public int pangkatDC22e(int a, int n){
        if(n==0){
            return 1;
        } else {
            if (n%2==1){//ganjil
                return (pangkatDC22e(a, n/2)*pangkatDC22e(a, n/2)*a);
            } else {//genap
                return (pangkatDC22e(a, n/2)*pangkatDC22e(a, n/2));
            }
        }
    }
}
