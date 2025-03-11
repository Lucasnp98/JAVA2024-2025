public class Taller{
    String nombre;
    Persona p;
    static int CAPACIDAD = 10;
    Coche[] coches;    
    int pos_libre; 
    Taller(String nombre, Persona p)
    {
        this.nombre = nombre;
        this.p = p;
        
        this.coches = new Coche[CAPACIDAD];
        this.pos_libre = 0;

    }

    Taller(String nombre, Persona p, Coche[] coches)
    {
        this(nombre, p);
        this.add_coches(coches);
    }

    void add_coches(Coche[] coches)
    {
        for (int i = 0; i < coches.length; i++)
        {
            add_coche(coches[i]);
        }
    }

    void add_coche(Coche nuevo_coche)
    {
        if (pos_libre < CAPACIDAD)
        {
            coches[pos_libre] = nuevo_coche;
            pos_libre += 1;

        }else{
            System.out.println("No hemos podido añadir el siguiente coche: " + nuevo_coche.mostrar_info());
            
        }
    
        
    }
           
    void mostrar_coches()
    {
        System.out.println("-------------------------------");
        System.out.println("Mostrando coches del taller...");
        System.out.println("-------------------------------");
        for (int i = 0; i < this.coches.length; i++)
        {
            if (this.coches[i] != null)
            {
            System.out.println(this.coches[i].mostrar_info());
            }
        }
    }
    
    Coche[] getCoches()
    {
        return this.coches;
    }





}