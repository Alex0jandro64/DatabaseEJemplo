package servicios;



import java.io.FileInputStream;
import java.util.Properties;

import entidades.Propertie;




public class ImplProperties implements InterfazProperties{

	
	public Propertie datosProperties() {
		
		Propertie p1 = new Propertie();
		
		Properties prop = new Properties();
	    FileInputStream input = null;
	    
	    try {
            // Cargar el archivo de propiedades
            input = new FileInputStream("C:\\Users\\Puesto17\\Desktop\\Eclipse\\DatabaseEJemplo\\src\\datos.properties");
            prop.load(input);

            // Obtener los valores de conexión desde el archivo de propiedades
            p1.setUsuario(prop.getProperty("db.usuario"));
            p1.setUrl(prop.getProperty("db.url"));
            p1.setPasswd(prop.getProperty("db.passwd"));
            
	    }catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return p1;
	}
}
