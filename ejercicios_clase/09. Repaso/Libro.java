public class Libro extends Publicacion{
    String isbn;
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    Libro(int anio_publicacion,String titulo, int ejemplares, double precio,String isbn)
    {
        super(anio_publicacion, titulo, ejemplares, precio);
        this.isbn = isbn;
    }

    @Override 
    public void obtenerClaves()
    {
        System.out.println("Se trata de un libro");
    }

    @Override 
    public boolean equals(Object o)
    {
        if (o instanceof Libro)
        {
            Libro l = (Libro)o;
            if (super.equals(l) && this.getIsbn().equals(l.getIsbn()))
            {
            return true;
            }
            else{
                return false;
            }
        }else{
            return false;
        }
    }



}