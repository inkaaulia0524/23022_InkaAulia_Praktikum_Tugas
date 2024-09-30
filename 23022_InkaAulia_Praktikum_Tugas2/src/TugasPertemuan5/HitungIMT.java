/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan5;
import java.util.Scanner;
/**
 *
 * @author
 */
public class HitungIMT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Berat badan (kg): ");
        double beratBadan = input.nextDouble();
        
        System.out.print("Tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();
        double imt = beratBadan / (tinggiBadan * tinggiBadan);

        String kategori;

        if (imt < 18.5) {
            kategori = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kategori = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kategori = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kategori = "Gemuk";
        } else {
            kategori = "Sangat Gemuk";
        }

        System.out.println("\nIndeks Massa Tubuh (IMT): " + imt);
        System.out.println("Kategori: " + kategori);
    }
    
}
