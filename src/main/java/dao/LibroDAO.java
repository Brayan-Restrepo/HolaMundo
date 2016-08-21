package dao;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entidades.Biblioteca;
import entidades.Libro;



/**
 * La capa de Datos: Es donde residen los datos y es la encargada de acceder a los mismos. Esta formada 
 * por uno o mas gestores de bases de datos que realizan todo el almacenamiento de datos, 
 * reciben solicitudes de almacenamiento o recuperación de la información desde la capa de negocio.
 * La tecnología a utilizar es JPA (Java Persistence Api):
 * Es una abstracción del Api JDBC para realizar operaciones sobre la base de datos realizando una 
 * conversión entre las entidades Java y  los registros en las tablas por medio de un mapeo objeto-relacional 
 * (ORM), que es una técnica de programación para comunicar datos entre bases de datos relacionales y lenguajes 
 * de programación orientados a objetos, como Java. 
 *
 * Recuperación de la información atreves de consultas implementando el patrón DAO
 *
 * @author Brayan Restrepo
 *
 */
public class LibroDAO {
	
	@PersistenceContext
	EntityManager manager;
	
	/**
	 * Creamos los métodos necesarios para las operaciones CRUD de la entidad libro:
	 * 
	 */
	// Insertar un libro

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void crearLibro(Libro libro){
		manager.persist(libro);
        Biblioteca biblioteca = manager.find(Biblioteca.class, "1");
		biblioteca.addLibro(libro);
	}
	// Eliminar un libro

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void eliminarLibro(Libro libro){
		manager.remove(libro);
	}

	// Consultar un libro

     public Libro consultarLibro (String codigoBarras){
		return manager.find(Libro.class, codigoBarras);
	}
	// Actualizar un libro

    public void actualizarLibro(Libro libro){
    	Libro libroEnBD = manager.find(Libro.class, libro.getCodigoBarras());
		libroEnBD.setTitulo(libro.getTitulo());
		libroEnBD.setAutor(libro.getAutor());
		libroEnBD.setArea(libro.getArea());
		libroEnBD.setEstudiantePrestado(libro.getEstudiantePrestado());
		libroEnBD.setEtiquetaReserva(libro.getEtiquetaReserva());
		libroEnBD.setFechaLimiteEntrega(libro.getEtiquetaReserva());
	}
	
}
