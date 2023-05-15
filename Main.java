/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pakaian;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Kaos
        Kaos kaos1 = new Kaos("Katun", "Pink", 36, "O-Neck");

            kaos1.display("Pendek");

    // Membuat objek Kemeja
    Kemeja kemeja1 = new Kemeja("Sifon", "Putih", 38, "Tombol");

    // Memanggil method display() pada objek Kemeja
    kemeja1.display();

    // Memanggil method display(String type)
    kemeja1.display("Lengan Pendek");

    // Membuat objek Celana
    Celana celana1 = new Celana("Jeans", "Biru", 32, "Slim Fit");

    // Memanggil method display() pada objek Celana
    celana1.display();

    // Memanggil method display(String type)
    celana1.display("Pendek");
}
}