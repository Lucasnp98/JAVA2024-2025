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
    Font fuente;
    JTextField caja_texto;
    

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
        panelcentro.setLayout(new GridLayout(4,4, 10, 10));
        fuente = new Font("Comic Sans MS", Font.BOLD, 40);
        caja_texto = new JTextField(10);
        

        JLabel etiqueta = new JLabel("Mi primera Calculadora");
        etiqueta.setFont(fuente);

        String [] texto_botones = {"1","2", "3", "+",
                                    "4", "5","6", "-"
                                    ,"7","8", "9", "*",
                                    "=", "0", "C", "/"};

        for (String texto: texto_botones)
        {
            JButton boton = new JButton(texto);
            boton.setFont(fuente);
            panelcentro.add(boton);
        }

    
        panelnorte.add(etiqueta);
        panelnorte.add(caja_texto);
        this.add(panelnorte, BorderLayout.NORTH);
        this.add(panelcentro, BorderLayout.CENTER);


    }



    
    }


