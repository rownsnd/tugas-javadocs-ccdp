/**
 * Kelas Karyawan merupakan turunan dari InterfaceKaryawan.
 * Kelas ini digunakan untuk menyimpan data karyawan dan menghitung gaji bersih,
 * pajak, serta total gaji termasuk tunjangan transportasi.
 * 
 * <p>
 * Rumus perhitungan:
 * <ul>
 *   <li>Pajak = 5% dari gaji kotor</li>
 *   <li>Gaji Bersih = Gaji Kotor - Pajak</li>
 *   <li>Total Gaji = Gaji Bersih + Tunjangan Transportasi</li>
 * </ul>
 * </p>
 * 
 * <p>
 * Program ini juga dilengkapi dengan mekanisme penanganan kesalahan (try-catch)
 * untuk menghindari error akibat data null atau operasi perhitungan yang tidak valid.
 * </p>
 * 
 * @author Muhamad Haerul Anwar
 * @version 1.0
 */
public class Karyawan extends InterfaceKaryawan {

    /** Nama karyawan */
    private String nama;

    /** Gaji sebelum dipotong pajak */
    private Integer gajiKotor;

    /** Gaji setelah dipotong pajak */
    private Integer gajiBersih;

    /** Persentase pajak (dalam %) */
    private Integer pajak = 5;

    /** Tunjangan transportasi tetap */
    private Integer tunjanganTransportasi = 250000;
    
    /**
     * Mengembalikan nama karyawan.
     * 
     * @return nama karyawan
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengatur nama karyawan.
     * 
     * @param nama nama karyawan
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Mengembalikan gaji kotor karyawan.
     * 
     * @return gaji kotor
     */
    public Integer getGajiKotor() {
        return gajiKotor;
    }

    /**
     * Mengatur gaji kotor karyawan.
     * 
     * @param gaji gaji kotor
     */
    public void setGajiKotor(Integer gaji) {
        this.gajiKotor = gaji;
    }

    /**
     * Mengembalikan nilai pajak (persentase).
     * 
     * @return pajak
     */
    public Integer getPajak() {
        return pajak;
    }

    /**
     * Mengatur nilai pajak.
     * 
     * @param pajak pajak dalam persen
     */
    public void setPajak(Integer pajak) {
        this.pajak = pajak;
    }

    // ===== Implementasi Metode dari InterfaceKaryawan =====

        /**
     * Menampilkan seluruh data karyawan termasuk gaji kotor, pajak, dan total gaji.
     */
    @Override
    public void tampilGajiKaryawan() {
        try {
            System.out.println("=====================================");
            System.out.println("Data Karyawan");
            System.out.println("Nama                            : " + this.nama);
            System.out.println("Gaji Kotor                      : Rp" + this.gajiKotor);
            System.out.println("Pajak                           : " + this.pajak + "%");
            System.out.println("Tunjangan Transportasi          : Rp" + this.tunjanganTransportasi);
            System.out.println("-------------------------------------");
            System.out.println("Gaji Bersih                     : Rp" + this.hitungPajak());
            System.out.println("Total Gaji (Bersih + Tunjangan) : Rp" + this.totalGajiKaryawan());
            System.out.println("=====================================");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menampilkan data karyawan: " + e.getMessage());
        }
    }

    /**
     * Menghitung total gaji karyawan (gaji bersih + tunjangan transportasi).
     * 
     * @return total gaji karyawan
     */
    @Override
    public Integer totalGajiKaryawan() {
        Integer total = 0;
        try {
            if (this.gajiBersih == null) {
                hitungPajak();
            }
            total = this.gajiBersih + this.tunjanganTransportasi;
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menghitung total gaji: " + e.getMessage());
        }
        return total;
    }

    /**
     * Menghitung gaji bersih setelah dikurangi pajak.
     * 
     * @return gaji bersih
     * @throws NullPointerException jika gajiKotor atau pajak belum diisi
     */
    @Override
    public Integer hitungPajak() {
        try {
            if (gajiKotor == 0 || pajak == 0) {
                throw new NullPointerException("Data gaji atau pajak tidak boleh 0!");
            }
            this.gajiBersih = this.gajiKotor - (this.gajiKotor * this.pajak / 100);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menghitung pajak: " + e.getMessage());
            this.gajiBersih = 0;
        }
        return this.gajiBersih;
    }


}
