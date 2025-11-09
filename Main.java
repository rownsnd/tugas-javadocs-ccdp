/**
 * Kelas Main adalah entry point dari aplikasi manajemen gaji karyawan.
 * @author Muhamad Haerul Anwar
 * @version 1.0
 */
public class Main {

    /**
     * Metode utama (entry point) dari aplikasi.
     * 
     * @param args array argumen dari command line (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        // Membuat objek Karyawan
        Karyawan karyawan = new Karyawan();

        // Menetapkan data karyawan
        karyawan.setNama("Muhamad Haerul Anwar");
        karyawan.setGajiKotor(10000000);

        // Menghitung gaji bersih
        karyawan.hitungPajak();

        // Menghitung total gaji (bersih + tunjangan)
        karyawan.totalGajiKaryawan();

        // Menampilkan data karyawan ke konsol
        karyawan.tampilGajiKaryawan();
    }
}
