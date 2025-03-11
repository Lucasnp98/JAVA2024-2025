import java.util.ArrayList;
import java.util.Collection;

public class App
{
    public static void main(String[] args)
    {
        Collection<Persona> personasOnly = new ArrayList<Persona>(); 

        personasOnly.add(new Persona("11111A", "Luis", 22));
        personasOnly.add(new Persona("22222A", "Miguel", 33));
        personasOnly.add(new Persona("33333A", "Jaime", 28));

        for(Persona p:personasOnly)
            System.out.println(p.getNif());

    }    
}
