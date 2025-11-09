public class Main {

   
    /**
     * Contoh main method untuk menjalankan program.
     */
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();

        karyawan.setNama("Muhamad Haerul Anwar");
        karyawan.setGajiKotor(0);
        karyawan.hitungPajak();
        karyawan.totalGajiKaryawan();
        karyawan.tampilGajiKaryawan();
    }
}
