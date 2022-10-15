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

    }
}
