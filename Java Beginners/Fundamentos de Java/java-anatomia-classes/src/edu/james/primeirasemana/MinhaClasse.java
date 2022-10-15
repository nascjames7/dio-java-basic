package edu.james.primeirasemana;

public class MinhaClasse {

    public static void main(String[] args) {        

        //Declaração de variáveis de tipos diferentes.
        int anoAtual = 2022;
        boolean informacao = true;
        String primeiroNome = "James";
        String segundoNome = "Anderson";

        //Atribuição do métoddo nomeCompleto a uma variavel do tipo String. 
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        //Impressão do nome usando o símbolo + para concatenar.      
        System.out.println("Olá " + nomeCompleto + ", seja bem-vindo!");
    }

    //Metodo estatico nomeCompleto.
    public static String nomeCompleto (String primeiroNome, String segundoNome){

        //Retorno do método usando concatenação de Strings.
        return primeiroNome.concat(" ").concat( segundoNome);
    }
    
}
