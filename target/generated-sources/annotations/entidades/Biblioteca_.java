package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Biblioteca.class)
public abstract class Biblioteca_ {

	public static volatile SingularAttribute<Biblioteca, String> nombre;
	public static volatile ListAttribute<Biblioteca, Libro> libros;
	public static volatile SingularAttribute<Biblioteca, String> idBiblioteca;

}

