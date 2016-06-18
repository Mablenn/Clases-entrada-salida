
package EntradaSalida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaDeTeclado {
    public static void main(String[] args) throws IOException{
        System.out.println("Escribe una frase: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //En una linea
        //BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String frase = br.readLine();
        System.out.println("Esta es la frase escrita: " + frase);
    }//Fin método main
} //Fin clase
