import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/*
Q1: ¿Qué pasa cuándo tenemos dos claves iguales?
Q2: ¿Tendría sentido tener una clave igual a null?
Q3: ¿Y un un valor igual a null?
Q4: Reto:
    ¿Cómo calcularías el número de personas que tienen un coche en concreto? 
        Golf: 2
        A3: 1
        Mini: 1
        Ibiza: 1
*/    

public class App
{
    public static void main(String[] args)
    {
        Map<Persona, Coche> personas;

        if(false)
            personas = new HashMap<>();
        else
            personas = new TreeMap<>();

        personas.put(new Persona("11111A", "Ana", 22), new Coche("VW", "Golf"));
        personas.put(new Persona("22222A", "Cristina", 33), new Coche("Audi", "A3"));
        personas.put(new Persona("33333A", "Jaime", 28), new Coche("VW", "Golf"));

		personas.put(new Persona("11112B", "Lara", 28), new Coche("Seat", "Ibiza"));
		personas.put(new Persona("11113X", "Daniela", 28), new Coche("Mini", "Cooper"));

        // System.out.println(personas);

        Coche coche = (Coche) personas.get(new Persona("11111A", "Ana"));
        
        System.out.println("\nEl coche de 11111A es: " + coche);

        System.out.println("\nExiste 11112B: " + personas.containsKey(new Persona("11112B", "Lara")));        
        
        
        // System.out.println("\nListado de Personas");
        // System.out.println("===============");
        // Set<Persona> personasSet = personas.keySet();
        // Iterator<Persona> itPersonas = personasSet.iterator();
        // while(itPersonas.hasNext())
        // {
        //     Persona p = itPersonas.next();
        //     System.out.println(p.getNombre());
        // }

        //Trabajando con estructura for each
        for(Persona p : personas.keySet())
            System.out.println(p.getNombre());
            
        System.out.println("\nListado de coches");
        System.out.println("===============");
        // Collection<Coche> coches = personas.values();
        // Iterator<Coche> itCoches = coches.iterator();
        // while(itCoches.hasNext())
        // {
        //     Coche c = itCoches.next();
        //     System.out.println(c.getMarca());
        // }

        // //Trabajando con estructura for each
        // for(Coche c : personas.values())
        //     System.out.println(c.getMarca());


        // System.out.println("\nListado de los dos objetos (clave+valor) del Map");
        // System.out.println("===============");
        // for(Map.Entry<Persona, Coche> personasEntrySet : personas.entrySet())
        //    System.out.println("- La clave: " + personasEntrySet.getKey() + " - El valor: " + personasEntrySet.getValue());     
    }    
}
