/**
<h1>IgualdadeNumerica</h1>
* A IgualdadeNumerica realiza verificações matemáticas entre números naturais.
* <p>
* <b>Nota:<b> Leia atentamente a documentação desta classe 
* para desfrutar dos recursos oferecidos pelo autor.
* 
* @author James Anderson
* @version 1.0
* @since 16/10/2022
*/

import java.util.Scanner;

public class IguadadeNumerica {

    public static void main(String[] args) {

        //Leitura dos valores naturais para posterior chamada do procedimento.
        Scanner sc = new Scanner(System.in);
        int primeiroNumero = sc.nextInt();
        int segundoNumero = sc.nextInt(); 
        
        //Chamada do procedimento compararNumeros.
        String resposta = compararNumeros(primeiroNumero, segundoNumero);

        //Impressão da resposta.
        System.out.println(resposta);
        
    }

    /**
     * Este método é utilizado para comparar dois números naturais.
     * 
     * @param primeiroNumero este é o primeiro parametro do método.
     * @param segundoNumero este é o segundo parametro do método.
     * @return String (O resultado deste método é uma mensagem 
     * que depende da igualdade dos valores.)
    */

    static private String compararNumeros(int primeiroNumero, int segundoNumero){

        String resultado = "";

        if(primeiroNumero == segundoNumero){

            resultado = "São iguais!";

        }else resultado = "Não são iguais!";

        return resultado;
    }
}
