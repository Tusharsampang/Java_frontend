import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Divide extends JFrame implements ActionListener {
    JTextField first;
    JTextField second;
    JButton Btn;
    JLabel labellbl;

    public Divide() {
        setSize(400, 300);
        setLocation(50, 50);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        first = new JTextField();
        first.setBounds(50, 50, 200, 20);
        add(first);
        second = new JTextField();
        second.setBounds(50, 80, 200, 20);
        add(second);

        labellbl =  new JLabel("result =  ");
        labellbl.setForeground(Color.gray);
        labellbl.setFont(new Font("Times in Roman", Font.BOLD,20));
        labellbl.setBounds(50,110,200,20);
        add(labellbl);
        Btn = new JButton(" / ");
        Btn.setBounds(150, 200, 130, 30);
        add(Btn);
        Btn.addActionListener(this);
    }

    public static void main(String[] args) {
        new Divide().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(first.getText());
        int b = Integer.parseInt(second.getText());
        int c =0;


        if (e.getSource().equals(Btn)) {
            c = a / b;
            labellbl.setText(String.valueOf(c));
        }else {
            System.out.println("Error");
        }







    }
}