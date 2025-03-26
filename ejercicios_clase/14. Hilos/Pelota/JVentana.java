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
    HashMap<String, JTextField> control_etiquetas = new HashMap<String, JTextField>();

    PanelJuego paneljuego;

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
        JButton boton1 = new JButton("Lanzar hilo");

        

        String datos[] = {"X", "Y", "Diametro"};


        for (String dato:datos)
        {
            panelnorte.add(new JLabel(dato));
            JTextField cajatexto = new JTextField();
            cajatexto.setColumns(5);
            panelnorte.add(cajatexto);
            control_etiquetas.put(dato, cajatexto);
        }




        boton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e)
            {

            Thread t =  new Thread(paneljuego);
            t.start();

            }
            
        });

        JButton boton2 = new JButton("Añade pelota");

        boton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){

                int  x = Integer.parseInt(control_etiquetas.get("X").getText());
                int y = Integer.parseInt(control_etiquetas.get("Y").getText());
                int diametro = Integer.parseInt(control_etiquetas.get("Diametro").getText());



                Pelota p = new Pelota(x,y,diametro,10,10);






                paneljuego.getPelotas().add(p);






            }
        });


        panelnorte.add(boton1);
        panelnorte.add(boton2);
        paneljuego = new PanelJuego();





        this.add(paneljuego, BorderLayout.CENTER);
        this.add(panelnorte, BorderLayout.NORTH);
         
    }


    
   




        

        


    


}