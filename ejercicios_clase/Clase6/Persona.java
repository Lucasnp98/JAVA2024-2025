public class Persona {
    String nombre;
    String dni;

    Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    String getInfo()
    {
        return "nombre: " + this.nombre; 

    }
    

    
}