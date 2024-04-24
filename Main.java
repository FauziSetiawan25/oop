public class Main {
    public static void main(String[] args) {
        Toko mebell = new Toko();
        mebell.getGudangBarang().tambahBahan(Gudang.Bahan.KAYU,20);
        mebell.getGudangBarang().tambahBahan(Gudang.Bahan.BAUT,100);
        mebell.getGudangBarang().tambahBahan(Gudang.Bahan.CAT,15);

        mebell.getGudangBarang().buatBarang(Toko.tipebarang.KURSI,3);
        mebell.getGudangBarang().cekStokBahan();

        mebell.getGudangBarang().buatBarang(Toko.tipebarang.KURSI,5);
        mebell.getGudangBarang().buatBarang(Toko.tipebarang.MEJA,5);

        mebell.getGudangBarang().tambahBahan(Gudang.Bahan.KAYU,20);
        mebell.getGudangBarang().tambahBahan(Gudang.Bahan.BAUT,100);
        mebell.getGudangBarang().tambahBahan(Gudang.Bahan.CAT,15);
        mebell.getGudangBarang().cekStokBahan();

        mebell.getGudangBarang().buatBarang(Toko.tipebarang.KURSI,5);
        mebell.getGudangBarang().cekIsiGudang();

        Pembeli pembeli1 = new Pembeli("hanif", Toko.tipebarang.KURSI, 10);
        Pembeli pembeli2 = new Pembeli("muflih", Toko.tipebarang.MEJA, 5);
        Pembeli pembeli3 = new Pembeli("fabih", Toko.tipebarang.LEMARI, 3);

        mebell.tambahAntrian(pembeli1);
        mebell.tambahAntrian(pembeli2);
        mebell.tambahAntrian(pembeli3);
        mebell.cekAntrian();

        mebell.selesaikanAntrian();
        mebell.cekAntrian();
        mebell.getGudangBarang().cekIsiGudang();
    }
}
