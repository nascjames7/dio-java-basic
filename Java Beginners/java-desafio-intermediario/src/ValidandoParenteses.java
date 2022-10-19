/**
<h1>ValidandoParenteses</h1>
* O ValidandoParenteses recebe uma String com símbolos e analisa se os
* parenteses, colchetes e chaves ocorrem em pares ao longo da String.
* <p>
* <b>Nota:<b> Leia atentamente a documentação desta classe 
* para desfrutar dos recursos oferecidos pelo autor.
* 
* @author James Anderson
* @version 1.0
* @since 18/10/2022
*/

import java.util.*;

public class ValidandoParenteses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String simbolos = scanner.nextLine();

        boolean caracter = ehValido(simbolos);

        System.out.println(caracter);
    }    

    public static boolean ehValido(String simbolos) { 
        
        //Contagem de letras da String.
        int numeroDeSimbolos = simbolos.length();

        //Criação de um vetor para alocação das letras da String.
        char letras[] = new char[numeroDeSimbolos];

        //Alocação das letras no Array letras[].
        letras = simbolos.toCharArray();

        boolean resultado = false;        

        if((letras[0] == '(' && letras[1] == ')') || (letras[0] == '[' && letras[1] == ']') ||
            (letras[0] == '{' && letras[1] == '}')){

                resultado = true;
            }
        
        return resultado;
    }      
    
}
