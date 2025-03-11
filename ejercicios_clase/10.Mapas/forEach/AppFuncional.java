import java.util.ArrayList;
import java.util.Collection;

public class AppFuncional
{
    public static void main(String[] args)
    {
        Collection<Persona> personasOnly = new ArrayList<Persona>(); 

        personasOnly.add(new Persona("11111A", "Luis", 22));
        personasOnly.add(new Persona("22222A", "Miguel", 33));
        personasOnly.add(new Persona("33333A", "Jaime", 28));

        personasOnly.forEach(System.out::println);

        personasOnly.forEach(p -> System.out.println(p.getNif()));
    }    
}
