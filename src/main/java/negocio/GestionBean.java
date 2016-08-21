package negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.LibroDAO;
import entidades.Libro;

/**
 * @Stateless: No guardan estado Este tipo de EJB no mantiene ningún estado del usuario, 
 * es decir, no recuerda ningún tipo de información después de terminada una transacción. 
 *
 * @Stateful: Guardan estado. Este tipo de EJB, mantiene un estado de la actividad del cliente, 
 * por ejemplo, si se tiene un carrito de compras. Este estado se puede recordar incluso una vez 
 * terminada la transacción, pero si el servidor se reinicia esta información se pierde. Están diseñados 
 * para servir procesos de negocio que abarcan múltiples llamados a funciones o transacciones. Para lograr 
 * esto es necesario guardar el estado en que se encuentra el bean luego de cada ejecución del cliente, 
 * el cual se mantiene y actualiza para cada nueva invocación del mismo cliente.
 * 
 * @Singleton: Solo existe una instancia en memoria. Este tipo de beans utiliza el patrón de diseño Singleton, 
 * en el cual solamente existe una instancia en memoria de esta clase. Su intención consiste en garantizar que 
 * una clase sólo tenga una instancia y proporcionar un punto de acceso global a ella.

 * @author Brayan Restrepo
 *
 */
@Stateless
public class GestionBean implements iGestionBean{
	
/**
 * Para conectar la capa de negocio (EJB) con la capa de datos (JPA) se debe crear una instancia de la 
 * clase LibroDAO en la clase Implementación GestionBean con la ayuda de la anotación @Inject , una vez 
 * creada la instancia podemos utilizar los métodos que creamos en la clase DAO en este caso el de persistir 
 * un libro, tal y como se muestra a continuación:
 */
	@Inject
	LibroDAO libroDAO;

	public GestionBean(){
		
	}
	
	public void agregarLibro(String codigoBarras, String titulo, String autor, String area){
		
		Libro objLibro = new Libro();
		
		objLibro.setCodigoBarras(codigoBarras);
		objLibro.setTitulo(titulo);
		objLibro.setAutor(autor);
		objLibro.setArea(area);
		
		libroDAO.crearLibro(objLibro);
	}
}
