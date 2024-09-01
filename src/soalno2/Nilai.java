
package soalno2;

    /**
     *
     * @author Acer
     */
public class Nilai {
    //Pendeklarasian
    String npm;
    String nama;
    double NilaiAbsen;
    double NilaiTugas;
    double NilaiUts; 
    double NilaiUas; 
    double NilaiAkhir;
    
    public Nilai(String npm, String nama, double NilaiAbsen,double NilaiTugas, double NilaiUts, double NilaiUas) {
      this.npm = npm;
      this.nama = nama;
      this.NilaiAbsen = NilaiAbsen;
      this.NilaiTugas = NilaiTugas;
      this.NilaiUts = NilaiUts;
      this.NilaiUas = NilaiUas;
      this.NilaiAkhir = (NilaiAbsen * 0.1) + (NilaiTugas * 0.2) + (NilaiUts * 0.3) + (NilaiUas * 0.4);
    }
    
    void cetakNilai() {
        System.out.println("NIM               : " + npm);
        System.out.println("Nama              : " + nama);
        System.out.println("Nilai Absen [10%] : " + NilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + NilaiTugas);
        System.out.println("Nilai UTS [30%]   : " + NilaiUts);
        System.out.println("Nilai UAS [40%]   : " + NilaiUas);
        System.out.println("Nilai Akhir       : " + NilaiAkhir);
    }
}