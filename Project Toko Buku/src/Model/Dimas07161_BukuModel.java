package Model;

import Entity.Dimas07161_BukuEntity;
import java.util.ArrayList;

public class Dimas07161_BukuModel{
    public ArrayList<Dimas07161_BukuEntity> bukuArrayList;
    
    public Dimas07161_BukuModel(){
        bukuArrayList = new ArrayList<Dimas07161_BukuEntity>();
    }
    
    public void insertBuku(Dimas07161_BukuEntity bukuentity){
        bukuArrayList.add(bukuentity);
    }
    
    public ArrayList<Dimas07161_BukuEntity> listBuku() {
        return bukuArrayList;
    }

    public Dimas07161_BukuEntity getBukuArrayList(int index){
        return bukuArrayList.get(index);
    }
    
    
    public String getNama(int id_buku){
        for (Dimas07161_BukuEntity item : bukuArrayList) {
            if (item.id == id_buku) {
                return item.nama_buku;
            }
        }
        return "";
    }
    
    public String getAuthorBook (int id_buku) {
        for (Dimas07161_BukuEntity item : bukuArrayList) {
            if (item.id == id_buku) {
                return item.pengarang;
            }
        }
        return "";
    }
    
    public String getKategori(int id_buku){
        for (Dimas07161_BukuEntity item : bukuArrayList) {
            if (item.id == id_buku) {
                return item.kategori;
            }
        }
        return "";
    }
    
    public int getPrice (int id_buku) {
        for (Dimas07161_BukuEntity item : bukuArrayList) {
            if (item.id == id_buku) {
                return item.harga;
            }
        }
        return 0;
    }
    
    public void updateStockBuku (int jumlah, int id_buku) {
        for (Dimas07161_BukuEntity item : bukuArrayList) {
            if (item.id == id_buku) {
                item.stock -= jumlah;
            }
        }
    }
    
    public int getPayment(int jumlah, int id_buku){
        for (Dimas07161_BukuEntity item : bukuArrayList) {
            if (item.id == id_buku){
                return item.harga * jumlah;
            }
        }
        return 0;
    }
    
    public int generateId(){
        return bukuArrayList.size();  
    }
    
    public int cari(String nama_buku){
        int index = -1;
        for (int i = 0; i < bukuArrayList.size(); i++)
        {
            if (nama_buku.equals(bukuArrayList.get(i).getNama_buku())){
                index = i;   
                break;
            } 
        }
        return index;
    }
            
    public void delete(String nama_buku){
        if(cari(nama_buku) != -1){
            bukuArrayList.remove(cari(nama_buku));
        }
    }
    
    public void update(int id, String nama_buku, String pengarang, String kategori, int stock, int harga){
        bukuArrayList.get(id).setNama_buku(nama_buku);
        bukuArrayList.get(id).setPengarang(pengarang);
        bukuArrayList.get(id).setKategori(kategori);
        bukuArrayList.get(id).setStock(stock);
        bukuArrayList.get(id).setHarga(harga);
    }
      
}