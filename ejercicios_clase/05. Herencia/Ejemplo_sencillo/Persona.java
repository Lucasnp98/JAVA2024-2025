public class Persona
{
    String nombre;
    String dni; 


    Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
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
  

    String presentarse()
    {
        return "Nombre: "+ this.nombre + " Dni: " + this.dni;
    }

    



    
}