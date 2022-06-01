package src.caja_blanca;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplodeTestExcepcion {
	//Excepecion que conseguimos al dividir un numero entre 0, lo cual no es posible, en este caso no hace falta modificar el programa pues el metodo nos lo permite por si mismo
	//esto es un fallo en el codigo pues se deberia poner una validacion de que si n2==0 nos pida el numero de nuevo
	@Test
	public void testEsmultiplode() {
		try {
		Multiplode md1 = new Multiplode(20);
		md1.esmultiplode(0);
		fail("FALLO, deberia saltar la excepcion");
		}catch (ArithmeticException e) {
			System.out.println("Prueba satisfactoria");
		}
	}

}
