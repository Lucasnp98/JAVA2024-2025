import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class AppEscribir
{
    public static void main(String args[]) 
    {
        Persona p1 = new Persona("Luis", "11111A", 22);
        Persona p2 = new Persona("Ana", "222222A", 19);
        Persona p3 = new Persona("Jaime", "33333A", 21);

        try
        {
            FileOutputStream fos = new FileOutputStream("personas.obj"); //.ser
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.writeObject(p3);
            oos.close();
            fos.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }	
    }
}