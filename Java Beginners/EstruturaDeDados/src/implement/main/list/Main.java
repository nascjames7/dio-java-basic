package implement.main.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volksvagem"));
        listaCarros.add(new Carro("Renault"));

        System.out.println(listaCarros.contains(new Carro("Ford")));

        System.out.println(listaCarros.get(2));

        System.out.println(listaCarros.indexOf(new Carro("Renault")));

        System.out.println(listaCarros.remove(0));

        System.out.println(listaCarros);



    }

}
