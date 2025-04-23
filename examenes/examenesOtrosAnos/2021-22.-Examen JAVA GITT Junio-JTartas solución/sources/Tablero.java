import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;

public class Tablero extends JPanel
{
    private int fps = 60; //Valor por defecto. El de cada ejecución, lo tomará del fichero.

    public Tablero()
    {
        this.setBackground(Color.BLACK);
        //this.setFocusable(true); //Descomentar, si el control de los eventos de teclado lo queremos hacer aquí
    }

    /** En milisegundos */
    private int calcularDelay()
    {
        return (int) (1/(fps*1.)*1000);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.PLAIN, 15));
        g.drawString("Vida: 1000", 50, 50);
    }
}
