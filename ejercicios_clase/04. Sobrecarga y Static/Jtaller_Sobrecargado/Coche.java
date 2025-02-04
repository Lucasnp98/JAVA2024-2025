public class Coche
{
    String matricula;
    String marca; 
    int numero_ruedas;

    Coche(String matricula, String marca, int numero_ruedas)
    {
        this.matricula = matricula;
        this.marca = marca;
        this.numero_ruedas = numero_ruedas;

    }

    String getMatricula()
    {
        return this.matricula;
    }
    String getMarca()
    {
        return this.marca;
    }

    int getRuedas()
    {
        return this.numero_ruedas;
    }

    void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }
    void setMarca(String marca)
    {
        this.marca = marca;
    }
     
    void setRuedas(int numero_ruedas)
    {
        this.numero_ruedas = numero_ruedas;
    }


    String mostrar_info()
    {
        return String.format("Matricula: %s Marca: %s ", this.getMatricula(), this.getMarca());
    }







}