/**
<h1>BrincandoComArrays</h1>
* O BrincandoComArrays recebe um número natural N que determina o tamanho e consequentemente 
* o numero de elementos de um Array de inteiros positivos e em seguida os elementos 
* do mesmo. E retorna uma lista de números pares e depois,
* de números ímpares (todos elementos do array).
* <p>
* <b>Nota:<b> Leia atentamente a documentação desta classe 
* para desfrutar dos recursos oferecidos pelo autor.
* 
* @author James Anderson
* @version 1.0
* @since 18/10/2022
*/

import java.util.*;

public class BrincandoComArrays {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int tamanho = leitor.nextInt();

        int[] numeros = new int[tamanho];

        for(int posicao = 0; posicao < tamanho; posicao ++){

            numeros[posicao] = leitor.nextInt();
        }

        //Impressão dos inteiros pares.
        for(int posicao = 0; posicao < tamanho; posicao ++){

            if(numeros[posicao]%2 == 0){

                System.out.println(numeros[posicao]);
            }
        }

        //Impressão dos inteiros ímpares.
        for(int posicao = 0; posicao < tamanho; posicao ++){

            if(numeros[posicao]%2 == 1){

                System.out.println(numeros[posicao]);
            }
        }

    }
    
}
