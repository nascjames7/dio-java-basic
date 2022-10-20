package lista.simples.encadeada;

public class Main {

    public static void main(String[] args) {

        ListaSimplesEncadeada<String> minhaListaEncadeada = new ListaSimplesEncadeada<>();

        minhaListaEncadeada.add("teste 1");

        minhaListaEncadeada.add("teste 2");

        minhaListaEncadeada.add("teste 3");

        minhaListaEncadeada.add("teste 4");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(3);

        System.out.println(minhaListaEncadeada);

    }
}
