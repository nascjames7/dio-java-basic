package stream;

/*Dadas as seguintes informações de identidade e contato, crie um dicionário e ordene
o dicionaário, exibindo (Nome: id - Nome: contato.

id = 1 - Contato = nome = Simba - numero = 2222;
id = 4 - Contato = nome = Cami - numero = 5555;
id = 3 - Contato = nome = Jon - numero = 1111;
*/



import java.util.*;
import java.util.function.Function;

public class ExemploStream {

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t---.");
        Map<Integer, Contato> agenda = new HashMap<>()
        {
            {

                put(1, new Contato("Simba", 2222));
                put(4, new Contato("Cami", 5555));
                put(3, new Contato("Jom", 1111));

            }
        };

        for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {

            System.out.println(entry.getKey()+ "-" + entry.getValue().getNome()+ "-" +entry.getValue().getNumero());

        }
        System.out.println("--\tOrdem de inserção\t---.");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>()
        {
            {

                put(1, new Contato("Simba", 2222));
                put(4, new Contato("Cami", 5555));
                put(3, new Contato("Jom", 1111));

            }
        };
        for (Map.Entry<Integer, Contato> entry : agenda1.entrySet()) {

            System.out.println(entry.getKey()+ "-" + entry.getValue().getNome()+ "-" +entry.getValue().getNumero());

        }

        System.out.println("--\tOrdem identidade.\t---.");
        Map<Integer, Contato> agenda2 = new LinkedHashMap<>(agenda);
        for (Map.Entry<Integer, Contato> entry : agenda2.entrySet()) {

            System.out.println(entry.getKey()+ "-" + entry.getValue().getNome()+ "-" + entry.getValue().getNumero());

        }


        System.out.println("--\tOrdem numero telefone\t---.");
        //Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new ComparatorOrdemNumerica());


        /*System.out.println("Classe Anonima");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2) {
                return Integer.compare(contato1.getValue().getNumero(), contato2.getValue().getNumero());
            }
        });*/

        /*System.out.println("Interface Funcional Function");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing
                (new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }));*/

        System.out.println("Utilizando Lambda");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));

        set.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato> entry : set) {

            System.out.println(entry.getKey()+ "-" + entry.getValue().getNome()+ "-" + entry.getValue().getNumero());

        }

        System.out.println("--\tOrdem nome contato\t---.");
        //Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new ComparatorOrdemNomeContato());

        /*System.out.println("Classe Anonima");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2) {
                return contato1.getValue().getNome().compareToIgnoreCase(contato2.getValue().getNome());
            }
        });*/

        System.out.println("Interface Funcional Function");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing
                (new Function<Map.Entry<Integer, Contato>, String>() {
                    @Override
                    public String apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNome();
                    }
                }));

        /*System.out.println("Utilizando Lambda");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));
        */

        set1.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato> entry : set1) {

            System.out.println(entry.getKey()+ "-" + entry.getValue().getNome()+ "-" + entry.getValue().getNome());

        }
    }
}

class Contato {

    private String nome;
    private int numero;

    public Contato(String nome, int numero) {

        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contato{" +
                ", nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;
        Contato contato = (Contato) o;
        return getNumero() == contato.getNumero() && Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumero());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

/*class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>>{

    @Override
    public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2){
        return Integer.compare(contato1.getValue().getNumero(), contato2.getValue().getNumero());
    }
}*/

/*class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>>{

    @Override
    public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2){
        return contato1.getValue().getNome().compareToIgnoreCase(contato2.getValue().getNome());
    }
}*/
