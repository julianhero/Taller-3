package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {

	private String codigo;
	private int tarifa;
	private boolean usado;
	private Cliente cliente;
	private Vuelo vuelo;
	
	public Tiquete(String codigo1, Vuelo vuelo1, Cliente clienteComprador1, int tarifa1)
	{
		codigo = codigo1;
		tarifa = tarifa1;
		cliente = clienteComprador1;
		vuelo = vuelo1;
	}
	
	public Cliente getCliente()
	{
		return cliente;
	}
	public Vuelo getVuelo()
	{
		return vuelo;
	}
	public String getCodigo()
	{
		return codigo;
	}
	public int getTarifa()
	{
		return tarifa;
	}
	public void marcarComoUsado()
	{
		usado = true;
	}
	public boolean esUsado()
	{
		return usado;
	}
}
