import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

public class JCalculadora extends JFrame{
    public static void main(String[] args) {
        JCalculadora jc = new JCalculadora();
    }


    public JCalculadora(){
        super("Mi primera ventana");
        initComponents();
        this.setSize(800,800);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void initComponents(){
       JPanel panelnorte = new JPanel();
       panelnorte.setBackground(Color.RED);
       JPanel panelsur = new JPanel();
       panelsur.setBackground(Color.BLUE);
       JPanel paneleste = new JPanel();
       paneleste.setBackground(Color.GRAY);
       JPanel paneloeste = new JPanel();
       paneloeste.setBackground(Color.GREEN);

       JPanel panelcentro = new JPanel();
        panelcentro.setBackground(Color.MAGENTA);
        panelcentro.setLayout(new GridBagLayout());


       JButton boton = new JButton("Esto es un boton");

       
       

        this.add(panelcentro, BorderLayout.CENTER);
       this.add(panelnorte, BorderLayout.NORTH);
       this.add(panelsur, BorderLayout.SOUTH);
       this.add(paneleste, BorderLayout.EAST);
       this.add(paneloeste, BorderLayout.WEST);









       
        
    }


}