public class Persona implements Comparable
{

    String dni;
    String nombre;
    int edad;
   

    Persona(String nombre, String dni, int edad)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    @Override
    public int compareTo(Object o)
    {

        

    }

 

   

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString()
    {
        return this.getNombre() +" " +  this.getDni();
    }


    @Override
    public int hashCode()
    {
        return this.getDni().hashCode()  + this.getNombre().hashCode();
    }

    @Override
    public boolean equals(Object o)
    {
        if (o instanceof Persona)
        {
            Persona p = (Persona)o;
            if (this.getDni().equals(p.getDni()) && this.getNombre().equals(p.getNombre()))
            {
                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }




    }

   
    
   

   

}