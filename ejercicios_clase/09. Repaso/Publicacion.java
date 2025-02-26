public abstract class Publicacion
{
    public int anio_publicacion;
    public String titulo;
    int ejemplares;
    double precio;

    public int getEjemplares() {
        return ejemplares;
    }
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    Publicacion (String titulo)
    {
        this.titulo = titulo;
    }
    
    Publicacion (int anio_publicacion, String titulo, int ejemplares, double precio)
    {
        this(titulo);
        this.anio_publicacion = anio_publicacion;
        
        this.ejemplares = ejemplares;
        this.precio = precio;
    }

    public void restarEjemplar()
    {
        this.ejemplares -= 1;
    }
    public int getAnio_publicacion() {
        return anio_publicacion;
    }
    public void setAnio_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public double getPrecioTotal()
    {
        return this.getPrecio() * this.getEjemplares();
    }

    @Override 
    public boolean equals(Object o)
    {
        boolean igual = false;
        if (o instanceof Publicacion)
        {
            Publicacion p = (Publicacion)o;
            if (this.getTitulo().equals(p.getTitulo()))
            {
                igual = true;
            }else{
                igual = false;
            }
            
        }else{
            igual = false;
        }
    return igual;
    }

    @Override
    public String toString()
    {
        return this.getTitulo() + " Ejemplares: "  + this.getEjemplares() ;
    }


    public abstract void obtenerClaves();
  
    
}