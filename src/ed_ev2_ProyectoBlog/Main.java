package ed_ev2_ProyectoBlog;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Blog blog = new Blog();
		int opcion = 0;
		String entrada = "";
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Menú BLOG");
			System.out.println("1: Añadir un post.");
			System.out.println("2: Mostrar un post.");
			System.out.println("3: Eliminar un post.");
			System.out.println("4: Mostrar posts.");
			System.out.println("5: Salir.");
			System.out.print("Elige una opción: ");
			
			entrada = scan.nextLine();
			opcion = Integer.parseInt(entrada);
			
			switch (opcion){
			case 1:
				String titulo = "";
				String contenido = "";
				System.out.print("Añade un título al post: ");
				titulo = scan.nextLine();
				System.out.print("Añade contenido a tu post: ");
				contenido = scan.nextLine();
				Post postAñadir = new Post();
				postAñadir.setTitulo(titulo);
				postAñadir.setContenido(contenido);
				blog.addPost(postAñadir);
				System.out.println("El post ha sido añadido con éxito");
				scan.nextLine();
				break;
			case 2:
				System.out.print("Busca el post a mostrar por su número (1,2,3...): ");
				int indice = Integer.parseInt(scan.nextLine());
				Post postMostrar = blog.getPost(indice);
				postMostrar.showPost();
				System.out.println(postMostrar.showPost());
				scan.nextLine();
				break;
			case 3:
				System.out.print("Busca el post a eliminar por su número (1,2,3...): ");
				indice = Integer.parseInt(scan.nextLine());
				Post postEliminar = blog.getPost(indice);
				if (null != postEliminar) {
					blog.removePost(indice);
					System.out.println("Post eliminado con éxito.");
				}
				scan.nextLine();
				break;
			case 4:
				for (int i = 0; i < 10; i++) {
					System.out.println(blog.getPost(i).toString());
				}
				scan.nextLine();
				break;
			}
		}while(opcion != 5);
		System.out.println("Adiós!");
		scan.close();
	}
}
		



