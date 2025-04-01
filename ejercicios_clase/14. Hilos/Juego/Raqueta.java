import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Raqueta extends Elemento
{
   
    
    int ancho;
    int largo;
    int vx;
    final int ANCHO_RAQUETA = 100;
    final int LARGO_RAQUETA = 20;
    final int VELOCIDAD_X = 10;
    
    public Raqueta(int x, int y, Color color)
{
    super(x, y, color);
    this.vx = VELOCIDAD_X;
    this.ancho = ANCHO_RAQUETA;
    this.largo = LARGO_RAQUETA;
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



    

    public void pintar(Graphics g)
{
    super.pintar(g);
    g.fillRect(this.x, this.y, this.ancho, this.largo);
}


  
    public void moverDerecha()
    {
        this.x += vx;

    }
    public void moverIzquierda()
    {
        this.x -= vx;
    }

    @Override
    public Rectangle getRect() {
        return new Rectangle(this.x, this.y, this.ancho, this.largo);
    }
    

}