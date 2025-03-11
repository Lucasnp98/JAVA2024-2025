public class Persona
{
    private int dni;
    private int edad; 

    public Persona(int dni, int edad)
    {
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(int dni)
    {
        this.dni = dni;
    }

    public int getEdad()
    {
        return edad;
    }

    public int getDni()
    {
        return dni;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o instanceof Persona p)
            return dni == p.getDni();
        else
            return false;
    }

    @Override
    public int hashCode()
    {
        return dni % 10;
    }

    @Override
    public String toString()
    {
        return String.valueOf(dni) + "(" + edad + ")";
    }
}
