import java.awt.Color;
import java.awt.Graphics;

public class Raqueta
{
    int x; 
    int y;
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
    int ancho;
    int largo;
    int vx;
    
    public Raqueta(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.ancho = 50;
        this.largo = 10;
        this.vx = 10;
    }
public int getAncho() {
        return ancho;
    }


    public void setAncho(int ancho) {
        this.ancho = ancho;
    }


    public int getLargo() {
        return largo;
    }


    public void setLargo(int largo) {
        this.largo = largo;
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


    

    public void pintar(Graphics g)
    {

        g.setColor(Color.WHITE);
        g.fillRect(this.x, this.y, this.ancho, this.largo);
        
    }

    public void mover()
    {

    }

    public void moverDerecha()
    {
        this.x += vx;

    }
    public void moverIzquierda()
    {
        this.x -= vx;
    }

}