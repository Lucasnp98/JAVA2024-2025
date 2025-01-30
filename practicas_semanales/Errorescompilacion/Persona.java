//Definición de la clase que construirán futuros objetos del tipo Persona
public class Persona
{
    CIUDAD; //Todas las personas viven en la misma ciudad
    String nombre;
    int edad;

    public Persona(string a,int b, String c, int d, boolean e, string f)
    {
        this(a);
        CIUDAD = c;
    }

    public Persona(String a, int b)
    {
        nombre = a;
        edad = b;
    }    

    //Métodos
    public int getNombre()
    {
        return nombre;
    }

    public String setNombre(String s)
    {
        this.nombre = s
    }

    public int getEdad()
    {
        return edad
    }

    public void setEdad(String edad)
    {
        if(edad>0 && edad<120)
            this.edad = edad
    }

    String estadistica()
    {
        return "La mitad de la edad en " + CIUDAD + " es: " + edad/2
    }

    String getInfo()
    {
        StrinBuilder sb = new StrinBuilder();
        sb.append("nombre")
        sb.appen(nombre);
    

    	return "Nombre: + nombre + "\n Edad: "  + edad + "CIUDAD: " + CIUDAD
    }

}
