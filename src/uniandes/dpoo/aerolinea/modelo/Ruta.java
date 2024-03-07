package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{

	private String horaSalida;
	
	private String horaLlegada;

	private String codigoRuta;
	
	private Aeropuerto origen;
	
	private Aeropuerto destino;
	


	/// ----------------------------------------------------------------------------------
	
	public Ruta(Aeropuerto origen1, Aeropuerto destino1, String horaSalida1, String horaLlegada1, String codigoRuta1)
	{
		origen = origen1;
		destino = destino1;
		horaSalida = horaSalida1;
		horaLlegada = horaLlegada1;
		codigoRuta = codigoRuta1;
	}
	
	
	public String getCodigoRuta()
	{
		return codigoRuta;
	}
	
	public Aeropuerto getOrigen()
	{
		return origen;
		
	}
    
	public Aeropuerto getDestino()
	{
		return destino;
	}
	
	public String getHoraSalida()
	{
		return horaSalida;
	}
	public String getHoraLlegada()
	{
		return horaLlegada;
	}
	public int getDuracion()
	{
		int horaSalidaminutos = Ruta.getMinutos(getHoraSalida());
		int horaLlegadaminutos = Ruta.getMinutos(getHoraLlegada());
		
		
		return horaLlegadaminutos - horaSalidaminutos;
	}
	
	
	
	
	
	/**
     *
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

    
}
