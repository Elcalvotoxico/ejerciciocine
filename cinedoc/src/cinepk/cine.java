package cinepk;

public class cine {
public int aforo;
public int butacasOcupadas;
public String tituloPelicula;
public double precioEntrada;
/**
 * constructor vacio
 */
public cine() {
	super();
}
/**
 * Constuctor con el parametro aforo
 * @param aforo int
 */
public cine(int aforo) {
	super();
	this.aforo = aforo;
}
/**
 * constr2uctor con tres parametros
 * @param aforo int
 * @param tituloPelicula String
 * @param precioEntrada int
 */
public cine(int aforo, String tituloPelicula, double precioEntrada) {
	super();
	this.aforo = aforo;
	this.tituloPelicula = tituloPelicula;
	this.precioEntrada = precioEntrada;
}


/**
 * Devuelve el parametro aforo
 * @return
 */
public int getAforo() {
	return aforo;
}

/**
 *Modifica el parametro aforo
 * @param aforo int
 */
public void setAforo(int aforo) {
	this.aforo = aforo;
}
/**
 * Devuelve el parametro butacasOcupadas
 * @return
 */
public int getButacasOcupadas() {
	return butacasOcupadas;
}
/**
 * Modifica el parametro butacasOcupadas
 * @param butacasOcupadas int
 */
public void setButacasOcupadas(int butacasOcupadas) {
	this.butacasOcupadas = butacasOcupadas;
}
/**
 * devuelve el parametro tituloPelicula
 * @return
 */
public String getTituloPelicula() {
	return tituloPelicula;
}
/**
 * Modifica el parametro tituloPelicula
 * @param tituloPelicula String
 */
public void setTituloPelicula(String tituloPelicula) {
	this.tituloPelicula = tituloPelicula;
}
/**
 * Devuelve el parametro precioEntrada
 * @return
 */
public double getPrecioEntrada() {
	return precioEntrada;
}
/**
 * Modifica el parametro precioEntrada
 * @param precioEntrada double
 */
public void setPrecioEntrada(double precioEntrada) {
	this.precioEntrada = precioEntrada;
}



}
