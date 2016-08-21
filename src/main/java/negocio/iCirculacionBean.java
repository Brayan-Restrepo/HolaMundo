package negocio;

import javax.ejb.Remote;

@Remote
public interface iCirculacionBean {
	
	public String prestarLibro(String codigoLibro, String codigoEstudiante);
}
