/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

/**
 *
 * @author Adrian Pramana Wijaya-XRPL2
 */
public class ListBuku {
    /** pemeberian nilai pada array "listBuku" dengan tipe class Buku */
    Buku[] listBuku = {
        new Buku(1, "Fisika", 30),
        new Buku(2, "Bahasa", 20),
        new Buku(3, "Sosial", 15),
    };
    
    /** method untuk menampilkan data list buku */
    public void viewBuku(){
        System.out.println("--- List Buku ---");
        System.out.println("ID \t Judul \t\t Stok");
        for (Buku listBuku1 : listBuku) {
            System.out.println(listBuku1.getIdBuku() + " \t " + listBuku1.getJudulBuku() + " \t\t " + listBuku1.getStok());
        }
    }
    
    public int cariBuku(int id){
        int found = 0;
        /** pencarian data berdasarkan id */
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].getIdBuku()== id) {
                found = i; /** menyimpan nilai index dari data yg ditemukan */
            }
        }
        return found;        
    }
}
