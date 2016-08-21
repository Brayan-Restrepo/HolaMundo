package negocio;

import javax.ejb.Remote;
/**
 * Interfaz Local: Se utiliza cuando el cliente se encuentra en el mismo servidor Java
 * Interfaz Remota: Se utiliza cuando el código del cliente esta fuera del servidor de aplicaciones 
 * Java (en un maquina virtual DISTINATA  y por  lo tanto se deben hacer ,llamadas remotas para poder 
 * ejecutar los métodos EJB) utilizar llamadas remotas vía RMI.
 * No Interface: Es una simplificación en la versión 3.1 ya que no se requiere de una interfaz es decir 
 * dentro del mismo servidor de aplicaciones Java
 * @author Brayan Restrepo
 *
 */
@Remote
public interface iGestionBean {

	public void agregarLibro(String codigoBarras, String titulo, String autor, String area);

}
