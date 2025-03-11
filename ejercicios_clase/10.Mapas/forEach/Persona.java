public class Persona
{ 
    private String nif;
    private String nombre;
    private int edad;
    
    public Persona(String nif, String nombre, int edad) 
    {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(String nif) 
    {
        this.nif = nif;
    }

    public String getNif()
    {
        return nif;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("NIF: ")
          .append(nif)
          .append(" Nombre: ")
          .append(nombre)
          .append(" Edad: ")
          .append(edad);
        return sb.toString();
    }
    
    @Override
    public int hashCode()
    {
        return (int) (nif.toUpperCase().charAt(0));
    }

    @Override
    public boolean equals(Object obj) //Upcasting, el objeto que recibe lo vemos como un Objeto
    {
        if(obj instanceof Persona p) //Si la instancia del objeto es una Persona...
            return nif.equals(p.getNif());
        else
            return false;
    }
}