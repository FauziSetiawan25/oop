public class Pembeli {

    private String nama;
    private Toko.tipebarang barangDiBeli;
    private int jumlahBarang;

    public Pembeli(String nama, Toko.tipebarang barangDiBeli, int jumlahBarang){
        this.nama = nama;
        this.barangDiBeli = barangDiBeli;
        this.jumlahBarang = jumlahBarang;
    }
    public String getNama() {
        return nama;
    }
    public Toko.tipebarang getBarangDiBeli(){
        return barangDiBeli;
    }
    public int getJumlahBarang(){
        return jumlahBarang;
    }
}
