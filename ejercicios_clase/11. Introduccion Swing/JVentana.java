import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class JVentana extends JFrame{
    public static void main(String[] args) {
        JVentana jv = new JVentana();
    }


    public JVentana(){
        super("Mi primera ventana");
        initComponents();
        this.setSize(800,800);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void initComponents(){
        // Aquí se inicializan los componentes de la ventana
        //JButton btnCentro = new JButton("CENTRO");

        JPanel panel = new JPanel();
        JLabel etiqueta = new JLabel("Hola esto es una etiqueta");
        panel.add(etiqueta);
        Font fuente = new Font("Comic Sans MS", Font.BOLD, 23);
        etiqueta.setFont(fuente);
        panel.setBackground(Color.WHITE);

        JTextArea area = new JTextArea("Escribe algo");
        String [] palabras = {"Hola", "Hola", "Lucas", "Dani"};
        JComboBox combobox = new JComboBox<>(palabras);
        panel.add(combobox);



        JRadioButton radioboton = new JRadioButton("Esto es un radioboton");
        panel.add(radioboton);
        JButton boton = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        boton.setFont(fuente);
        boton2.setFont(fuente);
        panel.add(boton);
        panel.add(boton2);
        panel.add(area);





        this.add(panel);
        
    }


}