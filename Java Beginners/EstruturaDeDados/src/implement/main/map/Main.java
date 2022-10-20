package implement.main.map;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<implement.main.list.Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new implement.main.list.Carro("Ford"));
        listaCarros.add(new implement.main.list.Carro("Chevrolet"));
        listaCarros.add(new implement.main.list.Carro("Volksvagem"));
        listaCarros.add(new implement.main.list.Carro("Renault"));

        System.out.println(listaCarros.contains(new implement.main.list.Carro("Ford")));

        System.out.println(listaCarros.get(2));

        System.out.println(listaCarros.indexOf(new Carro("Renault")));

        System.out.println(listaCarros.remove(0));

        System.out.println(listaCarros);



    }

}
