import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class AppNew
{
    public static void main(String[] args)
    {
        Map<Persona, Coche> personas = new HashMap<Persona, Coche>();
        //También se puede resumir en esta expresión:
        //Map<Persona, Coche> personas = new HashMap<>();

        personas.put(new Persona("11111A", "Ana", 22), new Coche("VW", "Golf"));
        personas.put(new Persona("22222A", "Cristina", 33), new Coche("Audi", "A3"));
        personas.put(new Persona("33333A", "Jaime", 28), new Coche("VW", "Golf"));

        //Ana cambia de coche
        personas.put(new Persona("11111A", "Ana", 22), new Coche("Mercedes", "C"));

        System.out.println(personas);
        System.out.println("========");
        System.out.println("Coche en MAP: " + personas.get(new Persona("99999X")));

        //Nuevo métodos: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html
        //Si no existe devuelve un valor por defecto
        System.out.println("Coche en MAP: " + personas.getOrDefault(new Persona("99999X"), new Coche("--", "--")));

        //No se agrega al mapa el nuevo valor ya que existe la clave en el Mapa
        personas.putIfAbsent(new Persona("11111A", "Ana", 22), new Coche("BMW", "430i"));
        System.out.println(personas);



    }    
}
