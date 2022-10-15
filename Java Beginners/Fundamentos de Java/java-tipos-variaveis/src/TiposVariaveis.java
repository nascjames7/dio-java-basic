public class TiposVariaveis {

    public static void main(String[] args) throws Exception {

        //Declaração de variaveis de diferentes tipos.
        double salarioMinimo = 2700.85;   
        String meuNome = "James Anderson";  
        boolean  norteDiferenteDeSul = true;
        char letra = 'd';   

        //Declaração de numeros inteiros de diferentes tipos.
        byte numeroMenor = 10;
        short numeroCurto = 45;
        int numeroNormal = 15000;
        long numeroGrande = 458796321548L;

        //Operação de Casting.
        int numeroNormal2 = numeroCurto;
        short numeroCurto2 = (short)numeroNormal2;
        float salarioBruto = (float)salarioMinimo;

        //Declaração de constantes_valores que podem ser modificados posteriormente versus variaveis. 

        int numero = 10;//Pode ser alterado.
        numero = 5;
        final double NUMER0_PI = 3.14;//Não pode ser alterado.
       
        //Impressão do número com valor modificado.
        System.out.println(numero);

    }
}
