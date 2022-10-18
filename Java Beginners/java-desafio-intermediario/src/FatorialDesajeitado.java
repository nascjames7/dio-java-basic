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

        //Declaraçaõ das variáveis resultado e contador.
        int resultado = numeroNatural;
        int contador = 1;
        
        //numeroNatural--;

        //Implementação da condição para execução do bloco.
        while (numeroNatural > 0) {

            int opcao = contador%4;

            switch(opcao){

                case 1:                

                resultado = resultado*(numeroNatural - 1);
                contador++;                
                numeroNatural--;
                break;

                case 2:                

                resultado = resultado/(numeroNatural - 1);
                contador++;                
                numeroNatural--;
                break;

                case 3:                

                resultado = resultado+(numeroNatural - 1);
                contador++;                
                numeroNatural--;
                break;

                case 0:                

                resultado = resultado-(numeroNatural - 1);
                contador++;                
                numeroNatural--;
                break;
                
                default:

                System.out.println("Algo não está certo!");
            }

            contador = 1;      
                     
        }
        System.out.println(resultado);        
    }
    
}
