package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignUp_frame2 extends JFrame implements ActionListener {

    Long random;
    JTextField nameTextField, FTextField, qual_TEXT, addrTEXT, cityTEXT, stateTEXT, PNCTEXT;
    JButton next;
    JRadioButton male, female, married, Unmarried;
    JDateChooser JD;

    SignUp_frame2() {

        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM PAGE 2");


        setLayout(null);
        JLabel addDetails = new JLabel("Page 2 : Additional Details");
        addDetails.setFont(new Font("Raleway", Font.BOLD, 25));
       addDetails.setBounds(230, 80, 400, 30);
        add(addDetails);


        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        String valreligion[] = {"Hindu","Muslim","Christian","Sikh","Other"};
        JComboBox religion = new JComboBox<>(valreligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);



        JLabel Fname = new JLabel("Category:");
        Fname.setFont(new Font("Raleway", Font.BOLD, 20));
        Fname.setBounds(100, 190, 200, 30);
        add(Fname);
         String valcategory[] ={"General","OBC","SC","ST","Other"};
         JComboBox category = new JComboBox(valcategory);
         category.setBounds(300,190,400,30);
         category.setBackground(Color.WHITE);
         add(category);


        JLabel DOB = new JLabel("Income:");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 240, 300, 30);
        add(DOB);
        String valincome[] ={"NULL","<1,50,000","<2,50,000","5,00,000","Upto !0,00,000"};
        JComboBox income = new JComboBox(valincome);
       income.setBounds(300,240,200,30);
       income.setBackground(Color.WHITE);
        add(income);


        JLabel edu = new JLabel("Educational");
        edu.setFont(new Font("Raleway", Font.BOLD, 20));
        edu.setBounds(100, 290, 200, 30);
        add(edu);
        JLabel qual = new JLabel("Qualification:");
       qual.setFont(new Font("Raleway", Font.BOLD, 20));
        qual.setBounds(100, 315, 200, 30);
        add(qual);

        String valqualifiaction[] ={"Non-Graduate","Post-Graduate","Doctrate","10/SSLC","Others"};
        JComboBox qualification = new JComboBox(valqualifiaction);
        qualification.setBounds(300,315,400,30);
        qualification.setBackground(Color.WHITE);
        add(qualification);




        JLabel Marital_status = new JLabel("Occupation");
        Marital_status.setFont(new Font("Raleway", Font.BOLD, 20));
        Marital_status.setBounds(100, 390, 200, 30);
        add(Marital_status);

        String valOccupation[] ={"Salaried","Self-Employed","Bussiness","Student","Retired","Other"};
        JComboBox Occupation = new JComboBox(valqualifiaction);
        Occupation.setBounds(300,390,400,30);
       Occupation.setBackground(Color.WHITE);
        add(Occupation);

        JLabel addr = new JLabel("Pan:");
        addr.setFont(new Font("Raleway", Font.BOLD, 20));
        addr.setBounds(100, 440, 200, 30);
        add(addr);
        addrTEXT = new JTextField();
        addrTEXT.setFont(new Font("Raleway", Font.BOLD, 14));
        addrTEXT.setBounds(300, 440, 400, 30);
        add(addrTEXT);

        JLabel City = new JLabel("Aaahaar Number:");
        City.setFont(new Font("Raleway", Font.BOLD, 20));
        City.setBounds(100, 490, 200, 30);
        add(City);
        cityTEXT = new JTextField();
        cityTEXT.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTEXT.setBounds(300, 490, 400, 30);
        add(cityTEXT);

        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        stateTEXT = new JTextField();
        stateTEXT.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTEXT.setBounds(300, 540, 400, 30);
        add(stateTEXT);

        JLabel PNC = new JLabel("Existing Account?");
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
        String email = qual_TEXT.getText();
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
        new SignUp_frame2();
    }
}
