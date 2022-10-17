/**
<h1>FatorialDesajeitado</h1>
* O FatorialDesajeitado recebe um número natural N e calcula o fatorial 
* utilizando as operações matemáticas na seguinte ordem: multiplicação, divisão, adição
* e subtração (no fatorial padrão, usariamos apenas a multiplicação) em ordem decrescente
* até o número zero.
* <p>
* <b>Nota:<b> Leia atentamente a documentação desta classe 
* para desfrutar dos recursos oferecidos pelo autor.
* 
* @author James Anderson
* @version 1.0
* @since 17/10/2022
*/

import java.util.*;

public class FatorialDesajeitado {

    public static void main(String[] args) {

        /**
         * Declaração do número natural N que é chamado (new Scanner(System.in))
         * e lido como String (nextLine())
         * e em seguida, tranformado em inteiro na linha abaixo (Integer.parseInt)
         */

        int numeroNatural = Integer.parseInt(new Scanner(System.in).nextLine());
        int resultado = 0;
        int contador = 1;
        int auxiliar = numeroNatural;
        //numeroNatural--;

        while (numeroNatural > 0) {

            if(contador%4 == 1){

                resultado = (numeroNatural/)
            }
            
        }
        System.out.println(resultado);        
    }
    
}
