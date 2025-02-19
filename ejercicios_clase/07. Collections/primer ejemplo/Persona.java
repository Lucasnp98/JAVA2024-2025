public class Persona implements Comparable {
    String nombre;
    String dni;
    int edad;

    Persona(String nombre, String dni, int edad)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public int hashCode()
    {
        return this.getDni().hashCode();
    }


    @Override
    public int compareTo(Object o)
    {

    //     if(o instanceof Persona)
    //     return this.getNombre().compareTo(((Persona)o).getNombre());
    //   else return -1;

    if(o instanceof Persona)
    {
        Persona p = (Persona)o;
        if (this.getEdad() > p.getEdad())
        {
            return -11;
        }else{
            if (this.getEdad() < p.getEdad())
            {
                return 1;
            }
            else{
                return 0;
            }
        }


    }else{
        return -1;
    }

    }

    @Override
    public boolean equals(Object o)
    {
        if (o instanceof Persona)
        {
            Persona p = (Persona)o;
            if (this.getDni().equals(p.getDni()) && this.getNombre().equals(p.getNombre())){
                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }
    }
   




    
    
}
