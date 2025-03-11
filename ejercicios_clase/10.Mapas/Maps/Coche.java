/** @author David Contreras */

public class Coche 
{
	private String marca;
	private String modelo;
	
	public Coche(String marca, String modelo)
	{
		this.marca = marca;
		this.modelo  = modelo;
	}
	
	public String getMarca()
	{
		return marca;
	}

	public String toString()
	{
		return marca + " (" + modelo + ")";
	}
	
}

