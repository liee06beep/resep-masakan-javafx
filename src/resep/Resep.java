package resep;

public class Resep {
    private String nama;
    private String bahan;
    private String langkah;

    public Resep(String nama, String bahan, String langkah) {
        this.nama = nama;
        this.bahan = bahan;
        this.langkah = langkah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getLangkah() {
        return langkah;
    }

    public void setLangkah(String langkah) {
        this.langkah = langkah;
    }
}
