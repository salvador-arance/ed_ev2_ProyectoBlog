package ed_ev2_ProyectoBlog;

import java.util.ArrayList;

public class Blog {
	private ArrayList<Post> posts = new ArrayList<Post>();

	public ArrayList<Post> getPosts() {
		return posts;
	}

	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
	}
	
	public Blog() {
		String titulo = "Título post";
		String contenido = "Contenido post";
		for (int i = 0; i < 20; i++) {
			this.posts.add(new Post(titulo + " " + (i + 1), contenido + " " +(i + 1)));
		}
	}
	
	public Blog(ArrayList<Post> posts){
		this.posts = posts;
	}
	
	public Post getPost(int i) {
	    if (i >= 0 && i < posts.size()) {
	        return posts.get(i);
	    }
	    return null; 
	}
	
	public void removePost(int i) {
		if (i >= 0 && i < posts.size()) {
	        this.posts.remove(i);
	    }
	}
	
	public void addPost(Post p) {
		this.posts.add(p);
	}
	
}

