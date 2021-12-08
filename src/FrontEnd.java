import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrontEnd extends JFrame implements ActionListener{

    JButton btn1;
    JButton btn2;
    JButton btn3;

    public FrontEnd(){
        setTitle("Sample");
        setLayout(null);
        setSize(400,300);
        setResizable(false);
        setLocation(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Button for login page
        btn1 = new JButton("login");
        btn1.setForeground(Color.gray);
        btn1.setBounds(100,40,150,30);
        btn1.setBackground(Color.white);
        btn1.setFont(new Font("Times in Roman", Font.BOLD,30));
        add(btn1);
        btn1.addActionListener(this);


        //Button for Sign_up  page
        btn2 = new JButton("REGISTER");
        btn2.setForeground(Color.gray);
        btn2.setBounds(100,90,190,30);
        btn2.setBackground(Color.white);
        btn2.setFont(new Font("Times in Roman", Font.BOLD,30));
        add(btn2);
        btn2.addActionListener(this);

        //Button for simple interest
        btn3 = new JButton("SIMPLE INTEREST");
        btn3.setForeground(Color.gray);
        btn3.setBounds(20,130,310,30);
        btn3.setBackground(Color.white);
        btn3.setFont(new Font("Times in Roman", Font.BOLD,30));
        add(btn3);
        btn3.addActionListener(this);



    }

    public static void main(String[] args) {

        new FrontEnd().setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn1)) {
            JOptionPane.showConfirmDialog(null, "Are you want to login??");
            dispose();
            new Login().setVisible(true);
        }
        if (e.getSource().equals(btn2)) {
            JOptionPane.showConfirmDialog(null, "Do you want to register??");
            dispose();
            new SignUp().setVisible(true);
        }
        if (e.getSource().equals(btn3)) {
            JOptionPane.showConfirmDialog(null, "Simple interest");
            dispose();
            new SimpleInterest().setVisible(true);
        }
    }
}