
package Controller;

import Entity.Dimas07161_Transaksi;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Dimas07161_TransaksiController {
    
    public ArrayList<Dimas07161_Transaksi> getListTransaksi () {
        return Dimas07161_AllObjectModel.transaksiModel.listTransaksi();
    }
    
    public void updateStock (int jumlah, int id_buku) {
        Dimas07161_AllObjectModel.bukuModel.updateStockBuku(jumlah, id_buku);
    }
    
    public int getPayments (int jumlah, int id_buku){
        return Dimas07161_AllObjectModel.bukuModel.getPayment(jumlah, id_buku);
    }
    
    public void saveTransaction(int id_buku, int loggedUser, int jumlah, int total) {
        int id = Dimas07161_AllObjectModel.transaksiModel.generateId();
        Dimas07161_AllObjectModel.transaksiModel.insert(new Dimas07161_Transaksi(id ,id_buku, loggedUser, jumlah, total));
    } 
    
    public String getNamaBuku(int id_buku){
        return Dimas07161_AllObjectModel.bukuModel.getNama(id_buku);
    }
    
    public String getAuthor(int id_buku) {
        return Dimas07161_AllObjectModel.bukuModel.getAuthorBook(id_buku);
    }
    
    public String getCategory(int id_buku){
        return Dimas07161_AllObjectModel.bukuModel.getKategori(id_buku);
    }
    
    public int getPriceBook (int id_buku) {
        return Dimas07161_AllObjectModel.bukuModel.getPrice(id_buku);
    }

    public DefaultTableModel datatransaksi() {
        DefaultTableModel listtransaksi = new DefaultTableModel();
        Object[] kolom = {"ID Transaksi", "ID Pelanggan", "ID Buku", "Jumlah", "Total Harga"};
        listtransaksi.setColumnIdentifiers(kolom);
        int size = Dimas07161_AllObjectModel.transaksiModel.listTransaksi().size();
        for (int i = 0; i < size; i++) {
            Object[] data = new Object[5];
            data[0] = Dimas07161_AllObjectModel.transaksiModel.listTransaksi().get(i).id;
            data[1] = Dimas07161_AllObjectModel.transaksiModel.listTransaksi().get(i).id_user;
            data[2] = Dimas07161_AllObjectModel.transaksiModel.listTransaksi().get(i).id_buku;
            data[3] = Dimas07161_AllObjectModel.transaksiModel.listTransaksi().get(i).jumlah;
            data[4] = Dimas07161_AllObjectModel.transaksiModel.listTransaksi().get(i).total;
            listtransaksi.addRow(data);
        }
        return listtransaksi;
    }
}
