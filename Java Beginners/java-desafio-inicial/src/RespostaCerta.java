/**
<h1>RespostaCerta</h1>
* A RespostaCerta verifica se um determinado número é múltiplo de 3 ou/e de 5. 
* Dependendo da multiplicidade, retirna ma determinada String relacionada.
* <p>
* <b>Nota:<b> Leia atentamente a documentação desta classe 
* para desfrutar dos recursos oferecidos pelo autor.
* 
* @author James Anderson
* @version 1.0
* @since 16/10/2022
*/

import java.util.Scanner;

public class RespostaCerta {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

        if(num%3 == 0 && num%5 == 0){

            System.out.println("FizzBuzz");

        }
        if(num%3 != 0 && num%5 != 0){

            System.out.println(num);
        }
        if(num%3 == 0 && num%5 != 0){

            System.out.println("Fizz");
        }
        if(num%3 != 0 && num%5 == 0){

            System.out.println("Buzz");
        }
        
    }
    
}
