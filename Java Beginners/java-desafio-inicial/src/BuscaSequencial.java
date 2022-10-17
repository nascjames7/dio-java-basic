/**
<h1>BuscaSequencial</h1>
* A BuscaSequencial realiza a busca de um determinado valor em um vetor co 10 elementos
* distintos de forma sequencial. Caso o valor seja encontrado, retorna a posição
* e se não, relata que o número não foi encontrado.
* <p>
* <b>Nota:<b> Leia atentamente a documentação desta classe 
* para desfrutar dos recursos oferecidos pelo autor.
* 
* @author James Anderson
* @version 1.0
* @since 16/10/2022
*/

import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numeroProcurado = leitor.nextInt(); 
        boolean encontrei = false;       

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        for(int posicao = 0; posicao < 10; posicao++){

            if(elementos[posicao] == numeroProcurado){

                System.out.println("Achei " + numeroProcurado + " na posicao " + posicao);
                posicao = 10;
                encontrei = true;
            }
            
        }
        if(encontrei == false){

            System.out.println("Numero " + numeroProcurado + " nao encontrado!");
        }
        
    }
    
}
