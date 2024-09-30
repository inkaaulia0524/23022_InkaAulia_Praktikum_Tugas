/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalNo2;

/**
 *
 * @author 
 */
public class Matematika {
    
    
    public void pertambahan(int a, int b) {
        int hasil = a + b;
        System.out.println("Pertambahan: " + a + " + " + b + " = " + hasil);
    }

    
    public void pengurangan(int a, int b) {
        int hasil = a - b;
        System.out.println("Pengurangan: " + a + " - " + b + " = " + hasil);
    }

    public void perkalian(int a, int b) {
        int hasil = a * b;
        System.out.println("Perkalian: " + a + " * " + b + " = " + hasil);
    }

   
    public void pembagian(int a, int b) {
        if (b != 0) {
            int hasil = a / b;
            System.out.println("Pembagian: " + a + " / " + b + " = " + hasil);
        } else {
            System.out.println("Pembagian: Tidak bisa membagi dengan nol.");
        }
    }
}

