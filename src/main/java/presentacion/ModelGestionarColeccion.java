package presentacion;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ModelGestionarColeccion {
	
	private String codigo;
	private String titulo;
	private String autor;
	private String area;
	
	public ModelGestionarColeccion(){
	
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
}
