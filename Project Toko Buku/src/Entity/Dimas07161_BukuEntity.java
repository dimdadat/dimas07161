package Entity;

public class Dimas07161_BukuEntity {
    public String nama_buku,pengarang,kategori;
    public int id,stock,harga;

    public Dimas07161_BukuEntity(String nama_buku, String pengarang, String kategori, int id, int stock, int harga) {
        this.nama_buku = nama_buku;
        this.pengarang = pengarang;
        this.kategori = kategori;
        this.id = id;
        this.stock = stock;
        this.harga = harga;
    }

    public String getNama_buku() {
        return nama_buku;
    }

    public void setNama_buku(String nama_buku) {
        this.nama_buku = nama_buku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
