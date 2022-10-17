/**
<h1>Palindromo</h1>
* O Palindromo realiza verificações numa String e retorna
* TRUE (caso seja um palindro) ou FALSE (caso não seja um palindromo).
* <p>
* <b>Nota:<b> Leia atentamente a documentação desta classe 
* para desfrutar dos recursos oferecidos pelo autor.
* 
* @author James Anderson
* @version 1.0
* @since 17/10/2022
*/

import java.util.Scanner;

public class Palindromo {   
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String palavra = leitor.nextLine();

        //Contagem de letras da String.
        int numeroDeLetras = palavra.length();

        //Criação de um vetor para alocação das letras da String.
        char letras[] = new char[numeroDeLetras];

        //Alocação das letras no Array letras[].
        letras = palavra.toCharArray();

        //Declaração de variável booleana de controle.
        boolean istoCorrespondeAoPalinidromo = true;        

        //Criação do laço para verificar se temo um palindromo.
        for(int posicao = 0; posicao < numeroDeLetras; posicao++){

            if(letras[posicao] != letras[(numeroDeLetras -1 ) - posicao]){

                istoCorrespondeAoPalinidromo = false;
            }
        }

        //Laço para impressão da resposta final.
        if(istoCorrespondeAoPalinidromo == true){

            System.out.println("TRUE");

        }else System.out.println("FALSE");                
    }
}
