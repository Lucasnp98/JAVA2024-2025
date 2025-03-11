


public class Coche {
    String modelo;
    String color;
    String matricula;

    Coche(String modelo, String color, String matricula, int km)
    {
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.km = km;
    }

    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    int km; 
    
   
    String mostrar_info()
    {
        String mensaje = String.format("Modelo: %s, color: %s y matricula %s", this.modelo, this.color, this.matricula);
        return mensaje;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }



}
