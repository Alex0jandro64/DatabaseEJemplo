package entidades;

public class Propertie {

	//Atributos
	private String usuario,passwd, url;

	public Propertie(String usuario, String passwd, String url) {
		super();
		this.usuario = usuario;
		this.passwd = passwd;
		this.url = url;
	}

	public Propertie() {
		super();
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
	