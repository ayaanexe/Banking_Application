package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignUp_frame1  extends JFrame implements ActionListener {

        Long random;
        JTextField nameTextField, FTextField, email_TEXT, addrTEXT, cityTEXT, stateTEXT, PNCTEXT;
        JButton next;
        JRadioButton male, female, married, Unmarried;
        JDateChooser JD;

        SignUp_frame1() {

        setLayout(null);
        Random rand = new Random();
        random = Math.abs((rand.nextLong() % 9000L + 1000L));
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        setLayout(null);
        JLabel PersonalDetails = new JLabel("Page 1 : Personal Details");
        PersonalDetails.setFont(new Font("Raleway", Font.BOLD, 25));
        PersonalDetails.setBounds(230, 80, 400, 30);
        add(PersonalDetails);


        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        JLabel Fname = new JLabel("Father's Name:");
        Fname.setFont(new Font("Raleway", Font.BOLD, 20));
        Fname.setBounds(100, 190, 200, 30);
        add(Fname);
        FTextField = new JTextField();
        FTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        FTextField.setBounds(300, 190, 400, 30);
        add(FTextField);

        JLabel DOB = new JLabel("DOB:");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 240, 300, 30);
        add(DOB);
        JD = new JDateChooser();
        JD.setBounds(300, 240, 200, 30);
        add(JD);

        JLabel Gender = new JLabel("Gender:");
        Gender.setFont(new Font("Raleway", Font.BOLD, 20));
        Gender.setBounds(100, 290, 400, 30);
        add(Gender);
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        email_TEXT = new JTextField();
        email_TEXT.setFont(new Font("Raleway", Font.BOLD, 14));
        email_TEXT.setBounds(300, 340, 400, 30);
        add(email_TEXT);


        JLabel Marital_status = new JLabel("Marital status:");
        Marital_status.setFont(new Font("Raleway", Font.BOLD, 20));
        Marital_status.setBounds(100, 390, 200, 30);
        add(Marital_status);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);

        Unmarried = new JRadioButton("Unmarried");
        Unmarried.setBounds(450, 390, 100, 30);
        Unmarried.setBackground(Color.WHITE);
        add(Unmarried);

        ButtonGroup Other = new ButtonGroup();
        Other.add(married);
        Other.add(Unmarried);

        JLabel addr = new JLabel("Address:");
        addr.setFont(new Font("Raleway", Font.BOLD, 20));
        addr.setBounds(100, 440, 200, 30);
        add(addr);
        addrTEXT = new JTextField();
        addrTEXT.setFont(new Font("Raleway", Font.BOLD, 14));
        addrTEXT.setBounds(300, 440, 400, 30);
        add(addrTEXT);

        JLabel City = new JLabel("City:");
        City.setFont(new Font("Raleway", Font.BOLD, 20));
        City.setBounds(100, 490, 200, 30);
        add(City);
        cityTEXT = new JTextField();
        cityTEXT.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTEXT.setBounds(300, 490, 400, 30);
        add(cityTEXT);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        stateTEXT = new JTextField();
        stateTEXT.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTEXT.setBounds(300, 540, 400, 30);
        add(stateTEXT);

        JLabel PNC = new JLabel("Pin:");
        PNC.setFont(new Font("Raleway", Font.BOLD, 20));
        PNC.setBounds(100, 590, 200, 30);
        add(PNC);
        PNCTEXT = new JTextField();
        PNCTEXT.setFont(new Font("Raleway", Font.BOLD, 14));
        PNCTEXT.setBounds(300, 590, 400, 30);
        add(PNCTEXT);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
public void actionPerformed(ActionEvent ae){
            String formno =""+random;
            String name = nameTextField.getText();
            String Fname = FTextField.getText();
            String dob =((JTextField)JD.getDateEditor().getUiComponent()).getText();
            String gender = null;
            if(male.isSelected()){
                gender = "Male";
            } else if (female.isSelected()) {
                gender = "Female";
            }
            String email = email_TEXT.getText();
            String marital = null;
            if(married.isSelected()){
                marital = "Married";
            }
            else if(Unmarried.isSelected()){
                    marital = "Unmarried";
            }
            String address = addrTEXT.getText();;
            String city = cityTEXT.getText();;
    String state = stateTEXT.getText();
    String pin = PNCTEXT.getText();

    try {
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null,"Name is required");
        } else{
            con c = new con();
            String query ="insert into signup values('"+formno+"','"+name+"','"+Fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
            c.s.executeUpdate(query);
        }
    }catch(Exception e){
        System.out.println(e);
    }
}
        public static void main (String[]args){
        new SignUp_frame1();
    }
    }
