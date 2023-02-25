/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author Farisa
 */
import java.util.Scanner;
import java.util.Random;
public class SnakeMain22e {
    public static void main(String[] args) {
        Scanner kemal22e = new Scanner(System.in);
        int ulang=0, counter22e=0, mode22e;
        String menu22e; 
        
        System.out.println("PILIH MODE");
        System.out.println("1. beginner (boleh lihat map setelah 7 gerakan)");
        System.out.println("2. HARDCORE (boleh lihat map setelah 50 gerakan)");
        mode22e=kemal22e.nextInt();
        switch (mode22e) {
            case 1:
                mode22e=7;
                break;
            case 2:
                mode22e=50;
                break;
        }
        
        Snake22e player = new Snake22e();
        System.out.printf("map ini besarnya %d x %d\n",player.width22e+1,player.height22e+1);
        Random acak = new Random();
        player.x=acak.nextInt(0,5);
        player.y=acak.nextInt(0,5);
        
        System.out.println("pilih langkah anda\n");
        System.out.println("\tW. atas \nA. kiri S. bawah D. kanan\n\nP. posisi saat ini");
        do {
            if (player.y<0 || player.y>player.height22e || player.x<0 || player.x>player.width22e){
                player.detectCollision(player.x, player.y);
                break;
            } else {
        menu22e=kemal22e.nextLine();
        switch (menu22e){
            case "w":
                player.moveUp();
                counter22e+=1;
                break;
            case "s":
                player.moveDown();
                counter22e+=1;
                break;
            case "a":
                player.moveLeft();
                counter22e+=1;
                break;
            case "d":
                player.moveRight();
                counter22e+=1;
                break;
            case "p":
                if (counter22e<mode22e){
                    System.out.printf("lakukan %d kali gerakan dahulu\n",mode22e);
                } else {
                System.out.println("=======");
                player.printPosition();
                System.out.println("=======");
                }
                break;
            default:
                System.out.println("invalid input");
                break;
                }
            }
            
        } while (ulang==0);
    }
}
