/*
	Esta clase, es un sencillo ejemplo para recoger y luego mostrar texto por consola
*/
package EntradaSalida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01{
	public static void main(String[] args) {
		System.out.println("Escribe una frase: ");
		// Entrada
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //Se podría escribir en una sola línea, de este modo ahorraríamos código.
        //BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String frase = br.readLine();
        //Salida
        System.out.println("Esta es la frase escrita: " + frase);
		
	}
}