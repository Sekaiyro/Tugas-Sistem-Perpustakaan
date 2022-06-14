/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//cara untuk mengelompokkan class
package perpustakaan;
//class yang menyediakan fungsi-fungsi untuk mengambil input dari keyboard.
import java.util.Scanner;

/**
 *
 * @author Adrian Pramana Wijaya-XRPL2
 */
//isi dari folder package yg nantinya dapat diisi dengan beberapa argumen sehingga dapat lebih memudahkan kita saat mencari data
public class Perpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** prepare untuk menangani input dari user */
        Scanner input = new Scanner(System.in);
        
        /** membuat variable utk mengondisikan program masih berjalan atau berhenti */
        boolean stay = true;
        
        /** prepare variabel utk menyimpan input user  */
        String key;
        
        /** prepare object yg berisi daftar buku */
        ListBuku listBuku = new ListBuku();
        
        /** prepare object yg berisi daftar siswa */
        ListSiswa listSiswa = new ListSiswa();
        
        while (stay) { /** selama nilai "stay" = true maka program terus berjalan */
            /** tampilan menu */
            System.out.println("-- Perpustakaan Adrian --");
            System.out.println("1. List Buku");
            System.out.println("2. List Siswa");
            System.out.println("3. Transaksi");
            System.out.println("4. Exit");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            
            switch (menu) {
                case 1:
                    System.out.println("---------------------------");
                    System.out.println("---------------------------\n");
                    /** menampilkan daftar buku */
                    listBuku.viewBuku();
                    System.out.println("Pencet Apapun Dan Enter...");
                    key = input.next();
                    break;
                case 2:
                    System.out.println("---------------------------");
                    System.out.println("---------------------------\n");
                    /** menampilkan daftar siswa */
                    listSiswa.viewSiswa();
                    System.out.println("Pencet Apapun Dan Enter...");
                    key = input.next();
                    break;
                case 3:
                    System.out.println("---------------------------");
                    System.out.println("---------------------------\n");
                    System.out.println("--- Peminjaman Buku ---");
                    int selectedIDSiswa, selectedIDBuku;
                    System.out.print("Masukkan ID Siswa: ");
                    selectedIDSiswa = input.nextInt();
                    /** "foundIndex" menyimpan posisi index dari data siswa yg dipilih */
                    int foundIndex = listSiswa.cariSiswa(selectedIDSiswa);
                    /** "selectedSiswa" menyimpan data client yg dipilih */
                    Siswa selectedSiswa = listSiswa.listSiswa[foundIndex];
                    /** jika statusnya true, maka boleh lanjut */
                    if (selectedSiswa.isStatus()) {
                        /** proses perubahan status siswa */
                        listSiswa.listSiswa[foundIndex].changeStatus();
                        
                        /** menampilkan data buku */
                        listBuku.viewBuku();
                        
                        System.out.print("Pilih ID buku yang dipinjam: ");
                        selectedIDBuku = input.nextInt();
                        foundIndex = listBuku.cariBuku(selectedIDBuku);
                        
                        /** "selectedBuku" menyimpan data client yg dipilih */
                        Buku selectedBuku = listBuku.listBuku[foundIndex];
                        
                        System.out.println("--- List Peminjaman ---");
                        System.out.println("Judul Buku: " + selectedBuku.getJudulBuku());
                        System.out.println("Peminjam: " + selectedSiswa.getNama());
                        
                        /** proses pengurangan stok */
                        listBuku.listBuku[foundIndex].kurangiStok();
                        
                        
                    } else {
                        System.out.println("Maaf anda masih punya tanggungan buku");
                    }   System.out.println("Press any key and enter...");
                    key = input.next();
                    break;
                case 4:
                    /** variabel "stay" diset false menyebabkan program berhenti */
                    stay = false;
                    break;
                default:
                    break;
            }
        }
    }
    
}
    
    

