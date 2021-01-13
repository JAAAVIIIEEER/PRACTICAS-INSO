package interfaces;

import modelo.Incidencia;

public interface IncidenciaInterface {
	public boolean almacenarIncidencia(Incidencia miIncidencia);
	public boolean finalizarIncidencia(int alquilerID);
	public boolean modificarIncidencia(Incidencia miIncidencia);
	public Incidencia consultarIncidencia(int alquilerID);
}
