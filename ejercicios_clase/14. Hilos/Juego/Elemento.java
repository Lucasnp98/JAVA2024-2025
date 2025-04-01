import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
public abstract class Elemento 
{
    int x;
    int y;
    Color color;
    
    public Elemento(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
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

    public void pintar(Graphics g)
    {

        g.setColor(this.getColor());
       
        
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }


    public abstract Rectangle getRect();
    


    

}