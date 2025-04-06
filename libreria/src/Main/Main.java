package Main;

import clases.Libro;

public class Main {

	public static void main(String[] args) {
			Libro libro = new Libro("Carlos", "pepito", 120, 41);
		  int paginasLeidas = 150;
	        int totalPaginas = 300;
	        int paginasDia = 20;

	        int dias = libro.calcularTiempoAcabarLibro(paginasLeidas,paginasDia);
	        
	        if (dias == -1) {
	            System.out.println("No se puede leer el libro.");
	        } else {
	            System.out.println("Días necesarios para acabar el libro: " + dias);
	        }
	    }


	

}
