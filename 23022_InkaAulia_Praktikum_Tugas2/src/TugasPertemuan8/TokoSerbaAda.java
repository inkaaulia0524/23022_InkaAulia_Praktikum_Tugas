/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan8;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author inkaa
 */
public class TokoSerbaAda {
    static ArrayList<Barang> daftarBarang = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("TOKO SERBA ADA");
        System.out.println("*****************************");
        
        daftarBarang.add(new Barang("a001", "Buku", 3000));
        daftarBarang.add(new Barang("a002", "Pensil", 4000));
        daftarBarang.add(new Barang("a003", "Pulpen", 5000));
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Item Barang: ");
        int jumlahItem = scanner.nextInt();
        
        ArrayList<String> kodeBarangList = new ArrayList<>();
        ArrayList<Integer> jumlahBeliList = new ArrayList<>();
        
        for (int i = 1; i <= jumlahItem; i++) {
            System.out.println("Data ke " + i);
            System.out.print("Masukkan Kode Barang: ");
            String kode = scanner.next();
            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();
            
        kodeBarangList.add(kode);
            jumlahBeliList.add(jumlahBeli);
        }
        
        int totalBayar = 0;
            System.out.println("\nTOKO SERBA ADA");
            System.out.println("*****************************");
            System.out.printf("%-3s %-10s %-15s %-6s %-10s %-12s\n", "No", "Kode", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");

        for (int i = 0; i < jumlahItem; i++) {
                String kode = kodeBarangList.get(i);
                int jumlahBeli = jumlahBeliList.get(i);
                Barang barang = null;

            for (Barang b : daftarBarang) {
                if (b.kode.equals(kode)) {
                    barang = b;
                    break;
                }
            }
        if (barang != null) {
                int jumlahBayar = barang.harga * jumlahBeli;
                totalBayar += jumlahBayar;

                System.out.printf("%-3d %-10s %-15s %-6d %-10d %-12d\n", (i + 1), barang.kode, barang.nama, barang.harga, jumlahBeli, jumlahBayar);
            } else {
                System.out.println("Kode barang " + kode + " tidak ditemukan.");
            }
        }

        System.out.println("=============================================================");
        System.out.println("Total Bayar:                                     " + totalBayar);
    }
}
    
    
    

