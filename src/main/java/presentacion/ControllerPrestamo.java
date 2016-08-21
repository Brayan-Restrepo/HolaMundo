package presentacion;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import negocio.iCirculacionBean;

@ManagedBean
public class ControllerPrestamo {
	
	@ManagedProperty(value="#{modelPrestamo}")
	private ModelPrestamo prestamo;
	
	@EJB
	iCirculacionBean circulacionBean;
	
	public ControllerPrestamo(){}
	
	public ModelPrestamo getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(ModelPrestamo prestamo) {
		this.prestamo = prestamo;
	}

	public String prestar(){
		
		String libro = prestamo.getCodigoLibro(); 
		String estudiante = prestamo.getCodigoEstudiante();
		String rta = "casoNoExiste";
		
		rta = circulacionBean.prestarLibro(libro, estudiante);
		
		if(rta.equals("exito")){
			rta = "casoExito";
		}else if(rta.equals("alternativo1")){
			rta = "casoEstNoExiste";
		}else {
			rta = "casoEstNoExiste";
		}
		return rta; 	
	}

}
