import java.awt.Color;
import java.awt.Graphics;

public class Pelota
{
    int x;
    int y;
    int radio;
    int vx;
    int vy;

    
    public Pelota(int x, int y, int radio)
    {   
        this.x = x;
        this.y = y;
        this.radio = radio;
        this.vx = 10;
        this.vy = 10;


        
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    public int getVx() {
        return vx;
    }
    public void setVx(int vx) {
        this.vx = vx;
    }
    public int getVy() {
        return vy;
    }
    public void setVy(int vy) {
        this.vy = vy;
    }
    

    public void checkeaColisiones(int ancho, int largo, Raqueta raqueta)
    {
        if (this.x + radio > ancho || this.x  < 0)
        {
            this.vx = - vx;
        }
        if (this.y + radio > largo || this.y  < 0)
        {
            this.vy = -vy;
        }

        if (this.x + radio > raqueta.getX() && // borde derecho de la pelota está a la derecha del borde izquierdo de la raqueta
        this.x < raqueta.getX() + raqueta.getAncho() && // borde izquierdo de la pelota está a la izquierda del borde derecho de la raqueta
        this.y + radio > raqueta.getY() && // borde inferior de la pelota está por debajo del borde superior de la raqueta
        this.y < raqueta.getY() + raqueta.getLargo()) // borde superior de la pelota está por encima del borde inferior de la raqueta {

        this.vy = -vy;
        
    }
        


    


    public void mover()
    {
        this.x += vx;
        this.y += vy;
    }
    public void pintar(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillOval(this.getX(), this.getY(), this.getRadio(), this.getRadio());
    }
   
}