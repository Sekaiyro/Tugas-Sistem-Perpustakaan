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
public class Siswa {
    private final int idSiswa;
    private final String nama;
    private final String alamat;
    private final String telepon;
    boolean status;

    public Siswa(int idSiswa, String nama, String alamat, String telepon, boolean status) {
        this.idSiswa = idSiswa;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.status = status;
    }

    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idSiswa"
     * @return  */
    public int getIdSiswa() {
        return idSiswa;
    }

    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "nama"
     * @return  */
    public String getNama() {
        return nama;
    }

    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "alamat"
     * @return  */
    public String getAlamat() {
        return alamat;
    }

    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "telepon"
     * @return  */
    public String getTelepon() {
        return telepon;
    }
    
    /** method untuk mengubah status peminjaman siswa */
    public void changeStatus(){
        this.status = !this.status;
    }

    /** method untuk mendapatkan status peminjaman
     * @return  */
    public String getStatus() {
        if (status) {
            return "Diijinkan meminjam";
        }
        else{
            return "Tidak Diijinkan meminjam";
        }
    }

    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "isStatus"
     * @return  */
    public boolean isStatus() {
        return status;
    }
        
}

