/**
 * Kelas induk InterfaceKaryawan yang berisi struktur dasar perhitungan gaji karyawan.
 * Kelas ini dapat diturunkan oleh kelas lain untuk mengimplementasikan logika perhitungan gaji.
 * 
 * @author 
 * @version 1.0
 */
public class InterfaceKaryawan {

    /**
     * Menghitung total gaji karyawan.
     * 
     * @return total gaji (gaji bersih + tunjangan)
     */
    Integer totalGajiKaryawan() {
        return 0;
    }

    /**
     * Menghitung gaji bersih setelah dipotong pajak.
     * 
     * @return gaji bersih
     */
    Integer hitungPajak() {
        return 0;
    }

    /**
     * Menampilkan informasi data gaji karyawan.
     */
    void tampilGajiKaryawan() {
    }
}
