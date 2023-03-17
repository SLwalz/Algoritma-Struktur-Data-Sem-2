/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5BruteConquer;

/**
 *
 * @author Farisa
 */
public class Sum22e {
    public int elemen22e;
    public double[] keuntungan22e;
    public double  total22e;
    
    Sum22e (int elemen22e){
        this.elemen22e = elemen22e;
        this.keuntungan22e = new double[elemen22e];
        this.total22e = 0;
    }
    
    double totalBF22e (double arr[]){
        for (int i=0;i<elemen22e;i++){
            total22e = total22e + arr[i];
        }
        return total22e;
    }
    
    double totalDC22e (double arr[], int l, int r){
        if(l==r){
            return arr[l];
        } else if (l<r){
            int mid22e = (l+r)/2;
            double lsum = totalDC22e(arr, l,mid22e-1);
            double rsum = totalDC22e(arr, mid22e+1, r);
            return lsum+rsum+arr[mid22e];
        }
        return 0;
    }
}
