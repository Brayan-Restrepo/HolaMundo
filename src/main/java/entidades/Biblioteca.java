package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "Biblioteca" database table.
 * 
 */
@Entity
@Table(name="\"Biblioteca\"")
@NamedQuery(name="Biblioteca.findAll", query="SELECT b FROM Biblioteca b")
public class Biblioteca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_biblioteca")
	private String idBiblioteca;

	private String nombre;

	//bi-directional many-to-one association to Libro
	@OneToMany(mappedBy="bibliotecaBean")
	private List<Libro> libros;

	public Biblioteca() {
	}

	public String getIdBiblioteca() {
		return this.idBiblioteca;
	}

	public void setIdBiblioteca(String idBiblioteca) {
		this.idBiblioteca = idBiblioteca;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Libro> getLibros() {
		return this.libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public Libro addLibro(Libro libro) {
		getLibros().add(libro);
		libro.setBibliotecaBean(this);

		return libro;
	}

	public Libro removeLibro(Libro libro) {
		getLibros().remove(libro);
		libro.setBibliotecaBean(null);

		return libro;
	}

}