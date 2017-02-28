package DefaultPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Scott on 28/02/2017.
 */
public class Login extends JPanel implements ActionListener{
    JLabel userL = new JLabel("Username");
    JTextField userTF = new JTextField();
    JLabel passL = new JLabel("Password: ");
    JPasswordField passTF = new JPasswordField();
    JPanel loginP = new JPanel(new GridLayout(3,2));
    JPanel panel = new JPanel();
    JButton login = new JButton("Login");
    JButton register = new JButton("Register");
    CardLayout cl;


    Login(){
        setLayout(new CardLayout());
        loginP.add(userL);
        loginP.add(userTF);
        loginP.add(passL);
        loginP.add(passTF);
        login.addActionListener(this);
        register.addActionListener(this);
        loginP.add(login);
        loginP.add(register);
        panel.add(loginP);
        add(panel, "login");
        cl = (CardLayout) getLayout();




    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args){
        JFrame frame = new JFrame("Text Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        Login login = new Login();
        frame.add(login);
        frame.setVisible(true);

    }
}
