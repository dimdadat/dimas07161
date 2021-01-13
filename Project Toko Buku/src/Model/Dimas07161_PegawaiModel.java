package Model;

import Entity.Dimas07161_PegawaiToko;
import java.util.ArrayList;
        
public class Dimas07161_PegawaiModel implements Dimas07161_ModelInterfaces{
    private ArrayList<Dimas07161_PegawaiToko> pegawaiArrayList;
    
    
    public Dimas07161_PegawaiModel(){
        pegawaiArrayList = new ArrayList<Dimas07161_PegawaiToko>();
    }
    
    public void insertPegawai(Dimas07161_PegawaiToko pegawaitoko){
        pegawaiArrayList.add(pegawaitoko);
    }
    
    public ArrayList<Dimas07161_PegawaiToko> listPegawai() {
        return pegawaiArrayList;
    }
    

    @Override
    public int cekData(String nama, String password) {
        int loop = 0;
        while(!pegawaiArrayList.get(loop).getNama().equals(nama) && !pegawaiArrayList.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
    }
    
    public Dimas07161_PegawaiToko getPegawaiArrayList(int index){
        return pegawaiArrayList.get(index);
    }
    
}
