import java.util.ArrayList;

public class Toko {
    private ArrayList<Pembeli> antrian = new ArrayList<>();
    private Gudang gudangBarang = new Gudang();
    enum tipebarang {
        MEJA,
        KURSI,
        LEMARI
    }
    public Gudang getGudangBarang() {
        return gudangBarang;
    }

    public void tambahAntrian(Pembeli pembeli) {
        antrianpePenuh();
        if (!penuh) {
            antrian.add(pembeli);
            System.out.println("berhasil menambah antrian");
        } else {
            System.out.println("Antian penuh!");
        }
    }

    public void cekAntrian() {
        System.out.println("\nLIST ANTRIAN :");
        for (int i = 0; i < antrian.size(); i++) {
            System.out.println("antrian ke " + (i + 1) + ", nama : " + antrian.get(i).getNama() + ", barang dibeli " + antrian.get(i).getBarangDiBeli() + ", jumlah barang dibeli : " + antrian.get(i).getJumlahBarang());
        }
    }

    public void selesaikanAntrian() {
                barangDibeliTersedia2();
                if (barangAda) {
                    gudangBarang.isiGudang.put(antrian.getFirst().getBarangDiBeli(), gudangBarang.isiGudang.get(antrian.getFirst().getBarangDiBeli()) - antrian.getFirst().getJumlahBarang());
                    System.out.println("\n" + antrian.getFirst().getJumlahBarang() + " " + antrian.getFirst().getBarangDiBeli() + " berhasil dikeluarkan dari gudang");
                    antrian.removeFirst();
                    System.out.println("antrain terdepan berhasil terselesaikan");
                }else {
                System.out.println("barang tidak cukup");
            }
        }

    private boolean penuh = false;
    private boolean antrianpePenuh() {
        penuh = antrian.size() >= 5;
        return penuh;
    }
    private boolean barangAda = false;
    private boolean barangDibeliTersedia2() {
        barangAda = gudangBarang.isiGudang.getOrDefault(antrian.getFirst().getBarangDiBeli(), 0) >= antrian.getFirst().getJumlahBarang();
        return barangAda;
    }
}