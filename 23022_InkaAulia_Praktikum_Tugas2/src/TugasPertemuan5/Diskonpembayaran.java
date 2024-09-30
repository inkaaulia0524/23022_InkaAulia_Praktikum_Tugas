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
public class Diskonpembayaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total pembelian Rp. = ");
        double totalPembelian = input.nextDouble();
        double potongan = 0;

        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05; 
        } else {
            potongan = totalPembelian * 0.20; 
        }
        double totalBayar = totalPembelian - potongan;

        System.out.println("Besarnya potongan Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + totalBayar);
    }
    
}
