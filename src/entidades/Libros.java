package entidades;

public class Libros {

	//Atributos
	int id_libro,edicion;
	String titulo,autor,isbn;
	
	//Constructores
	public Libros(int id_libro, int edicion, String titulo, String autor, String isbn) {
		super();
		this.id_libro = id_libro;
		this.edicion = edicion;
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}

	public Libros() {
		super();
	}

	//Getters y Setters
	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
