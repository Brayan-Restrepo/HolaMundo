package presentacion;

//Librería y anotación para poder convertir la clase java plana en un Bean (Managed Bean)
import javax.faces.bean.ManagedBean;

@ManagedBean 
public class ModelPrestamo {

	private String codigoLibro;
	private String codigoEstudiante;
	
	public ModelPrestamo(){
		
	}

	public String getCodigoLibro() {
		return codigoLibro;
	}

	public void setCodigoLibro(String codigoLibro) {
		this.codigoLibro = codigoLibro;
	}

	public String getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public void setCodigoEstudiante(String codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}
}
