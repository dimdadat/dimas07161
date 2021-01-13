package Model;

import Entity.Dimas07161_PelangganToko;
import java.util.ArrayList;
        
public class Dimas07161_PelangganModel implements Dimas07161_ModelInterfaces{
    private ArrayList<Dimas07161_PelangganToko> pelangganArrayList;
    
    
    public Dimas07161_PelangganModel(){
        pelangganArrayList = new ArrayList<Dimas07161_PelangganToko>();
    }
    
    public void insertPelanggan(Dimas07161_PelangganToko pelanggantoko){
        pelangganArrayList.add(pelanggantoko);
    }
    
    public ArrayList<Dimas07161_PelangganToko> listPelanggan() {
        return pelangganArrayList;
    }
    
    @Override
    public int cekData(String nama, String password) {
        int loop = 0;
        while(!pelangganArrayList.get(loop).getNama().equals(nama) && !pelangganArrayList.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
    }
    
    public Dimas07161_PelangganToko getPelangganArrayList(int index){
        return pelangganArrayList.get(index);
    }
    
    public int generateIdUser(){
        return pelangganArrayList.size()+1;        
    }
    
    public String getName(int id){
        for (Dimas07161_PelangganToko user : pelangganArrayList) {
            if (user.id == id) {
                return user.getNama();
            }
        }
        return "";
    }
    
}
