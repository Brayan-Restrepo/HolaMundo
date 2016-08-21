package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Libro.class)
public abstract class Libro_ {

	public static volatile SingularAttribute<Libro, Biblioteca> bibliotecaBean;
	public static volatile SingularAttribute<Libro, String> titulo;
	public static volatile SingularAttribute<Libro, String> etiquetaReserva;
	public static volatile SingularAttribute<Libro, String> area;
	public static volatile SingularAttribute<Libro, String> autor;
	public static volatile SingularAttribute<Libro, String> fechaLimiteEntrega;
	public static volatile SingularAttribute<Libro, String> estudiantePrestado;
	public static volatile SingularAttribute<Libro, String> codigoBarras;

}

