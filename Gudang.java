import java.util.HashMap;

public class Gudang {
    enum Bahan{
        KAYU,
        BAUT,
        CAT
    }
    public Bahan bahan;
    public HashMap<Bahan, Integer> stokBahan = new HashMap<>();

    public HashMap<Toko.tipebarang , Integer> isiGudang = new HashMap<>();

    public void cekStokBahan(){
        System.out.println("\nStok Bahan :");
        for(HashMap.Entry<Bahan, Integer> entry: stokBahan.entrySet()){
            System.out.println("jumlah : " + entry.getKey() + ", saat ini adalah : " + entry.getValue() + " buah");
        }
        System.out.println();
    }
    public void cekIsiGudang(){
        isiGudang.put(Toko.tipebarang.MEJA, isiGudang.getOrDefault(Toko.tipebarang.MEJA,0));
        isiGudang.put(Toko.tipebarang.KURSI, isiGudang.getOrDefault(Toko.tipebarang.KURSI,0));
        isiGudang.put(Toko.tipebarang.LEMARI, isiGudang.getOrDefault(Toko.tipebarang.LEMARI,0));
        System.out.println("\nIsi Gudang :");
        for(HashMap.Entry<Toko.tipebarang, Integer> entry: isiGudang.entrySet()){
            System.out.println("jumlah : " + entry.getKey() + ", saat ini adalah : " + entry.getValue() + " buah");
        }
        System.out.println();
    }
    public void tambahBahan(Bahan jenisBahan, int jumlah){
        stokBahan.put(jenisBahan, stokBahan.getOrDefault(jenisBahan,0) + jumlah);
    }
    public void buatBarang(Toko.tipebarang jenisBarang, int jumlah){
        switch (jenisBarang){
            case MEJA:
                if(stokBahan.getOrDefault(Bahan.KAYU,0) >= jumlah * 3 &&
                        stokBahan.getOrDefault(Bahan.BAUT,0) >= jumlah * 20 &&
                        stokBahan.getOrDefault(Bahan.CAT,0) >= jumlah * 2){
                    if(isiGudang.getOrDefault(Toko.tipebarang.MEJA,0) <= 10 && jumlah <= 10) {
                        stokBahan.put(Bahan.KAYU, stokBahan.get(Bahan.KAYU) - jumlah * 3);
                        stokBahan.put(Bahan.BAUT, stokBahan.get(Bahan.BAUT) - jumlah * 20);
                        stokBahan.put(Bahan.CAT, stokBahan.get(Bahan.CAT) - jumlah * 2);
                        isiGudang.put(Toko.tipebarang.MEJA, isiGudang.getOrDefault(Toko.tipebarang.MEJA,0)+jumlah);
                        System.out.println(jumlah + " " + jenisBarang + " berhasil ditambahkan ke gudang");
                    }else {
                        System.out.println(jenisBarang + " Melebihi batas maksimal yang dapat disimppan di gudang");
                    }
                }else {
                    System.out.println("Bahan tidak cukup");
                }break;
            case KURSI:
                if(stokBahan.getOrDefault(Bahan.KAYU,0) >= jumlah * 2 &&
                        stokBahan.getOrDefault(Bahan.BAUT,0) >= jumlah * 10 &&
                        stokBahan.getOrDefault(Bahan.CAT,0) >= jumlah){
                    if(isiGudang.getOrDefault(Toko.tipebarang.KURSI,0) <= 20 && jumlah <= 20) {
                        stokBahan.put(Bahan.KAYU, stokBahan.get(Bahan.KAYU) - jumlah * 2);
                        stokBahan.put(Bahan.BAUT, stokBahan.get(Bahan.BAUT) - jumlah * 10);
                        stokBahan.put(Bahan.CAT, stokBahan.get(Bahan.CAT) - jumlah);
                        isiGudang.put(Toko.tipebarang.KURSI, isiGudang.getOrDefault(Toko.tipebarang.KURSI,0)+jumlah);
                        System.out.println(jumlah + " " + jenisBarang + " berhasil ditambahkan ke gudang");
                    }else {
                        System.out.println(jenisBarang + " Melebihi batas maksimal yang dapat disimppan di gudang");
                    }
                }else {
                    System.out.println("Bahan tidak cukup");
                }break;
            case LEMARI:
                if(stokBahan.getOrDefault(Bahan.KAYU,0) >= jumlah * 5 &&
                        stokBahan.getOrDefault(Bahan.BAUT,0) >= jumlah * 30 &&
                        stokBahan.getOrDefault(Bahan.CAT,0) >= jumlah * 3){
                    if(isiGudang.getOrDefault(Toko.tipebarang.LEMARI,0) <= 5 && jumlah <= 5) {
                        stokBahan.put(Bahan.KAYU, stokBahan.get(Bahan.KAYU) - jumlah * 5);
                        stokBahan.put(Bahan.BAUT, stokBahan.get(Bahan.BAUT) - jumlah * 30);
                        stokBahan.put(Bahan.CAT, stokBahan.get(Bahan.CAT) - jumlah * 3);
                        isiGudang.put(Toko.tipebarang.KURSI, isiGudang.getOrDefault(Toko.tipebarang.KURSI,0)+jumlah);
                        System.out.println(jumlah + " " + jenisBarang + " berhasil ditambahkan ke gudang");
                    }else {
                        System.out.println(jenisBarang + " Melebihi batas maksimal yang dapat disimppan di gudang");
                    }
                }else {
                    System.out.println("Bahan tidak cukup");
                }break;
        }
    }

}
