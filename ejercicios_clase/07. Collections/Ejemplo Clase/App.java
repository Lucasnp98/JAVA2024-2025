import java.util.ArrayList;
import java.util.TreeSet;

public class App
{
    public static void main(String[] args)
    {
        
        Persona p1 = new Persona("Lucas", "453J", 26);
        Persona p2 = new Persona("Ana", "453H", 26);
        TreeSet<Persona> personas = new TreeSet<>();
        personas.add(p1);
        personas.add(p2);


        



        




    }



    public static void AppArraylist()
    {
        Persona p1 = new Persona("Lucas", "405", 24);
        Persona p2 = new Persona("Pepe", "405", 24);
        Persona p3 = new Persona("Ana", "6786", 24);
        
        

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

       

        personas.remove(new Persona("Pepe", "405", 24)) ;
        System.out.println("MOSTRANDO EL CONTENIDO DEL ARRAYLISTR!!!!");
        for (Persona p:personas)
        {
            System.out.println(p.toString());
        }
    }
}