import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class App
{
    public static void main(String[] args)
    {

        //App.App1();

    App.app2();

    }

    public static void app2()
    {

        TreeSet<Persona> personas = new TreeSet<>();

        personas.add(new Persona("Lucas", "505X", 26));
        personas.add(new Persona("Dani", "505X", 30));
        personas.add(new Persona("Pepe", "505X", 28));
        for (Persona p:personas)
        {
            System.out.println(p.getNombre());
        }


    }

    public static void App1()
    {
        Persona p = new Persona("Lucas", "505j", 26);
        Persona p2 = new Persona("Manolo", "505j", 27);
        Persona p3 = new Persona("Pepe", "076J", 26);
    
        // System.out.println(p.hashCode());
        // System.out.println(p2.hashCode());
        // System.out.println(p.equals(p2));


        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(p);
        personas.add(p2);
        personas.add(p3);
        // for (Persona p_aux:personas)
        // {
        //     System.out.println(p_aux.getNombre());
        // }

        personas.remove(new Persona("Manolo", "505j", 26));

        for (Persona p_aux:personas)
        {
            System.out.println(p_aux.getNombre());
        }


        System.out.println("---------------");
        personas.remove(new Persona("Dani", "505j", 26));



        for (Persona p_aux:personas)
        {
            System.out.println(p_aux.getNombre());
        }

    }
}