/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author Farisa
 */
public class SortMain22e {
    public static void main(String[] args) {
        int data22e[] = {10,40,30,50,70,20,100,90};
        System.out.println("sorting dengan merge sort");
        MergeSorting22e mSort = new MergeSorting22e();
        System.out.println("data awal");
        mSort.printArray22e(data22e);
        mSort.mergeSort22e(data22e);
        System.out.println("setelah diurutkan");
        mSort.printArray22e(data22e);
    }
}
