package aplikasiresep.model;

public class Resep {
    private String nama;
    private String bahan;
    private String langkah;

    public Resep(String nama, String bahan, String langkah) {
        this.nama = nama;
        this.bahan = bahan;
        this.langkah = langkah;
    }

    public String getNama() { return nama; }
    public String getBahan() { return bahan; }
    public String getLangkah() { return langkah; }

    @Override
    public String toString() {
        return nama;
    }
}
