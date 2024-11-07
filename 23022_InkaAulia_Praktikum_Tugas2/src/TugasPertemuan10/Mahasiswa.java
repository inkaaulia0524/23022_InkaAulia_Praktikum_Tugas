/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan10;

/**
 *
 * @author inkaa
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private String mataKuliah;
    private String nilaiAkhir;

    public Mahasiswa(String nim, String nama, String alamat, String mataKuliah, String nilaiAkhir) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.mataKuliah = mataKuliah;
        this.nilaiAkhir = nilaiAkhir;
    }

    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public String getMataKuliah() { return mataKuliah; }
    public String getNilaiAkhir() { return nilaiAkhir; }
}
