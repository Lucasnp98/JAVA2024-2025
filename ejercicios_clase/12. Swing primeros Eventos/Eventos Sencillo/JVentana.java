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

public class JVentana extends JFrame implements ActionListener{
    public static void main(String[] args) {
        JVentana jc = new JVentana();
    }
    HashMap<JButton, String> control_botones = new HashMap<JButton, String>();

     JTextArea cajatexto;
     

    public JVentana(){
        super("Mi primera ventana");
        initComponents();
        this.setSize(800,800);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void initComponents(){
        JPanel panelcentro = new JPanel();
        JPanel panelnorte = new JPanel();
        JLabel etiqueta = new JLabel("Primeros eventos");
        
    

        cajatexto = new JTextArea("Operacion: ");
        
        panelnorte.add(etiqueta);
        panelnorte.add(cajatexto);


        String[] botones = {"Boton1", "Boton2", "Mostrar"};


        for (String texto:botones)
            {
                JButton boton = new JButton(texto);
                boton.addActionListener(this);
                control_botones.put(boton, texto);
                panelcentro.add(boton);

            }
     

        
        


    this.add(panelcentro, BorderLayout.CENTER);
       this.add(panelnorte, BorderLayout.NORTH);
         
    }

    @Override 
    public void actionPerformed(ActionEvent e)
    {
        JButton boton_pulsado =(JButton) e.getSource();
        // System.out.println("He pulsado el boton: " + boton_pulsado.getText());

        String valor = control_botones.get(boton_pulsado);
        String texto_caja = cajatexto.getText();
        if (valor.equals("Mostrar"))
        {
            System.out.println(texto_caja);
        }else{

        cajatexto.setText(texto_caja + valor);
        }




        

        


    }


}