/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author Farisa
 */
public class Snake22e {
    int x, y, width22e=5, height22e=5;
    
    void moveLeft(){
        x-=1;
    }
    
    void moveRight(){
        x+=1;
    }
    
    void moveUp(){
        y+=1;
    }
    
    void moveDown(){
        y-=1;
    }
    
    void printPosition(){
        System.out.println("x : "+x);
        System.out.println("y : "+y);
    }
    
    void detectCollision(int x, int y){
        System.out.println("========");
        System.out.println("YOU DIED");
        System.out.println("========");
    }
}
