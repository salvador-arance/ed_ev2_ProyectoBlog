package ed_ev2_ProyectoBlog;

public class Post {
	private String titulo =  "";
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	private String contenido = "";
	
	public Post() {
		this.titulo = "Título de ejemplo";
		this.contenido= "Contenido de ejemplo";
	}
	
	public Post(String titulo, String contenido){
		this.titulo = titulo;
		this.contenido = contenido;
	}
	
	public String showPost(){
		String showPost = this.titulo + "\n" + this.contenido;
		return showPost;
	}
	
	@Override
	public String toString() {
		String toString = this.titulo + " " + this.contenido;
		return toString;
	}
}
