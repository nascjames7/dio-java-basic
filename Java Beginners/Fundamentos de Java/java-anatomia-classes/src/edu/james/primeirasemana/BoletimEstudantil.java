package edu.james.primeirasemana;

public class BoletimEstudantil {

    //Verifica a média final e declara a situação do aluno: 
    //aprovado/prova de minerva/reprovado.
    public static void main(String[] args) {

        final double MEDIA_FINAL = 6.0;

        //Verifica as condições para declarar a situação do aluno.
        if(MEDIA_FINAL < 6){

            System.out.println("ALUNO REPROVADO");
        }
        if(MEDIA_FINAL == 6){

            System.out.println("PROVA DE MINERVA");

        }else System.out.println("ALUNO APROVADO");
        
    }
    
}
