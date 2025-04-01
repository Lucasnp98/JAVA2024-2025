import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ladrillo extends Elemento
{

static int VIDA_INICIAL = 1;

int vida; 
int ancho; 
int largo; 



Ladrillo(int x, int y, Color color, int ancho, int largo)
{
    super(x, y, color);
    this.vida = VIDA_INICIAL;
    this.ancho = ancho;
    this.largo = largo;
}


public boolean checkeaColision(Pelota pelota) {
    Rectangle rectPelota = pelota.getRect();
    Rectangle rectLadrillo = this.getRect();

    return rectPelota.intersects(rectLadrillo);
}






@Override 
public void pintar(Graphics g)
{
    super.pintar(g);
    g.fillRect(this.x, this.y, this.ancho,this.largo);

}

@Override
public Rectangle getRect() {
    return new Rectangle(this.x, this.y, this.ancho, this.largo);
}





    
}