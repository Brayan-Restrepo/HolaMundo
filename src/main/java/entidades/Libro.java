package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Libro" database table.
 * 
 */
@Entity
@Table(name="\"Libro\"")
@NamedQuery(name="Libro.findAll", query="SELECT l FROM Libro l")
public class Libro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codigo_barras")
	private String codigoBarras;

	private String area;

	private String autor;

	@Column(name="estudiante_prestado")
	private String estudiantePrestado;

	@Column(name="etiqueta_reserva")
	private String etiquetaReserva;

	@Column(name="fecha_limite_entrega")
	private String fechaLimiteEntrega;

	private String titulo;

	//bi-directional many-to-one association to Biblioteca
	@ManyToOne
	@JoinColumn(name="biblioteca")
	private Biblioteca bibliotecaBean;

	public Libro() {
	}

	public String getCodigoBarras() {
		return this.codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEstudiantePrestado() {
		return this.estudiantePrestado;
	}

	public void setEstudiantePrestado(String estudiantePrestado) {
		this.estudiantePrestado = estudiantePrestado;
	}

	public String getEtiquetaReserva() {
		return this.etiquetaReserva;
	}

	public void setEtiquetaReserva(String etiquetaReserva) {
		this.etiquetaReserva = etiquetaReserva;
	}

	public String getFechaLimiteEntrega() {
		return this.fechaLimiteEntrega;
	}

	public void setFechaLimiteEntrega(String fechaLimiteEntrega) {
		this.fechaLimiteEntrega = fechaLimiteEntrega;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Biblioteca getBibliotecaBean() {
		return this.bibliotecaBean;
	}

	public void setBibliotecaBean(Biblioteca bibliotecaBean) {
		this.bibliotecaBean = bibliotecaBean;
	}

}