/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author HP
 */
public class Nilai {
    
    String NIM;
    String Nama;
    
    int NilaiAbsen;
    int NilaiTugas;
    int NilaiUTS;
    int NilaiUAS;
    
    public void Nilai(String NIM, String Nama, int NilaiAbsen, int NilaiTugas, int NilaiUTS, int NilaiUAS){  
        this.NIM = NIM;
        this.Nama = Nama;
        this.NilaiAbsen = NilaiAbsen;
        this.NilaiTugas = NilaiTugas;
        this.NilaiUTS = NilaiUTS;
        this.NilaiUAS = NilaiUAS;  
    }
    
    public void CetakNilai(){
         
        double nilai1 = (NilaiAbsen*0.1);
        double nilai2 = (NilaiTugas*0.2);
        double nilai3 = (NilaiUTS*0.3);
        double nilai4 = (NilaiUAS*0.4);
        
        double NilaiAkhir = (nilai1 + nilai2 + nilai3 + nilai4);
        
        System.out.println("NIM         : " + NIM);
        System.out.println("Nama        : " + Nama);
        System.out.println("NilaiAbsen  : " + NilaiAbsen);
        System.out.println("NilaiTugas  : " + NilaiTugas);
        System.out.println("NilaiUTS    : " + NilaiUTS);
        System.out.println("NilaiUAS    : " + NilaiUAS);
        System.out.println("NilaiAkhir  : " + NilaiAkhir);
    }
    
}
