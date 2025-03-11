public class Persona
{
    String nombre;
    String dni;
   

    Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    String getNombre()
    {
        return this.nombre;
    }
    String getDni()
    {
        return this.dni;
    }
  
    void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    void setDni(String dni)
    {
        this.dni = dni;
    }
    
   
    String mostrar_info()
    {
        return "Nombre: " + this.getNombre();
    }








}