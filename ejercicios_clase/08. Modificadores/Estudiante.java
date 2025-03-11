public class Estudiante extends Persona
{
    String clave;
    Estudiante(String nombre, int edad, String clave)
    {
        super(nombre, edad);
        this.clave = clave;
    }

 
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    
}