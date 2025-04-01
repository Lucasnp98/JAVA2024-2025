
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
import java.util.HashMap;
import java.awt.event.ActionEvent;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;




public class JVentana extends JFrame
{

    public static void main(String[] args)
    {
        new JVentana();
    }
    PanelJuego panel;
    final int ANCHO = 800;
    final int LARGO = 800;

	public int getANCHO() {
        return ANCHO;
    }

    public int getLargo() {
        return LARGO;
    }

    public JVentana()
	{
        super("Intro Juego");
        panel = new PanelJuego(this);
        panel.setBackground(Color.BLACK);
        panel.setFocusable(true);
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

               
                    panel.setTeclaPresionada(e.getKeyCode(), true);
              
            }

            @Override
            public void keyReleased(KeyEvent e) {
                    panel.setTeclaPresionada(e.getKeyCode(), false);
               
    }
        });
        this.add(panel, BorderLayout.CENTER);
        this.setSize(ANCHO,LARGO);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setVisible(true);
        panel.requestFocusInWindow();
        Thread hilo = new Thread(panel);
        hilo.start();

         
	}
}



   
