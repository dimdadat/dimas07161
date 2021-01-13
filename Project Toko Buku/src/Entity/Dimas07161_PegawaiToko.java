package Entity;

import java.util.Date;

public class Dimas07161_PegawaiToko extends Dimas07161_ManusiaAbstract{
    
    private String role;
    
    public Dimas07161_PegawaiToko(String nama, String password, String alamat, String no_ktp, String no_telp, Date tglLahir, String role) {
        super(nama, password, alamat, no_ktp, no_telp, tglLahir);
        this.role = role;
    }

    @Override
    public String getNo_ktp() {
        return no_ktp;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
