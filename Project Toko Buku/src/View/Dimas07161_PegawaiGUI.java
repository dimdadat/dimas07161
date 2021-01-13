package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class Dimas07161_PegawaiGUI {
    JFrame LogReg = new JFrame();
    JLabel login, daftar, top;
    JTextField textlogin, textnama, textalamat, textnoktp, textnotelp, texttgllahir, textrole;
    JLabel labellogin, labelpasswordlogin, labelnama, labelpassworddaftar, labelalamat, 
            labelnoktp, labelnotelp, labeltgllahir, labelrole;
    JButton check, reg, back;
    JPasswordField passwordlogin, passworddaftar;
    
    
    public Dimas07161_PegawaiGUI(){
        LogReg.setSize(700, 700);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.PINK);
        
        top = new JLabel("Pegawai");
        top.setBounds(250, 10, 350, 60);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        LogReg.add(top);

        login = new JLabel("Login");
        login.setBounds(100, 40, 100, 100);
        login.setFont(new Font("Times New Roman", Font.BOLD,30));
        LogReg.add(login);

        labellogin = new JLabel("Nama");
        labellogin.setBounds(50, 120, 100, 30);
        LogReg.add(labellogin);        
        textlogin = new JTextField();
        textlogin.setBounds(50, 150, 150, 30);
        LogReg.add(textlogin);
        
        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(50, 180, 100, 30);
        LogReg.add(labelpasswordlogin);
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(50, 210, 150, 30);
        LogReg.add(passwordlogin);
        
        check = new JButton("Check");
        check.setBounds(70, 260, 100, 30);
        check.setBackground(Color.GREEN);
        LogReg.add(check);
        
        daftar = new JLabel("Daftar");
        daftar.setBounds(500, 40, 300, 100);
        daftar.setFont(new Font("Times New Roman", Font.BOLD,30));
        LogReg.add(daftar);
        
        labelnoktp = new JLabel("No KTP");
        labelnoktp.setBounds(470, 120, 100, 30);
        LogReg.add(labelnoktp);
        
        textnoktp = new JTextField();
        textnoktp.setBounds(470, 150, 150, 30);
        LogReg.add(textnoktp);
        
        labelnama = new JLabel("Nama");
        labelnama.setBounds(470, 180, 150, 30);
        LogReg.add(labelnama);
        
        textnama = new JTextField();
        textnama.setBounds(470, 210, 150, 30);
        LogReg.add(textnama);
        
        labelpassworddaftar = new JLabel("Password");
        labelpassworddaftar.setBounds(470, 240, 150, 30);
        LogReg.add(labelpassworddaftar);
        
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(470, 270, 150, 30);
        LogReg.add(passworddaftar);
        
        labelalamat = new JLabel("Alamat");
        labelalamat.setBounds(470, 300, 150, 30);
        LogReg.add(labelalamat);
        
        textalamat = new JTextField();
        textalamat.setBounds(470, 330, 150, 30);
        LogReg.add(textalamat);
        
        labelnotelp = new JLabel("No Telp");
        labelnotelp.setBounds(470, 360, 150, 30);
        LogReg.add(labelnotelp);
        
        textnotelp = new JTextField();
        textnotelp.setBounds(470, 390, 150, 30);
        LogReg.add(textnotelp);
        
        labeltgllahir = new JLabel("Tanggal Lahir (mm-dd-yyy)");
        labeltgllahir.setBounds(470, 420, 150, 30);
        LogReg.add(labeltgllahir);
        
        texttgllahir = new JTextField();
        texttgllahir.setBounds(470, 450, 150, 30);
        LogReg.add(texttgllahir);
        
        labelrole = new JLabel("Role");
        labelrole.setBounds(470, 480, 150, 30);
        LogReg.add(labelrole);
        
        textrole = new JTextField();
        textrole.setBounds(470, 510, 150, 30);
        LogReg.add(textrole);
        
        reg = new JButton("Regis");
        reg.setBounds(490, 560, 100, 30);
        reg.setBackground(Color.GREEN);
        LogReg.add(reg);
        
        back = new JButton("Kembali");
        back.setBounds(70, 560, 100, 30);
        LogReg.add(back);
        
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        
        check.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                    try {
                        allobj.pegawaiController.login(textlogin.getText(), passwordlogin.getText());
                        String nama = allobj.pegawaiController.pegawai().getNama();
                        JOptionPane.showMessageDialog(null, "selamat datang " + nama, "information", JOptionPane.INFORMATION_MESSAGE);
                        Dimas07161_BukuGUI buku = new Dimas07161_BukuGUI();
                        LogReg.dispose();
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "NPM atau password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            });
        
        back.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae) {
               Dimas07161_GUI gui = new Dimas07161_GUI();
               LogReg.dispose();
           } 
        });
            
        reg.addActionListener(new ActionListener() {            
            public void actionPerformed(ActionEvent ae){
                try{
                String nama = textnama.getText();
                String pass = passworddaftar.getText();
                String alamat = textalamat.getText();
                String noktp = textnoktp.getText();
                String notelp = textnotelp.getText();
                Date tgllahir = new Date(texttgllahir.getText());
                String role = textrole.getText();
                allobj.pegawaiController.insert(nama, pass, alamat, noktp, notelp, tgllahir, role);
                JOptionPane.showMessageDialog(null, "Registrasi Sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                kosong();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });
        
    }
    
    void kosong() {
        textnama.setText(null);
        passworddaftar.setText(null);
        textalamat.setText(null);
        textnoktp.setText(null);
        textnotelp.setText(null);
        texttgllahir.setText(null);
        textrole.setText(null);
    }
        
}
