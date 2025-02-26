import java.util.ArrayList;

public class Biblioteca
{
    public ArrayList<Publicacion> publicaciones;

    Biblioteca()
    {
        this(new ArrayList<Publicacion>());
    }
    Biblioteca(ArrayList<Publicacion> publicaciones)
    {
        this.publicaciones = publicaciones;
    }


    public void addPublicacion(Publicacion p)
    {

        publicaciones.add(p);
       
    }

    public double calculaValor()
    {
        double valor = 0;

        for (Publicacion p:publicaciones)
        {
            valor += p.getPrecioTotal();
        }
        return valor;

    }


    public ArrayList<Revista> obtenerTematicas(String tematica)
    {
        ArrayList<Revista> revistas_tematica = new ArrayList<Revista>();
        for (Publicacion p:publicaciones)
        {
            if (p instanceof Revista)
            {
                Revista r = (Revista)p;
                if (r.getTematica().equals(tematica)){
                    revistas_tematica.add(r);
                    
                }
            }
        }
        return revistas_tematica;
    }


    public void prestarPublicacion(Publicacion publicacion_prestar)
    {
        for (Publicacion p: publicaciones)
        {
            if (p.equals(publicacion_prestar) && p.getEjemplares() > 0)
            {
                p.restarEjemplar();
            }
        }
    }

 



    
    
    public void mostrarPublicaciones()
    {
        for (Publicacion p:publicaciones)
        {
            System.out.println(p.toString());
        }
    }




}