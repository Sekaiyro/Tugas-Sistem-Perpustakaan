/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

/**
 *
 * @author ZAKARIA
 */
public class ListSiswa {
    /** pemeberian nilai pada array "listSiswa" dengan tipe class Siswa */
    Siswa[] listSiswa = {
        new Siswa(1, "Peter", "Jakarta", "0341", true),
        new Siswa(2, "Johny", "Surabaya", "0341", true),
        new Siswa(3, "Maria", "Malang", "0341", true),
    };
    
    /** method untuk menampilkan data list siswa */
    public void viewSiswa(){
        System.out.println("--- List Siswa ---");
        System.out.println("ID \t Nama \t\t Alamat \t\t Status");
        for (int i = 0; i < listSiswa.length; i++) {
            System.out.println(listSiswa[i].getIdSiswa() +" \t "+
                    listSiswa[i].getNama()+" \t\t "+
                    listSiswa[i].getAlamat() +" \t\t "+
                    listSiswa[i].getStatus());
        }
    }
    
    public int cariSiswa(int id){
        int found = 0;
        /** pencarian data berdasarkan id */
        for (int i = 0; i < listSiswa.length; i++) {
            if (listSiswa[i].getIdSiswa() == id) {
                found = i; /** menyimpan nilai index dari data yg ditemukan */
            }
        }
        return found;
    }
}
