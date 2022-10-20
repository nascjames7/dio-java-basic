package collections.set1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
//Não permite elementos duplicados e não possui índice.

//Trabalhando diversas operações a partir de uma lista com 7 notas [7, 8.5, 9.3, 5, 7,0, 3.6] (valores reais).

public class ExemploSet {

    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione 7 notas.");
        //Existem várias formas de realizar esta tarefa.

        //Primeira forma:
        //Set notas = new HashSet(); //(antes do JAVA 5)

        //segunda forma:
        //HashSet<Double> notas = new HashSet<>();

        //Terceira forma:
        //Set<Double> notas = new HashSet<>(); //[](Generics (JDK 5) - []Diamont Operator (JDK 7))

        //Quarta forma:
        //Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        //notas.add(10d);
        //notas.remove(5d);

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 7d está na lista: "+notas.contains(7d));//[]contains

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

        System.out.println("Exiba as notas na ordem em que foram adicionadas:");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2);

        System.out.println("Exiba as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague toda o conjunto.");
        notas.clear();//[]clear

        System.out.println("Confira se a lista está vazia:"+notas.isEmpty());//[]isEmpty
    }


}
