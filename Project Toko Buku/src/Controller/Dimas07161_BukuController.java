package Controller;

import Entity.Dimas07161_BukuEntity;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Dimas07161_BukuController {
    
    public ArrayList<Dimas07161_BukuEntity> getListBuku(){
        return Dimas07161_AllObjectModel.bukuModel.listBuku();
    }
    
    public void insert(String nama_buku, String pengarang, String kategori, int stock, int harga){
        int id = Dimas07161_AllObjectModel.bukuModel.generateId();
        Dimas07161_AllObjectModel.bukuModel.insertBuku(new Dimas07161_BukuEntity(nama_buku, pengarang, kategori, id, stock, harga));
    }
    
    public void delete(String nama_buku){
        Dimas07161_AllObjectModel.bukuModel.delete(nama_buku);
    }
        
    public void update(String namabukulama, String nama_buku, String pengarang, String kategori, int stock, int harga){
        int id = Dimas07161_AllObjectModel.bukuModel.cari(namabukulama);
        Dimas07161_AllObjectModel.bukuModel.update(id, nama_buku, pengarang, kategori, stock, harga);
    }
    
    
    public DefaultTableModel databuku() {
        DefaultTableModel listbuku = new DefaultTableModel();
        Object[] kolom = {"ID Buku", "Nama Buku", "Pengarang", "Kategori", "Stock", "Harga"};
        listbuku.setColumnIdentifiers(kolom);
        int size = Dimas07161_AllObjectModel.bukuModel.listBuku().size();
        for (int i = 0; i < size; i++) {
            Object[] data = new Object[6];
            data[0] = Dimas07161_AllObjectModel.bukuModel.listBuku().get(i).getId();
            data[1] = Dimas07161_AllObjectModel.bukuModel.listBuku().get(i).getNama_buku();
            data[2] = Dimas07161_AllObjectModel.bukuModel.listBuku().get(i).getPengarang();
            data[3] = Dimas07161_AllObjectModel.bukuModel.listBuku().get(i).getKategori();
            data[4] = Dimas07161_AllObjectModel.bukuModel.listBuku().get(i).getStock();
            data[5] = Dimas07161_AllObjectModel.bukuModel.listBuku().get(i).getHarga();
            listbuku.addRow(data);
        }
        return listbuku;
    }
    
    // method to collect temporary data for item
    
//    public String getNamaBuku(int id_buku){
//        return Dimas07161_AllObjectModel.bukuModel.getNama(id_buku);
//    }
//    
//    public String getAuthor(int id_buku) {
//        return Dimas07161_AllObjectModel.bukuModel.getAuthorBook(id_buku);
//    }
//    
//    public String getJenis(int id_buku){
//        return Dimas07161_AllObjectModel.bukuModel.getKategori(id_buku);
//    }
//    
//    public int getPriceBook (int id_buku) {
//        return Dimas07161_AllObjectModel.bukuModel.getPrice(id_buku);
//    }
        
}