
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

	public JVentana()
	{
        super("Intro Juego");
        panel = new PanelJuego();
        panel.setBackground(Color.BLACK);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                System.out.println(e.getKeyCode());
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    panel.setIzquierdaPresionada(true);
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    panel.setDerechaPresionada(true);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    panel.setIzquierdaPresionada(false);
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    panel.setDerechaPresionada(false);
                }
    }
        });














        Thread hilo = new Thread(panel);
        hilo.start();
        this.add(panel, BorderLayout.CENTER);
        
        this.setSize(400,400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para que al pulsar en la X finalice la aplicación
        this.setVisible(true);

        this.requestFocus();


       

        
	}
}



   
