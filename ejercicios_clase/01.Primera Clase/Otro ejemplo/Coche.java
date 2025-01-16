class Coche
{
	String marca;
	String modelo;
	boolean electrico;
	int matriculacion;


	Coche(String marca, String modelo, boolean electrico, int matriculacion)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.electrico = electrico;
		this.matriculacion = matriculacion;
	}

	String presentarse()
	{

		return " Marca: " + this.marca + " Modelo: " + this.modelo;


	}

	boolean entrar_madrid()
	{
		if (this.electrico || this.matriculacion > 2020)
		{
			return true;
		}else{
			return false;
		}
	}



}