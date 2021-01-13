package Controller;

import Entity.Dimas07161_PegawaiToko;
import java.util.ArrayList;
import java.util.Date;

public class Dimas07161_PegawaiController implements Dimas07161_ControllerInterface{
    int indexLogin = 0;
    
    public ArrayList<Dimas07161_PegawaiToko> getListPegawai () {
        return Dimas07161_AllObjectModel.pegawaiModel.listPegawai();
    }
    
    public void insert(String nama, String password, String alamat, String no_ktp, String no_telp, Date tglLahir, String role){
        Dimas07161_AllObjectModel.pegawaiModel.insertPegawai(new Dimas07161_PegawaiToko(nama, password, alamat, no_ktp, no_telp, tglLahir, role));
    }
    
    public int getIndexPegawai (String nama, String password) {
        return Dimas07161_AllObjectModel.pegawaiModel.cekData(nama, password);
    }
        
    @Override
    public void login(String npm, String password){
        indexLogin = Dimas07161_AllObjectModel.pegawaiModel.cekData(npm,password);
    }
    
    public Dimas07161_PegawaiToko pegawai(){
        return Dimas07161_AllObjectModel.pegawaiModel.getPegawaiArrayList(indexLogin);
    }

}
