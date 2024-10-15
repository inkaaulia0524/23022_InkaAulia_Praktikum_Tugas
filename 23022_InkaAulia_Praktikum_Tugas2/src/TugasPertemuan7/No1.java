/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan7;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static boolean isPrima(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Bilangan Prima 0-20:");
        for (int i = 0; i <= 20; i++) {
            if (isPrima(i)) {
                System.out.println(i + " bilangan prima.");
            } 
            else {
                System.out.println(i + " bukan prima.");
            }
        }
        
        System.out.println("Ganjil dan Genap 0-20:");
        int num = 0;
        do{
            if (num % 2 == 0) {
                System.out.println(num + " genap.");
            } 
            else {
                System.out.println(num + " ganjil.");
            }
            num++;
        }
        while (num <= 20);
        System.out.println();
    
        System.out.println("Huruf Z - A:");
        char letter = 'Z';
        while (letter >= 'A'){
            System.out.print(letter + " ");
            letter--;
        } 
        System.out.println();
        
        System.out.println("\nLagu Anak Ayam Turun N:");
        int n = 10; // Misalkan N = 10
        for (int i = n; i > 0; i--) {
            if (i == 1) {
                System.out.println("Anak ayam turun 1, mati 1 tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati 1 tinggal " + (i - 1) + ".");
            }
        }
    }
}
