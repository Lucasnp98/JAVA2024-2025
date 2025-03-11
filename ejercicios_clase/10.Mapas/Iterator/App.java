import java.util.TreeSet;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class App
{
    public static void main(String[] args)
    {
        ArrayList personas = new ArrayList<>();

        personas.add(new Persona("22222A", "Miguel", 33));
        personas.add(new Persona("11111A", "Luis", 22));
        personas.add(new Persona("33333A", "Jaime", 28));

        TreeSet personasTree = new TreeSet(personas);

        App.iterar(personasTree);
        App.iterar(personas);
        
        App.iterarForEach(personasTree);
        App.iterarForEach(personas);
    }    

    public static void iterar(Collection col)
    {
        Iterator it = col.iterator();
        while(it.hasNext())
        {
            Object o = it.next();
            Persona p = (Persona) o;
            System.out.println(p.getEdad());
        }
    }

    public static void iterarForEach(Collection col)
    {
        for(Object o:col)
        {
            Persona p = (Persona) o;
            System.out.println(p.getEdad());
        }
    }    
}
