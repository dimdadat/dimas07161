package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class Dimas07161_GUI {
    JFrame menu = new JFrame();
    JButton pegawai, pelanggan;
    JLabel top;
    
    public Dimas07161_GUI(){
        menu.setSize(400, 400);
        menu.setLayout(null);
        menu.getContentPane().setBackground(Color.PINK);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        
        top = new JLabel("TOKO BUKU");
        top.setBounds(70, 50, 300, 30);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        menu.add(top);
        
        pegawai = new JButton("Pegawai");
        pegawai.setBounds(120, 150, 150, 40);
        pegawai.setBackground(Color.GREEN);
        menu.add(pegawai);
        
        pelanggan = new JButton("Pelanggan");
        pelanggan.setBounds(120, 200, 150, 40);
        pelanggan.setBackground(Color.GREEN);
        menu.add(pelanggan);
        
        pegawai.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Dimas07161_PegawaiGUI Pegawai = new Dimas07161_PegawaiGUI();
                    menu.dispose();
                }
        });
        
        pelanggan.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Dimas07161_PelangganGUI Pelanggan = new Dimas07161_PelangganGUI();
                    menu.dispose();
                }
        });
    }
}
