
import javax.swing.JFrame;
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
        super("Personas");

        JPanel panelnorte = new JPanel();
        panel_foco = new JPanel();

        panel_foco.setFocusable(true);
        panel_foco.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e)
            {
                System.out.println(e.getKeyCode());
            }
            
        })     ;  
        

       

        JButton boton1 = new JButton("Boton1");
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("El boton1 ha sido pulsado");
                recuperarFoco();
               

                
            }
        });
        JButton boton2 = new JButton("Boton2");
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("El boton2 ha sido pulsado");
                recuperarFoco();
                
                
            }
        });
        panelnorte.add(boton1);
        // panelnorte.add(boton2);
        this.add(panelnorte, BorderLayout.NORTH);
        this.add(panel_foco, BorderLayout.CENTER);
        this.setSize(400,400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para que al pulsar en la X finalice la aplicación
        this.setVisible(true);
        panel_foco.requestFocusInWindow();
	}



    private void recuperarFoco() {
        
        panel_foco.requestFocusInWindow();
    }
    

}