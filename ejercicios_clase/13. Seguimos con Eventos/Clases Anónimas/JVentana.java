
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
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

	public JVentana()
	{
        super("Personas");

        JPanel panelnorte = new JPanel();
        JPanel panelcentro = new JPanel();
        JPanel panelsur = new JPanel();

        JLabel etiqueta = new JLabel("Eventos con clases anónimas");
        JButton boton1 = new JButton("Boton1");


        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("El boton1 ha sido pulsado");
            }
        });
        JButton boton2 = new JButton("Boton2");
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("El boton2 ha sido pulsado");
            }
        });



        this.addWindowListener(new WindowAdapter() {
            @Override 
            public void windowOpened(WindowEvent e){
                System.out.println("Ventana abriendose!!!!");
            }

            @Override
            public void windowClosing(WindowEvent e)
            {
                System.out.println("Ventana cerrándose!!! ");
            }
        });


        panelnorte.add(etiqueta);


        panelcentro.add(boton1);
        panelcentro.add(boton2);



        JLabel etiqueta_eventos = new JLabel("Etiqueta para eventos de raton");
        etiqueta_eventos.addMouseListener(new MouseAdapter()
        {

            @Override
            public void mouseClicked(MouseEvent e)
            {
                String ubicacion = "X: " + e.getX() + " Y: "+  e.getY();
                System.out.println("Etiqueta clickada!!" + ubicacion);
            }
            @Override
            public void mouseEntered(MouseEvent e)
            {
                System.out.println("Ratón entrando...");

            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                System.out.println("Raton saliendo...");
            }


        });


        panelcentro.add(etiqueta_eventos);
        

        




        
        this.add(panelnorte, BorderLayout.NORTH);
        this.add(panelcentro, BorderLayout.CENTER);
        this.add(panelsur, BorderLayout.SOUTH);
        
        this.setSize(400,400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para que al pulsar en la X finalice la aplicación
        //Este mótodo siempre debe ser el óltimo mensaje
        this.setVisible(true);
	}

}