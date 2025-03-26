import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class JVentana extends JFrame{
    public static void main(String[] args) {
        JVentana jc = new JVentana();
    }
    

    PanelJuego paneljuego;

    public JVentana(){
        super("Mi primera ventana");
        initComponents();
        this.setSize(800,800);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void initComponents(){
        
        paneljuego = new PanelJuego();





        this.add(paneljuego, BorderLayout.CENTER);
        
         
    }


    
   




        

        


    


}