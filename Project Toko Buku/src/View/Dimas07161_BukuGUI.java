package View;

import Controller.Dimas07161_BukuController;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dimas07161_BukuGUI{
    JFrame RegBook = new JFrame();
    JLabel top;
    JButton reg, back, edit, hapus, datatransaksi;
    JTable tabelbuku = new JTable();
    JLabel labelnama, labelpengarang, labelkategori, labelstock, labelharga;
    JTextField textnama, textpengarang, textkategori, textstock, textharga;
    JScrollPane scroll = new JScrollPane(tabelbuku);
    private boolean cek = false;
    String namabukulama;
    
    public Dimas07161_BukuGUI(){
        RegBook.setSize(1000, 650);
        RegBook.setLayout(null);
        RegBook.getContentPane().setBackground(Color.PINK);
        
        top = new JLabel("BUKU");
        top.setBounds(450, 20, 250, 30);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        RegBook.add(top);
        
        scroll.setBounds(30, 100, 570, 200);
        tabelbuku.setModel(allobj.bukuController.databuku());
        RegBook.add(scroll);     
        
        datatransaksi = new JButton("Tampilkan Data Transaksi");
        datatransaksi.setBounds(400, 320, 200, 30);
        RegBook.add(datatransaksi);
        
        labelnama = new JLabel("Nama Buku");
        labelnama.setBounds(700, 90, 70, 30);
        RegBook.add(labelnama);
        
        textnama = new JTextField();
        textnama.setBounds(700, 120, 150, 30);
        RegBook.add(textnama);
        
        labelpengarang = new JLabel("Pengarang");
        labelpengarang.setBounds(700, 150, 70, 30);
        RegBook.add(labelpengarang);
        
        textpengarang = new JTextField();
        textpengarang.setBounds(700, 180, 150, 30);
        RegBook.add(textpengarang);
        
        labelkategori = new JLabel("Kategori");
        labelkategori.setBounds(700, 210, 70, 30);
        RegBook.add(labelkategori);
        
        textkategori = new JTextField();
        textkategori.setBounds(700, 240, 150, 30);
        RegBook.add(textkategori);
        
        labelstock = new JLabel("Stock");
        labelstock.setBounds(700, 270, 70, 30);
        RegBook.add(labelstock);
        
        textstock = new JTextField();
        textstock.setBounds(700, 300, 150, 30);
        RegBook.add(textstock);
        
        labelharga = new JLabel("Harga");
        labelharga.setBounds(700, 330, 70, 30);
        RegBook.add(labelharga);
        
        textharga = new JTextField();
        textharga.setBounds(700, 360, 150, 30);
        RegBook.add(textharga);
        
        reg = new JButton("Regis");
        reg.setBounds(700, 410, 70, 30);
        RegBook.add(reg);
                 
        edit = new JButton("Update");
        edit.setBounds(775, 410, 75, 30);
        RegBook.add(edit);
        
        hapus = new JButton("Hapus");
        hapus.setBounds(855, 410, 75, 30);
        RegBook.add(hapus);
        
        back = new JButton("Kembali");
        back.setBounds(30, 520, 100, 30);
        RegBook.add(back);
        
        RegBook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RegBook.setVisible(true);
        RegBook.setLocationRelativeTo(null);
        
        reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                String nama = textnama.getText();
                String pengarang = textpengarang.getText();
                String kategori = textkategori.getText();
                int stock = Integer.parseInt(textstock.getText());
                int harga = Integer.parseInt(textharga.getText());
                allobj.bukuController.insert(nama, pengarang, kategori, stock, harga);
                JOptionPane.showMessageDialog(null, "Registrasi Sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                tabelbuku.setModel(allobj.bukuController.databuku());
                kosong();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Gagal", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });
        
        back.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae) {
               Dimas07161_PegawaiGUI peg = new Dimas07161_PegawaiGUI();
               RegBook.dispose();
           } 
        });
        
        datatransaksi.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae) {
               ViewTransaksi tran = new ViewTransaksi();
               RegBook.dispose();
           } 
        });
        
        tabelbuku.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                int i = tabelbuku.getSelectedRow();
                namabukulama = allobj.bukuController.databuku().getValueAt(i, 1).toString();
                textnama.setText(allobj.bukuController.databuku().getValueAt(i, 1).toString());
                textpengarang.setText(allobj.bukuController.databuku().getValueAt(i, 2).toString());
                textkategori.setText(allobj.bukuController.databuku().getValueAt(i, 3).toString());
                textstock.setText(allobj.bukuController.databuku().getValueAt(i, 4).toString());
                textharga.setText(allobj.bukuController.databuku().getValueAt(i, 5).toString());
            }
        });
        
        edit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
               String nama_buku = textnama.getText();
               String pengarang = textpengarang.getText();
               String kategori = textkategori.getText(); 
               int stock = Integer.parseInt(textstock.getText());
               int harga = Integer.parseInt(textharga.getText());
               
               allobj.bukuController.update(namabukulama, nama_buku, pengarang, kategori ,stock, harga);
               JOptionPane.showMessageDialog(null, "update Sukses", "information", JOptionPane.INFORMATION_MESSAGE);
               tabelbuku.setModel(allobj.bukuController.databuku());
               kosong();
            }
           
        });

        hapus.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae){
                String nama = textnama.getText();
                allobj.bukuController.delete(nama);
                JOptionPane.showMessageDialog(null, "Hapus Sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                tabelbuku.setModel(allobj.bukuController.databuku());
                kosong();
           } 
        });
        
    }      
    
    void kosong() {
        textnama.setText(null);
        textpengarang.setText(null);
        textkategori.setText(null);
        textstock.setText(null);
        textharga.setText(null);
    }
}
