package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton login, sn, clear;
    JTextField cardTextField;
    JPasswordField PINTextField;
    Login(){
        setTitle("ATM");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label =  new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));

        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,230,30);
        add(pin);
        PINTextField = new JPasswordField();
        PINTextField.setBounds(300,220,230,30);
        add(PINTextField);

        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
       clear.addActionListener(this);
        add(clear);

        sn = new JButton("SIGN UP");
        sn.setBounds(300,350,230,30);
        sn.setBackground(Color.BLACK);
        sn.setForeground(Color.WHITE);
       sn.addActionListener(this);
        add(sn);

        getContentPane().setBackground(Color.WHITE);

        setSize(800,480);
        setVisible(true);
        setLocation(400, 200);
    }
    public void actionPerformed(ActionEvent ac){
if(ac.getSource()==clear){
cardTextField.setText("");
PINTextField.setText("");
}
    else if (ac.getSource()==login){}
    else if (ac.getSource()==sn) {
        setVisible(false);
        new SignUp_frame1().setVisible(true);
}

    }


    public static void main(String[] args) {
        new Login();
    }

}
