import java.util.*;
import java.util.Scanner;

public class PlayArray {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int tamanho = leitor.nextInt();

        int[] numeros = new int[tamanho];
        
        int contador = 0;

        for(int posicao = 0; posicao < tamanho; posicao ++){

            numeros[posicao] = leitor.nextInt();
        }

        for(int posicao = 0; posicao < tamanho; posicao ++){

            if(numeros[posicao]%2 == 0){

                System.out.println(numeros[posicao]);
            }
        }

        for(int posicao = 0; posicao < tamanho; posicao ++){

            if(numeros[posicao]%2 == 1){

                System.out.println(numeros[posicao]);
            }
        }
        
    }
    
}
