package controladores;



import java.util.ArrayList;
import java.util.List;

import entidades.Libros;

import servicios.ImplDao;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplDao dao = new ImplDao();
		
		
		List<Libros> listaLibros = new ArrayList<Libros>();
		
		listaLibros = dao.obtenerLibrosDesdeBaseDeDatos();
		
		for (Libros libro : listaLibros) {
			System.out.println(libro.getId_libro()+", "+libro.getTitulo()+", "+libro.getAutor()+", "+libro.getIsbn());
			
		}
		
		
		
	}

}
