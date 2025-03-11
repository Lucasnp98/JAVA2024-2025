import java.util.HashMap;

public class App
{
    public static void main(String[] args) 
    {
        HashMap<Persona, Coche> mapa = new HashMap<Persona, Coche>();  

        mapa.put(new Persona(1, 20), new Coche("Polo", 90));
        mapa.put(new Persona(2, 20), new Coche("Ibiza", 90));
        mapa.put(new Persona(3, 20), new Coche("BMW s1", 90));
        mapa.put(new Persona(4, 22), new Coche("Tesla", 1111));

        Coche c = mapa.get(new Persona(5, 20));
        System.out.println(">>>>>" + c);

        // System.out.println(mapa.keySet());
        // System.out.println(mapa.values());

        // System.out.println("Listado de claves: ");
        // for (Persona p:mapa.keySet())
        // {
        //     System.out.println(p.toString());
        //     System.out.println(mapa.get(p));
        // }

        // System.out.println("Recorrer valores");

        // for (Coche coche_aux: mapa.values())
        // {
        //     System.out.println(coche_aux.toString());
        // }








    }
}