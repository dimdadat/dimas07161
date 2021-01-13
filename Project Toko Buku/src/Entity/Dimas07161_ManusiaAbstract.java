package Entity;

import java.util.Date;

public abstract class Dimas07161_ManusiaAbstract{
    protected String nama,password,alamat,no_ktp,no_telp;
    protected Date tglLahir;

    public Dimas07161_ManusiaAbstract(String nama, String password, String alamat, String no_ktp, String no_telp, Date tglLahir) {
        this.nama = nama;
        this.password = password;
        this.alamat = alamat;
        this.no_ktp = no_ktp;
        this.no_telp = no_telp;
        this.tglLahir = tglLahir;
    }

    public Dimas07161_ManusiaAbstract(){
        
    }
    
    public abstract String getNo_ktp();
    
    public void setNo_ktp(String no_ktp){
        this.no_ktp = no_ktp ;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }
    
}
