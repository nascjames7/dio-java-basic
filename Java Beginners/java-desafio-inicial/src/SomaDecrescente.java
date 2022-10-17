/**
<h1>SomaDecrescente</h1>
* A SomaDecrescente realiza a soma de todos os valores inferiores a um número natural 
* incluindo o mesmo, até o valor nulo.
* <p>
* <b>Nota:<b> Leia atentamente a documentação desta classe 
* para desfrutar dos recursos oferecidos pelo autor.
* 
* @author James Anderson
* @version 1.0
* @since 16/10/2022
*/

import java.util.Scanner;

public class SomaDecrescente {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int valor = numero.nextInt();

        int soma = somatorio(valor);

        System.out.println(soma);
    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {

        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }    
    
    
}
