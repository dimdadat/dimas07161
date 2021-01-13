package Model;

import Entity.Dimas07161_Transaksi;
import java.util.ArrayList;

public class Dimas07161_TransaksiModel {
    public ArrayList<Dimas07161_Transaksi> transaksiArrayList;
    
    public Dimas07161_TransaksiModel(){
        transaksiArrayList = new ArrayList<Dimas07161_Transaksi>();
    }
    
    public void insert(Dimas07161_Transaksi transaksi) {
         transaksiArrayList.add(transaksi);
    }
    
    public ArrayList<Dimas07161_Transaksi> listTransaksi(){
        return transaksiArrayList;
    }
    
    public int generateId(){
        return transaksiArrayList.size()+1;
    }
}
