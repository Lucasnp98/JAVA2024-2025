import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.EOFException;

public class AppLeer
{
    public static void main(String args[]) 
    {
        FileInputStream fis = null;
        ObjectInputStream ois  = null;
        try
        {
            fis = new FileInputStream("personas.obj"); //.ser
            ois = new ObjectInputStream(fis);
            while(true)
                System.out.println(ois.readObject());

        }
        catch(EOFException eofe)
        {
            try
            {
                ois.close();
                fis.close();   
            }
            catch(IOException ioe)
            {
                ioe.printStackTrace();            
            }          
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();            
        }	
        catch(ClassNotFoundException cnfe)
        {
            cnfe.printStackTrace(); 
        }
    }
}