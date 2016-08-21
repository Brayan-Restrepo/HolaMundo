package negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.LibroDAO;
import entidades.Libro;

@Stateless
public class CirculacionBean implements iCirculacionBean{

	@Inject
	LibroDAO libroDAO;
	
	public CirculacionBean(){}
	
	public String prestarLibro(String codigoLibro, String codigoEstudiante){
		String caso = null;
		Libro libroBD = libroDAO.consultarLibro(codigoLibro);
		if(libroBD != null)
		    if(libroBD.getEtiquetaReserva()==null||libroBD.getEtiquetaReserva().equals(codigoEstudiante)){
				libroBD.setEstudiantePrestado(codigoEstudiante);
				caso = "exito";
		     }else {
		    	 caso = "alternativo1";
		     }
		else {
			caso = "alternativo2";
		}
		
	   return caso;
	}
}
