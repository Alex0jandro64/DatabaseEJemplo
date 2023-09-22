package servicios;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import entidades.Libros;
import entidades.Propertie;

public class ImplDao implements InterfazDao{
	
	
	
	
	
        
	public List<Libros> obtenerLibrosDesdeBaseDeDatos() {
		
		ImplProperties p1 = new ImplProperties();
		
		Propertie p = p1.datosProperties();
		
		String DB_URL = p.getUrl();
	    String DB_USER = p.getUsuario();
	    String DB_PASSWORD = p.getPasswd();
	    
        List<Libros> libros = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            if (conn != null) {
                String query = "SELECT * FROM gbp_almacen.gbp_alm_cat_libros";
                try (PreparedStatement stmt = conn.prepareStatement(query);
                     ResultSet rs = stmt.executeQuery()) {

                    while (rs.next()) {
                        int id_libro = rs.getInt("id_libro");
                        String titulo = rs.getString("titulo");
                        String autor = rs.getString("autor");
                        String isbn = rs.getString("isbn");
                        int edicion = rs.getInt("edicion");
                        
                        Libros libro = new Libros(id_libro, edicion,titulo,autor,isbn );
                        libros.add(libro);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        
        return libros;
    }
}
