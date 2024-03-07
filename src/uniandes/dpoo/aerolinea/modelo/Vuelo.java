package uniandes.dpoo.aerolinea.modelo;
import java.util.Collection;
import java.util.Map;
import uniandes.dpoo.aerolinea.tiquetes.*;



public class Vuelo {
	
	private String fecha;
	private Ruta ruta;
	private Avion avion;
	private Map<String, Tiquete> tiquetes;
	

	//--------------------------------------
	public Vuelo(Ruta ruta1,String fecha1, Avion avion1)
	
	{
		fecha = fecha1;
		ruta = ruta1;
		avion = avion1;
		
		
	}
	
	public Ruta getRuta()
	{
		return ruta;
	}
	public String getFecha()
	{
		return fecha;
	}
	public Avion getAvion()
	{
		return avion;
	}
	public Collection<Tiquete> getTiquetes()
	{
		return null;
	}
	public boolean equals(Object obj)
	{
		return true;
	}

}
