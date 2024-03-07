package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.LinkedList;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {

	private List<Tiquete> tiquetesSinUsar;
	private List<Tiquete> tiquetesUsados;
	
	public Cliente()
	{
		tiquetesSinUsar = new LinkedList<Tiquete>();
		tiquetesUsados = new LinkedList<Tiquete>();
		
		
	}
	
	public abstract String getTipoCliente();

	
	
	public abstract String getIdentenficador();
	
	public void agregarTiquete(Tiquete tiquete)
	{
		tiquetesSinUsar.add(tiquete);
	}
	public int calcularValorTotalTiquetes()
	
	{
		int valorTotal = 0;
	    for (Tiquete tiquete : tiquetesSinUsar) {
	        valorTotal += tiquete.getTarifa();
	    }
	    for (Tiquete tiquete : tiquetesUsados) {
	        valorTotal += tiquete.getTarifa();
	    }
	    return valorTotal;
	}
	public void usarTiquetes(Vuelo vuelo)
	{
		tiquetesSinUsar.remove(vuelo);
		tiquetesUsados.add(vuelo);
	}
	
}
