package Entity;

public class Dimas07161_Transaksi {
    
    public int id,id_buku,id_user,jumlah, total;

    public Dimas07161_Transaksi(int id,int id_buku, int loggedUser, int jumlah, int total) {
        this.jumlah = jumlah;
        this.total = total;
        this.id = id;
        this.id_buku = id_buku;
        this.id_user = loggedUser;
    }
    
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
  
}
