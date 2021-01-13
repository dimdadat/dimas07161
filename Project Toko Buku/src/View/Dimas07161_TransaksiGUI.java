package View;

import Controller.Dimas07161_BukuController;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class Dimas07161_TransaksiGUI {
    JFrame Buy = new JFrame();
    JTable tabelbuku = new JTable();
    JLabel top;
    JButton back, buy;
    JLabel labelid, labeljumlah;
    JTextField textid, textjumlah;
    JScrollPane scroll = new JScrollPane(tabelbuku);
    
    public Dimas07161_TransaksiGUI(int loggedUser){
        Buy.setSize(700, 500);
        Buy.setLayout(null);
        Buy.getContentPane().setBackground(Color.PINK);
        
        top = new JLabel("Transaksi");
        top.setBounds(280, 20, 150, 30);
        top.setFont(new Font("Times New Roman",Font.BOLD, 30));
        Buy.add(top);
        
        scroll.setBounds(30, 70, 630, 150);
        tabelbuku.setModel(allobj.bukuController.databuku());
        Buy.add(scroll);
        
        labelid = new JLabel("Pilih ID Buku");
        labelid.setBounds(510, 220, 150, 30);
        Buy.add(labelid);
        
        textid = new JTextField();
        textid.setBounds(510, 250, 150, 30);
        Buy.add(textid);
        
        labeljumlah = new JLabel("Jumlah yang ingin di beli");
        labeljumlah.setBounds(510, 280, 250, 30);
        Buy.add(labeljumlah);
        
        textjumlah = new JTextField();
        textjumlah.setBounds(510, 310, 150, 30);
        Buy.add(textjumlah);
        
        buy = new JButton("Beli");
        buy.setBounds(535, 350, 100, 30);
        Buy.add(buy);
        
        back = new JButton("Kembali");
        back.setBounds(30, 400, 100, 30);
        Buy.add(back);
        
        Buy.setVisible(true);
        Buy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Buy.setLocationRelativeTo(null);
        
        back.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent ae){
                Dimas07161_PelangganGUI gui = new Dimas07161_PelangganGUI();
                Buy.dispose();
            }
        });
        
        buy.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae){
               try{
                int id_buku = Integer.parseInt(textid.getText());
                int jumlah = Integer.parseInt(textjumlah.getText());
                allobj.transaksiController.updateStock(jumlah, id_buku);
                int total = allobj.transaksiController.getPayments(jumlah, id_buku);
                allobj.transaksiController.saveTransaction(id_buku, loggedUser, jumlah, total);
                JOptionPane.showMessageDialog(null, "Transaksi Sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                tabelbuku.setModel(allobj.bukuController.databuku());
                kosong();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
           } 
        });
       
    }
    
    void kosong() {
        textid.setText(null);
        textjumlah.setText(null);
    }
    
    
}
