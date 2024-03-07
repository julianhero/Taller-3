package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural {

	public String NATURAL = "Natural";
	
	private String nombre;
	public ClienteNatural(String nombre1)
	{
		nombre = nombre1;
	}
	
	public String getIdentenficador()
	{
		return nombre;
	}
	public String getTipoCliente()
	{
		return NATURAL;
	}
}
