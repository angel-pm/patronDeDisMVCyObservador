package mx.uam.is.practicadiseno;

import mx.uam.is.practicadiseno.datos.MapeadorDatosImpl;
import mx.uam.is.practicadiseno.negocio.ManejadorImpl;
import mx.uam.is.practicadiseno.vista.Ventana;

public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Se crea el mapeador
		MapeadorDatosImpl mapeadorDatosImpl = new MapeadorDatosImpl(); 
		
		//se pasa la referencia al ManejadorImpl
		ManejadorImpl manejador = new ManejadorImpl(mapeadorDatosImpl);
		
		// se crean las 3 ventanas y se les pasa la referencia
		Ventana ventana1 = new Ventana(manejador);
		Ventana ventana2 = new Ventana(manejador);
		Ventana ventana3 = new Ventana(manejador);
		// Muestra las ventanas arrancando asi el programa
		ventana1.setVisible(true);
		ventana2.setVisible(true);
		ventana3.setVisible(true);
	}

}
