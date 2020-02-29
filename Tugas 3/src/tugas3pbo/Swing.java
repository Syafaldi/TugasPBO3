package tugas3pbo;

import java.awt.*;
import javax.swing.*;

public class Swing extends JFrame{
    JButton ok;
    JTextField nama,nim;
    Label labelnama,labelnim,labeljk,labelagama,labelalamat,labelprogram;
    JRadioButton laki,perempuan;
    JComboBox agama;
    JTextArea alamat;
    String[] namaagama = {"Islam","Kristen","Hindu","Katolik","Buddha"};

    public void window(){
        setTitle("Data diri mahasiswa");
        ok = new JButton("OK");
        labelnama = new Label("Nama");
        labelnim = new Label("NIM");
        labeljk = new Label("Jenis Kelamin");
        labelagama = new Label("Agama");
        labelalamat = new Label("Alamat");
        labelprogram = new Label("DATA DIRI MAHASISWA");
        nama = new JTextField();
        nim = new JTextField();
        laki = new JRadioButton("Laki - laki");
        perempuan = new JRadioButton("Perempuan");
        agama = new JComboBox(namaagama);
        alamat = new JTextArea();

        ButtonGroup group = new ButtonGroup();
        group.add(laki);
        group.add(perempuan);

        setLayout(null);
        add(ok);
        add(labelprogram);
        add(labelnama);
        add(labelnim);
        add(labeljk);
        add(labelagama);
        add(labelalamat);
        add(nama);
        add(nim);
        add(laki);
        add(perempuan);
        add(agama);
        add(alamat);

        labelprogram.setBounds(175,10,150,30);

        labelnama.setBounds(20,50,100,20);
        nama.setBounds(120,50,300,20);

        labelnim.setBounds(20,80,100,20);
        nim.setBounds(120,80,300,20);

        labeljk.setBounds(20,110,100,20);
        laki.setBounds(120,110,100,20);
        perempuan.setBounds(220,110,100,20);

        labelagama.setBounds(20,140,100,20);
        agama.setBounds(120,140,100,20);

        labelalamat.setBounds(20,170,100,20);
        alamat.setBounds(120,170,300,200);

        ok.setBounds(215,400,70,30);

        pack();
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }


}
