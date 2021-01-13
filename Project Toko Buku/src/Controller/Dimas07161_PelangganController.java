package Controller;

import Entity.Dimas07161_PelangganToko;
import java.util.Date;

public class Dimas07161_PelangganController implements Dimas07161_ControllerInterface{
    int indexLogin = 0;    
    public void insert(String nama, String password, String alamat, String no_ktp, String no_telp, Date tglLahir, String email){
        Dimas07161_PelangganToko pelanggantoko = new Dimas07161_PelangganToko();
        int id = Dimas07161_AllObjectModel.pelangganModel.generateIdUser();
        pelanggantoko.setNama(nama);
        pelanggantoko.setPassword(password);
        pelanggantoko.setAlamat(alamat);
        pelanggantoko.setNo_ktp(no_ktp);
        pelanggantoko.setNo_telp(no_telp);
        pelanggantoko.setTglLahir(tglLahir);
        pelanggantoko.setId(id);
        pelanggantoko.setEmail(email);
        
        Dimas07161_AllObjectModel.pelangganModel.insertPelanggan(pelanggantoko);
    }
    
   
    public int getIndexPelanggan(String nama, String password){
        return Dimas07161_AllObjectModel.pelangganModel.cekData(nama, password);
    }

    @Override
    public void login(String npm, String password) {
        indexLogin = Dimas07161_AllObjectModel.pelangganModel.cekData(npm, password);
    }
    
    public String getUserlog (int id) {
        return Dimas07161_AllObjectModel.pelangganModel.getName(id);
    }
     
    public Dimas07161_PelangganToko pelanggan(){
        return Dimas07161_AllObjectModel.pelangganModel.getPelangganArrayList(indexLogin);
    }
    
}
