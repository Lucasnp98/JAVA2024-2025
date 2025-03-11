class Persona{
	String nombre;
	int edad;
	String dni;
	Coche coche; 


	Persona(String nombre, int edad, String dni, Coche coche)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.coche = coche;

	}

	String getNombre()
	{
		return this.nombre;
	}

	int getEdad()
	{
		return this.edad;
	}

	String getDni()
	{
		return this.dni;
	}


	void setEdad(int edad_nueva)
	{
		this.edad = edad_nueva;
	}

	void setDni(String dni_nuevo)
	{
		this.dni = dni_nuevo;
	}

	void cumplir_anios()
	{
		this.edad = this.edad + 1;
	}

	void setNombre(String nombre_nuevo)
	{
		this.nombre = nombre_nuevo;
	}

	String presentarse()
	{
		return "Me llamo: "+ this.nombre + " tengo: " + this.edad + " años y mi dni es: "+ this.dni + this.coche.presentarse() + " Madrid: " + this.coche.entrar_madrid();
	}
}