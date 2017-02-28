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
    JLabel PassL = new JLabel("Password: ");
    JPasswordField passTF = new JPasswordField();
    JPanel loginP = new JPanel(new GridLayout(3,2));
    JPanel panel = new JPanel();


    Login(){
        setLayout(new CardLayout());
        loginP.add(userL);
        loginP.add(userTF);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
