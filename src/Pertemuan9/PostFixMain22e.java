/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author Farisa
 */
import java.util.Scanner;
public class PostFixMain22e {
    public static void main (String[] args){
        Scanner kemal22e = new Scanner(System.in);

        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = kemal22e.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total22e = Q.length();
        PostFix22e post22e = new PostFix22e(total22e);
        P = post22e.konversi(Q);
        System.out.println("Postfix: "+P);
    }
}
