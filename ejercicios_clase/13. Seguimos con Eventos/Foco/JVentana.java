
import javax.swing.JFrame;
import javax.net.ssl.KeyStoreBuilderParameters;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;




public class JVentana extends JFrame
{
   

    public static void main(String[] args)
    {
        new JVentana();
    }

    JPanel panel_foco;

	public JVentana()
	{
        super("EVents Key");
        JPanel panel_centro = new JPanel();
        JPanel panel_norte = new JPanel();
        panel_norte.setBackground(Color.BLACK);

        panel_centro.setBackground(Color.RED);


        JButton boton1 = new JButton("Boton que devuelve el foco");

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                recuperarFoco();
            }
        });

        JButton boton2 = new JButton("Boton que roba el foco");
        panel_centro.add(boton2);


        panel_centro.add(boton1);



        panel_centro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                System.out.println("Mouse entrando");

            }
            @Override
            public void mouseClicked(MouseEvent e) {


                System.out.println(e.getX() + " " + e.getY());
            }     
            @Override
            public void mouseExited(MouseEvent e)
            {
                System.out.println("Mouse saliendo");
            }
        });
        


        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e)
            {
                System.out.println(e.getKeyChar());
                
            }
        });
        
    
      
        this.add(panel_centro, BorderLayout.CENTER);
        this.add(panel_norte, BorderLayout.NORTH);
       
        this.setSize(400,400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para que al pulsar en la X finalice la aplicación
        this.setVisible(true);

        this.requestFocus();
        
	}



    private void recuperarFoco() {
        
        this.requestFocus();
    }
    

}