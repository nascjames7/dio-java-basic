import java.util.*;
import java.util.Scanner;

public class PlayArray {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int tamanho = leitor.nextInt();

        int[] numeros = new int[tamanho];
        int[] paresImpares = new int[tamanho];
        
        int contador = 0;        

        /*Implementação do laço que forma o vetor de numeros inteiros
        e preenche com -1 o vetor de saida*/ 
        for(int posicao = 0; posicao < tamanho; posicao ++){

            numeros[posicao] = leitor.nextInt();
            paresImpares[posicao] = -1;           
        }

        //Implementação do laço que coloca os números pares no ínicio do vetor.
        for(int posicao = 0; posicao < tamanho; posicao ++){

            if(numeros[posicao]%2 == 0){
                
                paresImpares[contador] = numeros[posicao];
                contador++;                
            }
        }        

        /*Implementação do laço que mantem os numeros impares que se encontram em 
        posições superiores a quantidade máxima de numeros pares na mesma posição.*/
        for(int posicao = 0; posicao < tamanho; posicao ++){

            if(numeros[posicao]%2 == 1 && posicao > (contador - 1)){
                
                paresImpares[posicao] = numeros[posicao];                                    
             }            
        }  
       
        //Implementação do laço para preencher os demais campos do vetor de saida.
        for(int posicao = 0; posicao < tamanho; posicao ++){

            for(int posicao2 = 0; posicao2 < tamanho; posicao2 ++){

                if(numeros[posicao]%2 == 1 && paresImpares[posicao2] == -1){

                    paresImpares[posicao2] = numeros[posicao];
                    break;                    
                } 
            }
        }  
                
        //Impressão do vetor de saida.
        for(int posicao = 0; posicao < tamanho; posicao ++){

            System.out.println(paresImpares[posicao]);
        }
        
    }
    
}
