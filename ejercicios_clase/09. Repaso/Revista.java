public class Revista extends Publicacion{
    String tematica;

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    Revista(String titulo)
    {
        super(titulo);
    }

    Revista(int anio_publicacion, String titulo, String tematica, int ejemplares, double precio)
    {
        super(anio_publicacion, titulo,ejemplares, precio);
        this.tematica = tematica;
    }
    
  
    @Override
    public void obtenerClaves()
    {
        System.out.println("Se trata de una revista");
    }
}