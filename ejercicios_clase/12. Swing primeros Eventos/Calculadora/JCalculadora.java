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
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class JCalculadora extends JFrame implements ActionListener{
    public static void main(String[] args) {
        JCalculadora jc = new JCalculadora();
    }


     HashMap<JButton, String> mapa_botones = new HashMap<JButton, String>();
     JTextArea area_texto;
     
     

    public JCalculadora(){
        super("Mi primera ventana");
        initComponents();
        this.setSize(800,800);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void initComponents(){


        Font fuente_calculadora = new Font("Comic Sans MS", Font.BOLD, 25);
        JPanel panelnorte = new JPanel();
        panelnorte.setLayout(new BorderLayout());
        panelnorte.setBackground(Color.GRAY);
        
        area_texto = new JTextArea();
        area_texto.setPreferredSize(new Dimension(600, 100)); 
        area_texto.setFont(fuente_calculadora);
        panelnorte.add(area_texto);

    
        
        JPanel panelcentro = new JPanel();

        

        int filas = 5;
        int columnas = 4;

        String[] botones = {"1", "2", "3", "+", 
                        "4", "5", "6", "-",
                         "7", "8","9","X",
                         "C","0",",","/",
                         "DEL","(", ")", "="};

        panelcentro.setBackground(Color.WHITE);
        panelcentro.setLayout(new GridLayout(filas,columnas, 30, 30));

        for (int i = 0; i < filas * columnas; i ++)
        {
            JButton boton = new JButton(botones[i]);
            boton.setFont(fuente_calculadora);

            boton.addActionListener(this);

            panelcentro.add(boton);
        

            mapa_botones.put(boton, botones[i]);


            
        }

        


    this.add(panelcentro, BorderLayout.CENTER);
       this.add(panelnorte, BorderLayout.NORTH);
         
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton boton_pulsado = (JButton)e.getSource();

        String texto = mapa_botones.get(boton_pulsado);
        if (texto.equals("C"))
        {
            area_texto.setText("");
        }
        else if (texto.equals("=")) {
            
            String texto_area = area_texto.getText();
            String resultado = evaluar_expresion(texto_area);
            area_texto.setText(resultado);
        }else{
            String texto_area = area_texto.getText();
            area_texto.setText(texto_area+" " +  texto);
        }
        
        

    }


    String evaluar_expresion(String texto_area)
    {   
       
        String operacion[] = texto_area.trim().split(" ");

        for (String c:operacion)
        {
            System.out.println(c);
        }
        int numero1 = Integer.parseInt(operacion[0].trim());
        int numero2 = Integer.parseInt(operacion[2].trim());
        String operador = operacion[1];
        String resultado;
        double res;
        if (operador.equals("+"))
        {
            res = numero1 + numero2;
            

        }else if (operador.equals("-")){
            res = numero1 - numero2;

        }else if(operador.equals("X")){
            res = numero1 * numero2;

        }else{
            res = numero1 / numero2;

        }

        resultado = String.valueOf(res);
        return resultado;
    }



    


}