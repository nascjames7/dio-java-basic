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

        //Declaração das variáveis auxiliares, resultado e contadores.
        int resultado = numeroNatural;
        numeroNatural--;
        int contador = 1; 
        int auxiliar = 0;
        int auxiliar2 = 0;
        int temp = 0;    
    
        while(numeroNatural > 0){

            int opcao = (contador%4);

            switch(opcao){

                case 1:

                if(contador == 1){

                    resultado = resultado*numeroNatural;
                    numeroNatural--;
                    contador++;
                    //System.out.println("contador: " + contador);
                    //System.out.println("resultado: " + resultado);
                    //System.out.println("numeroNatural: " + numeroNatural);
                    break;            

                }else{

                    auxiliar2 = numeroNatural;

                    if(numeroNatural == 1){

                        resultado = temp + ((-auxiliar)*(auxiliar2));
                        numeroNatural--;
                        contador++;
                        //System.out.println("contador: " + contador);
                        //System.out.println("resultado: " + resultado);
                        //System.out.println("numeroNatural: " + numeroNatural);
                        break;
                    }
                    numeroNatural--;
                    contador++;
                    //System.out.println("contador: " + contador);
                    //System.out.println("temp: " + temp);
                    //System.out.println("auxiliar2: " + auxiliar2);
                    //System.out.println("numeroNatural: " + numeroNatural);
                    break;
                }

                case 2:

                if(contador == 2){                    

                    resultado = resultado/numeroNatural;
                    numeroNatural--;
                    contador++;
                    //System.out.println("contador: " + contador);
                    //System.out.println("resultado: " + resultado);
                    //System.out.println("numeroNatural: " + numeroNatural);
                    break;                                        

                }else{               

                    resultado = temp + ((-auxiliar)*(auxiliar2)/(numeroNatural));
                    numeroNatural--;
                    contador++;
                    //System.out.println("contador: " + contador);
                    //System.out.println("resultado: " + resultado);
                    //System.out.println("numeroNatural: " + numeroNatural);
                    break;                    
                    
                }

                case 3:

                resultado = resultado+numeroNatural;
                temp = resultado;
                numeroNatural--;
                contador++;
                //System.out.println("contador: " + contador);
                //System.out.println("resultado: " + resultado);
                //System.out.println("temp: " + temp);
                //System.out.println("numeroNatural: " + numeroNatural);
                break;

                case 0:

                if(numeroNatural == 1){

                    resultado = resultado-numeroNatural;
                    numeroNatural--;
                    contador++;
                    //System.out.println("contador: " + contador);
                    //System.out.println("resultado: " + resultado);
                    //System.out.println("numeroNatural: " + numeroNatural);
                    break;

                }else{

                    
                    auxiliar = numeroNatural;
                    numeroNatural--;
                    contador++;
                    //System.out.println("contador: " + contador);
                    //System.out.println("temp: " + temp);
                    //System.out.println("auxiliar: " + auxiliar);
                    //System.out.println("numeroNatural: " + numeroNatural);
                    break;
                }

                default:

                System.out.println("Alguma coisa saiu errada!");
            }   
        }     
        
        System.out.println(resultado);        
    }
    
}
