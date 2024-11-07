/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan10;
import java.util.ArrayList;
/**
 *
 * @author inkaa
 */
public class InputDataMahasiswa {
       ArrayList<Mahasiswa> listmahasiswa;
       
       public InputDataMahasiswa(){
            listmahasiswa = new ArrayList(); 
      }
       public void insertData(String NIM, String Nama, String Alamat, String MataKuliah, String NilaiAkhir) {
            Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, MataKuliah, NilaiAkhir);
            listmahasiswa.add(mhs);
}

       public ArrayList<Mahasiswa> getALL(){
            return listmahasiswa;
      }

       public void deleteData(int index){
            listmahasiswa.remove(index);
      }
}
