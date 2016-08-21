package presentacion;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import negocio.iGestionBean;
@ManagedBean
public class ControllerGestionarColeccion {
	
	@ManagedProperty(value="#{modelGestionarColeccion}")
	private ModelGestionarColeccion gestionarColeccion;
	
/**
 * Para conectar la capa de negocio (EJB) con la capa de presentación (JSF) se debe crear una instancia 
 * de la interfaz iGestionBean creada anteriormente en la clase control de JSF para este caso  ControllerAgregar  
 * con la ayuda de la anotación @EJB,una vez creada la instancia podemos utilizar los métodos que declaramos 
 * en la interfaz iGestionBean. Para este ejemplo modificamos el método guardar de la ControllerAgregar para 
 * que realice el llamado al método de iGestionBean que se encarga de agregar el libro.
 */
	@EJB
	iGestionBean gestionBean;

	public ControllerGestionarColeccion(){
		
	}

	public ModelGestionarColeccion getGestionarColeccion() {
		return gestionarColeccion;
	}

	public void setGestionarColeccion(ModelGestionarColeccion gestionarColeccion) {
		this.gestionarColeccion = gestionarColeccion;
	}
	
	public String gestionar(){
				
		String ruta = "casoExitoGestionarColeccion";
		String codigo = this.gestionarColeccion.getCodigo();
		String titulo = this.gestionarColeccion.getTitulo();
		String autor = this.gestionarColeccion.getAutor();
		String area = this.gestionarColeccion.getArea();
		
		try{
			gestionBean.agregarLibro(codigo, titulo, autor, area);
			ruta = "casoExitoGestionarColeccion";
		}catch(Exception ex){
			ruta = "casoAlternativoGestionarColeccion";
		}

		return ruta;
		
	}
}
