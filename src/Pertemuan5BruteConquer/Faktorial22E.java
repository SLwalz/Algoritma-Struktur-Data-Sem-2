/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5BruteConquer;

/**
 *
 * @author Farisa
 */
public class Faktorial22E {
    public int nilai22E;
    
    public int faktorialBF22E(int n){
        int fakto22E = 1;
//        for (int i=1;i<=n;i++){
//            fakto22E=fakto22E*i;
//        }
        int i = 1;
        while (i <=n){
            fakto22E=fakto22E*i;
            i++;
        }
        return fakto22E;
    }
    
    public int faktorialDC22E(int n){
        if (n==1 || n==0){
            return 1;
        } else {
            int fakto22E = n*faktorialDC22E(n-1);
            return fakto22E;
        }
    }
}
