import javax.swing.*;
import java.awt.*;
public class Login extends JFrame{
    JLabel labelusername;
    JLabel labelpassword;
    JTextField user;
    JPasswordField pass;
    JButton Btn;
    public Login(){
        setTitle("Login Page");
        setSize(600,400);
        setLocation(100,100);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //for login
        labelusername = new JLabel("User Name");
        labelusername.setForeground(Color.gray);
        labelusername.setFont(new Font("Times in Roman", Font.BOLD,20));
        labelusername.setBounds(50,50,200,20);
        add(labelusername);

        labelpassword = new JLabel("Password");
        labelpassword.setForeground(Color.gray);
        labelpassword.setFont(new Font("Times in Roman", Font.BOLD,20));
        labelpassword.setBounds(50,100,200,20);
        add(labelpassword);

        user = new JTextField();
        user.setBounds(210,50,120,20);
        add(user);
        pass = new JPasswordField();
        pass.setBounds(210,100,120,20);
        add(pass);
        Btn = new JButton("LOGIN" );
        Btn.setBounds(150,200,130,30);
        add(Btn);


    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }



}
