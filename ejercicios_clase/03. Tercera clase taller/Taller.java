public class Taller{
    String nombre;
    Persona p;
    int capacidad;
    Coche[] coches;     
    Taller(String nombre, Persona p, int capacidad)
    {
        this.nombre = nombre;
        this.p = p;
        this.capacidad = capacidad; 
        this.coches = new Coche[capacidad];
    }
    

    void add_coche(Coche nuevo_coche)
    {
        int espacio = this.getEspacio();
        if (espacio > 0)
        {
        for (int i = 0; i < this.coches.length; i++)
        {
            if(this.coches[i] == null)
            {
                this.coches[i] = nuevo_coche;
                i = this.coches.length;

            }
        }
        }else{
            System.out.println("No hay espacio...");
        }

    }


    int getEspacio()
    {
        int espacio_disponible = 0;
        for (int i = 0; i < this.coches.length; i++)
        {
            if (this.coches[i] == null)
            {
                espacio_disponible = espacio_disponible + 1;
            }
        }
        return espacio_disponible;

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