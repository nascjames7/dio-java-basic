public class Operadores {
    public static void main(String[] args) throws Exception {

        //Concatenação.
        String nomeCompleto = "Liguagem" + " " + "Java";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";//soma os numeros que não sao do tipo String.
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;//não soma quando encontra uma String.
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";//não soma quando encontra uma String.
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);//soma depois de passar pela String.
        System.out.println(concatenacao);

        //Operadores unários de conversão de sinal.
        int numero = 7;
        numero = -numero;//Converte para negativo.
        System.out.println(numero);

        numero = numero*(-1);//Converte para positivo.
        System.out.println(numero);

        //Operadores unários booleanos de conversão.
        boolean variavel = true;
        System.out.println(!variavel);//inverte para falso
        variavel = !variavel;//invertae para falso
        System.out.println(variavel);
        variavel = !(!variavel);//permanece verdadeiro
        System.out.println(variavel);

        //Operação de incrementação (negativa/positiva)
        int valor = 5;
        System.out.println(valor);
        valor =  valor + 2;//incremento de 2.
        System.out.println(valor);
        valor =  valor - 4;//decremento de 4.
        System.out.println(valor);
        valor++;//incremento de 1;
        System.out.println(valor);
        valor--;//decremento de 1.
        System.out.println(valor);
        System.out.println(++valor);//incremento de 1;
        System.out.println(valor);
        System.out.println(--valor);//decremento de 1.
        System.out.println(valor);

        //Operador ternário: 
        //<expressão condicional> ? <caso verdade> : <caso falso>.
        int a, b;
        a = 5;
        b = 6;

        //Sem operador ternário.
        String resultado = "";

        if(a == b){
            resultado = "verdadeiro";

        }else resultado = "falso";

        System.out.println(resultado);

        //Com operador ternário.
        String resultadoOperadorTernarioString = (a == b) ? "verdadeiro" : "falso";
        System.out.println(resultadoOperadorTernarioString);

        int resultadoOperadorTernarioInteiro = (a == b) ? 1 : 0;
        System.out.println(resultadoOperadorTernarioInteiro);

        //Operadores relacionais.
        int numero1 = 1;
        int numero2 = 2;
        
        boolean simNao = (numero1 == numero2);//verifica se é igual
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = (numero1 != numero2);//verifica se é diferente
        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = (numero1 > numero2);//verifica se é maior
        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        simNao = (numero1 < numero2);//verifica se é menor
        System.out.println("numeroUm é menor que numeroDois? " + simNao);

        //Trabalhando com objetos.
        String nomeUm = "Anderson";
        String nomeDois = new String("Anderson");//String não é um tipo primitivo
        System.out.println(nomeUm.equals(nomeDois));//utilizar equals para verificar igualdade

        //Operadores lógicos.
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){

            System.out.println("As duas condições são verdadeiras.");
        }
        if(condicao1 || condicao2){

            System.out.println("Uma das condições é verdadeiras.");
        }
    }
}
