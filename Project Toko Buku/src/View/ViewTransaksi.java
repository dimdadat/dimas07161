package View;

import Controller.Dimas07161_TransaksiController;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class ViewTransaksi {
    JFrame view = new JFrame();
    JButton back;
    JTable tabelview = new JTable();
    JLabel top;
    JScrollPane scroll = new JScrollPane(tabelview);
    
    public ViewTransaksi(){
        view.setSize(700, 400);
        view.setLayout(null);
        view.setVisible(true);
        view.getContentPane().setBackground(Color.PINK);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setLocationRelativeTo(null);
        
        top = new JLabel("Data Transaksi");
        top.setBounds(250, 20, 250, 30);
        top.setFont(new Font("Times News Roman",Font.BOLD, 30));
        view.add(top);
        
        scroll.setBounds(30, 70, 630, 200);
        tabelview.setModel(allobj.transaksiController.datatransaksi());
        view.add(scroll);
        
        back = new JButton("Kembali");
        back.setBounds(30 , 310, 100, 30);
        view.add(back);
        
        back.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae) {
               Dimas07161_BukuGUI gui = new Dimas07161_BukuGUI();
               view.dispose();
           } 
        });
        
    }
}
