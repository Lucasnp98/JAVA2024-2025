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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class JVentana extends JFrame{
    public static void main(String[] args) {
        JVentana jc = new JVentana();
    }
    JTextField texto;
    

    public JVentana(){
        super("Mi primera ventana");
        initComponents();
        this.setSize(800,800);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void initComponents(){
        
        JPanel panelnorte = new JPanel();

        panelnorte.setBackground(Color.PINK);
        JPanel panelcentro = new JPanel();

         texto = new JTextField(10);
        





        JButton boton1 = new JButton("Boton 1");
        


        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Boton 1 pulsado");
            }
            
        });
        JButton boton2 = new JButton("Boton 2");
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Boton 2 pulsado");
            }

            
            
        });
    
        JLabel etiqueta = new JLabel("Mi primera clase de eventos");

        panelnorte.add(etiqueta);
        panelcentro.add(boton1);
        panelcentro.add(boton2);
        panelcentro.add(texto);

        this.add(panelnorte, BorderLayout.NORTH);
        this.add(panelcentro, BorderLayout.CENTER);




    }



    
    }


