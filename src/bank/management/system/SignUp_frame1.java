package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignUp_frame1  extends JFrame {

    SignUp_frame1(){
        setLayout(null);
        Random rand = new Random();
        Long random = Math.abs((rand.nextLong()%9000L+1000L));
        JLabel formno = new JLabel("APPLICATION FORM NO. " +random);
        formno.setFont(new Font("Raleway", Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);

        setLayout(null);
        JLabel PersonalDetails = new JLabel("Page 1 : Personal Details");
        PersonalDetails.setFont(new Font("Raleway", Font.BOLD,25));
        PersonalDetails.setBounds(230,80,400,30);
        add(PersonalDetails);


        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);

        JLabel Fname = new JLabel("Father's Name:");
        Fname.setFont(new Font("Raleway", Font.BOLD,20));
        Fname.setBounds(100,190,200,30);
        add(Fname);
        JTextField FTextField = new JTextField();
        FTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        FTextField.setBounds(300,190,400,30);
        add(FTextField);

        JLabel DOB = new JLabel("DOB:");
        DOB.setFont(new Font("Raleway", Font.BOLD,20));
        DOB.setBounds(100,240,300,30);
        add(DOB);
        JDateChooser JD= new JDateChooser();
        JD.setBounds(300,240,200,30);
        add(JD);

        JLabel Gender = new JLabel("Gender:");
        Gender.setFont(new Font("Raleway", Font.BOLD,20));
        Gender.setBounds(100,290,400,30);
        add(Gender);
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        JTextField email_TEXT = new JTextField();
        email_TEXT.setFont(new Font("Raleway",Font.BOLD, 14));
        email_TEXT.setBounds(300,340,400,30);
        add(email_TEXT);


        JLabel Marital_status = new JLabel("Marital status:");
        Marital_status.setFont(new Font("Raleway", Font.BOLD,20));
        Marital_status.setBounds(100,390,200,30);
        add(Marital_status);

        JRadioButton married = new JRadioButton("Married");
       married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);

        JRadioButton Unmarried = new JRadioButton("Unmarried");
        Unmarried.setBounds(450,390,100,30);
        Unmarried.setBackground(Color.WHITE);
        add(Unmarried);

        ButtonGroup Other = new ButtonGroup();
        Other.add(married);
        Other.add(Unmarried);

        JLabel addr = new JLabel("Address:");
        addr.setFont(new Font("Raleway", Font.BOLD,20));
        addr.setBounds(100,440,200,30);
        add(addr);
        JTextField addrTEXT = new JTextField();
        addrTEXT.setFont(new Font("Raleway",Font.BOLD, 14));
        addrTEXT.setBounds(300,440,400,30);
        add(addrTEXT);

        JLabel City = new JLabel("City:");
        City.setFont(new Font("Raleway", Font.BOLD,20));
        City.setBounds(100,490,200,30);
        add(City);
        JTextField cityTEXT = new JTextField();
        cityTEXT.setFont(new Font("Raleway",Font.BOLD, 14));
        cityTEXT.setBounds(300,490,400,30);
        add(cityTEXT);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        JTextField stateTEXT = new JTextField();
        stateTEXT.setFont(new Font("Raleway",Font.BOLD, 14));
         stateTEXT.setBounds(300,540,400,30);
        add(stateTEXT);

        JLabel PNC = new JLabel("Pin:");
        PNC.setFont(new Font("Raleway", Font.BOLD,20));
        PNC.setBounds(100,590,200,30);
        add(PNC);
        JTextField PNCTEXT = new JTextField();
        PNCTEXT.setFont(new Font("Raleway",Font.BOLD, 14));
        PNCTEXT.setBounds(300,590,400,30);
        add(PNCTEXT);

        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        add(next);


        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignUp_frame1();
    }
}
