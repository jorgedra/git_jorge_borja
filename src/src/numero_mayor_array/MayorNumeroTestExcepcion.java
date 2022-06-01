package src.numero_mayor_array;

import static org.junit.Assert.*;

import org.junit.Test;

public class MayorNumeroTestExcepcion {
	//Este test es para conseguir una excepcion de un array, en el programa principal se ha modificado para que
	//el array se salga de los limites diciendo que compare la posicion 5 de un array de 3, creamos un catch para la excepcion que nos da el programa y asi conseguimos
	//que el test nos salga positivo en la parte de la excepcion, de otra forma saldria el texto de fallo
	@Test
	public void testObt_mayorNumero() {
		try {
		MayorNumero.obt_mayorNumeroExcepcion(new int[] {12, 25, 77});
		fail("FALLO, deberia saltar la excepcion");
		}	catch (IndexOutOfBoundsException e) {
			System.out.println("Prueba satisfactoria");
		}
	}

}


