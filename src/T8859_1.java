//import java.io.UnsupportedEncodingException;


//En esta clase se muestra c�mo puede haber un try-catch junto con throws obligatorio �ste
//seg�n haya o no un m�todo que lanza excepci�n fuera del try, adem�s de los del try.
package ejemplos_excepciones;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class T8859_1 {

	public static void main(String[] args)  /*throws IOException*/{
		// TODO Auto-generated method stub

//		DataInputStream entrada = new DataInputStream(new FileInputStream("datos.dat"));	
		byte datos[] = {97,98,99};	
		
		//Charset 
	try {	
		String codificada = new String(datos, "8859_1");
		System.out.print(codificada);
	}
	 catch (UnsupportedEncodingException e) {
	      // TODO Auto-generated catch block
	    //  e.printStackTrace();
	      System.out.println("No se reconoce la codificaci�n");
	    }

	}

	

	
}
