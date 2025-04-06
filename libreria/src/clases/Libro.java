package clases;

public class Libro {
	protected String titulo;
	protected String autor;
	protected int numeroPaginas;
	protected int anioPublicacion;
	protected String genero;
	protected boolean prestado;
	
	public Libro(String titulo, String autor, int numeroPaginas, int anioPublicacion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.anioPublicacion = anioPublicacion;
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

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public boolean esAntiguo() {
		if(anioPublicacion>50) {
			return true;
		}else {
			return false;
		}
	}
	
	 public static int calcularTiempoAcabarLibro(int paginasLeidas, int paginasDia) {
		int totalPaginas = 0;
		int paginasRestantes = totalPaginas - paginasLeidas;
		if (paginasRestantes <= 0) {
            return 0; 
        } else if (paginasDia <= 0) {
            return -1; 
        }
		int diasNecesarios = paginasRestantes / paginasDia;
		return diasNecesarios + paginasLeidas + paginasDia + totalPaginas;
	}
	
	 public static int calcularPorcentajeSinLeer(int paginasLeidas) {
		 int totalPaginas = 0;
		 return (paginasLeidas/totalPaginas) * 100;
	 }
}
