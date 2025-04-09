import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.EOFException;

import java.io.FileWriter;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Collection;

public class AppExport
{
    public static void main(String args[]) 
    {
        Collection<Persona> personas = AppExport.leerPersonas();
        System.out.println(personas);
        AppExport.exportTexto(personas);
        System.out.println("Fichero exportado");
    }

    public static void exportTexto(Collection<Persona> personas) 
    {
        try
        {
            FileWriter fw = new FileWriter("datos/personas.csv");
            PrintWriter pw = new PrintWriter(fw);
            for(Persona p:personas)
                pw.println(p.toCSV());
            pw.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }


    public static Collection<Persona> leerPersonas() 
    {
        Collection<Persona> personas = new ArrayList<Persona>();
        FileInputStream fis = null;
        ObjectInputStream ois  = null;
        try
        {
            fis = new FileInputStream("datos/personas.obj"); 
            ois = new ObjectInputStream(fis);
            while(true)
                personas.add((Persona)ois.readObject());

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

        return personas;
    }
}