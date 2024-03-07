package uniandes.dpoo.aerolinea.modelo;

public class Avion 
{

	String nombre;
	int capacidad;
	
	public Avion(String nombre1, int capacidad1)
	{
		nombre = nombre1;
		capacidad = capacidad1;
	}

	public String getNombre()
	{
		return nombre;
		
	}
	
	public int getCapacidad()
	{
		return capacidad;
	}
	
	
}
