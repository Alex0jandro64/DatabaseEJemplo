package servicios;

import java.util.List;

import entidades.Libros;

public interface InterfazDao {
	public List<Libros> obtenerLibrosDesdeBaseDeDatos();
}
