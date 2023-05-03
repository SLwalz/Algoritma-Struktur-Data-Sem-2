/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author Farisa
 */
public class MergeSorting22e {
    public void mergeSort22e(int [] data22e){
        sort22e(data22e, 0, data22e.length-1);
    }
    public void printArray22e(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    private void merge22e(int data22e[], int left22e, int middle22e, int right22e){
          int[]  temp = new int[data22e.length];
          for (int i = left22e; i<= right22e; i++){
              temp[i] = data22e[i];
          }
          int a = left22e;
          int b = middle22e + 1;
          int c = left22e;
          
          while (a <= middle22e && b <= right22e){
              if (temp[a] <= temp[b]){
                  data22e[c] = temp[a];
                  a++;
              } else {
                  data22e[c] = temp[b];
                  b++;
              }
              c++;
          }
          int s = middle22e - a;
          for(int i = 0; i <= s; i++){
              data22e[c+i]=temp[a+i];
        }
    }
    private void sort22e(int data22e[], int left22e, int right22e){
        if (left22e < right22e){
            int middle22e = (left22e + right22e)/2;
            sort22e(data22e, left22e, middle22e);
            sort22e(data22e, middle22e+1, right22e);
            merge22e(data22e, left22e, middle22e, right22e);
        }
    }

}
