


public class Taller {
    String nombre;
    Coche[] coches; 
    int capacidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    Taller(String nombre, int capacidad)
    {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.coches = new Coche[capacidad];
    }

    Coche[] getCoches(){
        return this.coches;
    }





    int contar_coches()
    {
        int contador = 0;
        Coche[] coches_actuales = this.getCoches();
        for(int i = 0; i < coches_actuales.length; i++)
        {
            if (this.coches[i] != null)
            {
                contador = contador + 1;

            }
        }
        return contador; 
    }

    void aniadir_coche(Coche coche)
    {
        int numero_coches = this.contar_coches();
        if (numero_coches == this.getCapacidad())
        {

            System.out.println("Taller lleno!!!");
        }else{
        for (int i = 0; i < this.coches.length; i++)
        {
            if (coches[i] == null)
            {
                coches[i] = coche;
                return;
            }

        }
    }
    }   
    
    void listar_coches()
    {

        System.out.println("Cargando info de los coches...");
        Coche[] coches_actuales = this.getCoches();
        for (int i = 0; i < this.coches.length; i++)
        {
            if (coches_actuales[i] != null)

            {
                System.out.println(coches_actuales[i].mostrar_info());
            }
        }
    }


    Coche calcular_max_km()
    {
        Coche[] coches_actuales = this.getCoches();
        Coche coche_maximo = null;
        int maximo = 0;
        for (Coche c:coches_actuales)
        {
            if (c != null)
            {
            if (c.getKm() > maximo)
            {
                maximo = c.getKm();
                coche_maximo = c;
            }
        }
        }
        return coche_maximo;
    }
}

