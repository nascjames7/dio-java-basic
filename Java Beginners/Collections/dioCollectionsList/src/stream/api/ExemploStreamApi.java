package stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExemploStreamApi {

    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos desta lista de Strings");
        //Primeira forma.
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //Segunda forma(Lambda).
        numerosAleatorios.stream().forEach(s -> System.out.println(s));

        //Terceira forma(Lambda sem stream).
        numerosAleatorios.forEach(s -> System.out.println(s));

        //Quarta forma(Utilizando método de referência).
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um set.");

        //Imprimir.
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        //Colocar dentro de um Set.
        Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());

        System.out.println("Transforme essa lista de Strings em uma lista de numeros inteiros.");

        //Primeira forma.
        /*numerosAleatorios.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply (String s){
                return Integer.parseInt();

            }

        });*/

        //Segunda forma (Lambda).
        //numerosAleatorios.stream().map(s -> Integer.parseInt(s));

        //Terceira forma (Utilizando método de referência).
        numerosAleatorios.stream().map(Integer::parseInt);

        //Para imprimir.
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //Colocar dentro de uma variavel.

        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        System.out.println("Pegue os numeros pares e maiores que 2 e os coloque em uma lista.");

        //Primeira forma.

        /*List<Integer> listparesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if (i % 2 == 0 && i > 2) return true;
                        return false;
                    }
                }).collect(Collectors.toList());

        System.out.println(listparesMaioresQue2);*/

        //Segunda forma (Lambda).
        List<Integer> listparesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());

        System.out.println(listparesMaioresQue2);

        System.out.println("Mostre a média dos numeros.");

        //Primeira etapa.
        /*numerosAleatorios.stream()
                .mapToInt(new ToIntFunction<String>() {
                    @Override
                    public int applyAsInt(String s) {
                        return Integer.parseInt(s);
                    }
                });*/

        //Segunda etapa (Lambda).
        /*numerosAleatorios.stream()
                .mapToInt(s -> Integer.parseInt(s));*/

        //Terceira etapa (Utilizando método de referência).
        /*numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(new DoubleConsumer() {
                    @Override
                    public void accept(double value) {
                        System.out.println(value);

                    }
                });*/

        //Quarta etapa (Lambda).
        /*numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(value -> System.out.println(value));*/

        //Quinta etapa (Utilizando método de referência).
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os numeros ímpares.");

        //Primeira etapa.
        /*collectList.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer%2 != 0) return true;
                return false;
            }
        });

        System.out.println(collectList);*/

        //Segunda etapa (Lambda).
        collectList.removeIf(integer -> (integer%2 != 0));

        System.out.println(collectList);

    }
}
