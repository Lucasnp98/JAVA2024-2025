public class Estudiante extends Persona
{
   
    String carrera;
    int creditos_aprobados;
    
    Estudiante(String nombre, String dni, String carrera, int creditos_aprobados)
    {
        super(nombre, dni);
        
        this.carrera = carrera;
        this.creditos_aprobados = creditos_aprobados;
    }
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCreditos_aprobados() {
        return creditos_aprobados;
    }

    public void setCreditos_aprobados(int creditos_aprobados) {
        this.creditos_aprobados = creditos_aprobados;
    }

    @Override
    String presentarse()
    {
        return super.presentarse()  + " Carrera: " + this.carrera;
    }
   
   
    
}