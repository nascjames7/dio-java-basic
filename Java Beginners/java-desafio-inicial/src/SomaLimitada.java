/**
<h1>SomaLimitada</h1>
* A SomaLimitada realiza a soma de todos os múltiplos de um número natural 
* que sejam inferiores a um determinado limite N (outro numero natural).
* <p>
* <b>Nota:<b> Leia atentamente a documentação desta classe 
* para desfrutar dos recursos oferecidos pelo autor.
* 
* @author James Anderson
* @version 1.0
* @sinse 16/10/2022
*/

import java.util.Scanner;

public class SomaLimitada {

    public static void main(String[] args) {

        int numeroNatural, valorLimiteDosMultiplos;

        Scanner input = new Scanner(System.in);
        numeroNatural = input.nextInt();
        valorLimiteDosMultiplos = input.nextInt();

        int somaTotal = somarMultiplos(numeroNatural, valorLimiteDosMultiplos);

        System.out.println(somaTotal);
        
    }

    /**
     * Este método é utilizado para comparar dois números naturais.
     * 
     * @param numeroNatural este é o primeiro parametro do método.
     * @param valorLimiteDosMultiplos este é o segundo parametro do método.
     * @return int (O resultado deste método é a soma de todos os valores dos múltiplo
     * do numero natural, incluindo ele mesmo dentro do intervalo:
     * [numeroNatural, valorLimiteDosMultiplos).
    */

    static private int somarMultiplos(int numeroNatural, int valorLimiteDosMultiplos){

        int soma = 0;

        if(numeroNatural == 0){           

            soma = 0;
        }
        //Verifica se os dados permitem o cálculo.
        if(numeroNatural != 0 &&  numeroNatural <= valorLimiteDosMultiplos){            

            //Calcula o numero de multiplos.
            int quantidadeDeMultiplos = valorLimiteDosMultiplos/numeroNatural;
            
            //Utilizando a equação de soma dos termos de uma progressão aritmética.
            soma = ((numeroNatural*(1 + quantidadeDeMultiplos))*quantidadeDeMultiplos)/2;   
    
        }
        return soma;
    }   
    
}
