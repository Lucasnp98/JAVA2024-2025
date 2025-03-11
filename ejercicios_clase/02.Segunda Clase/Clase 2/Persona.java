public class Persona
{
    String nombre;
    String dni;
    Coche c;

    Persona(String nombre, String dni, Coche c)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.c = c;
    }

    String getNombre()
    {
        return this.nombre;
    }
    String getDni()
    {
        return this.dni;
    }
    Coche getCoche()
    {
        return this.c;
    }

    void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    void setDni(String dni)
    {
        this.dni = dni;
    }
    
    void setCoche(Coche c)
    {
        this.c = c;
    }

    String mostrar_info()
    {
        return "Nombre: " + this.getNombre() + " Coche -> " +this.getCoche().mostrar_info();
    }








}