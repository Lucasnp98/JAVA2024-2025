/** Clase de funcionalidad variada que proporciona una ayuda al alumno */
public class Util
{
	/*CONSTRUCTOR POR DEFECTO
	Util(){
	
	}
	*/
	/** 
		Detiene el programa el tiempo especificado
		@param segundos número de segundos a esperar 
	*/
	public void wait(int segundos)
	{
		try
		{
			Thread.sleep(segundos*1000);
		}
		catch(Exception e)
		{

		}
	}
}
