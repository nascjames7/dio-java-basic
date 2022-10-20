package collections.list1;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    //Trabalhando diversas operações a partir de uma lista com 7 notas [7, 8.5, 9.3, 5, 7,0, 3.6] (valores reais).
    public static void main(String[] args) {

        System.out.println("Crie uma lista com e adicione 7 notas.");

        //Existem várias formas de realizar esta tarefa.

        //Primeira forma:
        //List notas = new ArrayList(); //(antes do JAVA 5)

        //segunda forma:
        //List<Double> notas = new ArrayList<>(); //[](Generics (JDK 5) - []Diamont Operator (JDK 7))

        //Terceira forma:
        //ArrayList<Double> notas = new ArrayList<>(); //Não recomendado em algumas situações (Interface versus Implementação)

        //Quarta forma:
        //Não é possivel adicionar/retirar mais elementos dentro da lista.
        //List<Double> notas = new ArrayList<>(Arrays.asList(7, 8.5, 9.3, 5, 7,0, 3.6));

        //Quinta forma:
        //Não é possivel adicionar/retirar mais elementos dentro da lista.
        //List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        //notas.add(10d);

        //System.out.println(notas);

        //Sexta forma:
        //Não é possivel adicionar/retirar mais elementos dentro da lista.
        //List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        //notas.add(1d);//[]add
        //notas.remove(5d);//[]remove

        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas);
        System.out.println(notas.toString());//[]toString

        System.out.println("Exiga a posição da nota 5d."+notas.indexOf(5d));//[]indexOf

        System.out.println("Adicione o elemento 8d na posição 4.");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5d pela nota 6d.");
        notas.set(notas.indexOf(5d),6d);//[]set
        System.out.println(notas);

        System.out.println("Confira se a nota 6d está na lista: "+notas.contains(6d));//[]contains

        System.out.println("Exiba as notas na ordem em que foram informadas.");

        for(Double nota : notas){//[]for each

            System.out.println(nota);
        }

        System.out.println("Exiba terceira nota adicionada: "+ notas.get(2));//[]get

        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));//[]Collections.min

        System.out.println("Exiba a maior nota: "+ Collections.max(notas));//[]Collections.max

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){//[]iterator.hasNext

            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma das notas: "+soma);

        System.out.println("Exiba a media das notas: "+soma/notas.size());//[]size

        System.out.println("Remova a nota 0d: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista");
        notas.remove(0);//[]remove
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){

            Double next = iterator1.next();
            if(next < 7) iterator1.remove();//[]iterator.remove
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista.");
        notas.clear();//[]clear

        System.out.println("Confira se a lista está vazia:"+notas.isEmpty());//[]isEmpty
    }
}
