/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author Farisa
 */
public class FilmMain {
    public static void main(String[] args) {
    Film film1 = new Film();

    film1.judul = "Quantumania Mancing";
    film1.genre = "Action Comedy";
    film1.rate = "Remaja";
    film1.jumlahTiket = 3000;
    film1.hargaTiket = 40000;

    film1.tambahTiket (1);
    film1.kurangiTiket(3);
    film1.tampilFilm();

    int income = film1.totalRevenue(4);

    System.out.println("Total jual 4 tiket = "+income);
    
    System.out.println("==============\n");
    
    Film film2 = new Film("Maniaquantum", "Horor", "Dewasa", 2000, 40000);
    film2.tampilFilm();
    
    System.out.println("==============\n");
    
    Film film3 = new Film("Puss in Boots: The Last Wish", "Cartoon, Suspense", "Parental Guide", 1500, 20000);
    film3.tampilFilm();
    }
}