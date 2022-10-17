/**
<h1>QuadradosPerfeitos</h1>
* O QuadradosPerfeitos recebe um número natural N e calcula a menor 
* quantidade de quadrados perfeitos que somados atingem o valor de N .
* <p>
* <b>Nota:<b> Leia atentamente a documentação desta classe 
* para desfrutar dos recursos oferecidos pelo autor.
* 
* @author James Anderson
* @version 1.0
* @since 17/10/2022
*/

import java.util.*;

public class QuadradosPerfeitos {   
    
    public static void main(String[] args) {

        /**
         * Declaração do número natural N que é chamado (new Scanner(System.in))
         * e lido como String (nextLine())
         * e em seguida, tranformado em inteiro na linha abaixo (Integer.parseInt)
         */

        int numeroNatural = Integer.parseInt(new Scanner(System.in).nextLine());        
        
        /**
         * Declaração do vetor que guardará os números naturais 
         * contidos no intervalo [0, numeroNatural] e do vetor que guardará os
         * quadrados perfeitos.
        */
        int[] numeros = new int[numeroNatural + 1];        
        double[] quadradosPerfeitos = new double[numeroNatural];        

        //Laço que preencherá o vetor numeros[] e o vetor quadradosPerfeitos[].
        for(int posicao = 1; posicao <= numeroNatural; posicao++){

            numeros[posicao] = posicao; 

            //Condição que limita o valor do quadrado perfeito.
            if((Math.pow(posicao,2)) <= numeroNatural){

                quadradosPerfeitos[posicao] = (Math.pow(posicao,2));                   
            }      
        }   
        
        //Declaração do contador de quadrados perfeitos.
        int contadorDeQuadradosPerfeitos = 0;
        
        //Implementação do laço para descobrir a quantidade de quadrados perfeito que serão usados.
        for(int posicao = 0; posicao < numeroNatural; posicao++){

            //Condição para contagem do número de quadrados perfeitos que preencharão o vetor
            //quadradosPerfeitos[]
            if(quadradosPerfeitos[posicao] != 0.0){

                contadorDeQuadradosPerfeitos++; 
                //System.out.println("contadorDeQuadradosPerfeitos: " + contadorDeQuadradosPerfeitos);              
            }
        }
        
        //Declaração de variáveis de contagem, auxiliar e soma.
        int soma = 0;
        int auxiliar = 0;
        int contador1 = 0;
        int contador2 = 0;

        //Condição de execução/parada do bloco.
        while(soma < numeroNatural){            
            
            //Implementação do laço para contagem do menor número de quadrados perfeitos.
            for(int posicao = contadorDeQuadradosPerfeitos; posicao > 0; posicao--){

                soma += (int)quadradosPerfeitos[posicao];
                //System.out.println("soma: " + soma);               
                contador1++;
                //System.out.println("contador1: " + contador1);
                
                if(soma > numeroNatural){
                    
                    auxiliar = soma - (int)quadradosPerfeitos[posicao];
                    //System.out.println("auxiliar: " + auxiliar);
                    soma = auxiliar;
                    //System.out.println("soma: " + soma);
                    contador2++;
                    //System.out.println("contador2: " + contador2);
                }
            }             
        }
        //Declaração da varíavel de contagemFinal.
        int contagemFinal = contador1 - contador2;
        System.out.println(contagemFinal);
    }
}