package map.map2;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores, crie um dicionário e
ordene este dicionário.

Autor: Hawking, Stephen - Nome: Uma Breve História no Tempo - Páginas: 256.
Autor: Dahig, Charles - Nome: O Poder do Hábito - Páginas: 408.
Autor: Harari, Yuval Noan - Nome: 21 Lições Para o Século 21 - Páginas: 432.
 */

import java.util.*;

public class ExemploOrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t---.");
        Map<String, Livro> meusLivros = new HashMap<>()
        {
            {

                put("Hawking, Stephen", new Livro("Uma Breve História no Tempo", 256));
                put("Dahig, Charles ", new Livro("O Poder do Hábito", 408));
                put("Harari, Yuval Noan", new Livro("21 Lições Para o Século 21", 432));

            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {

            System.out.println(livro.getKey()+ "-" + livro.getValue().getNome());

        }
        System.out.println("--\tOrdem de inserção\t---.");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>()
        {
            {

                put("Hawking, Stephen", new Livro("Uma Breve História no Tempo", 256));
                put("Dahig, Charles ", new Livro("O Poder do Hábito", 408));
                put("Harari, Yuval Noan", new Livro("21 Lições Para o Século 21", 432));

            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {

            System.out.println(livro.getKey()+ "-" + livro.getValue().getNome());

        }
        System.out.println("--\tOrdem alfabética de autores\t---.");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1)
        {
            {

                put("Hawking, Stephen", new Livro("Uma Breve História no Tempo", 256));
                put("Dahig, Charles ", new Livro("O Poder do Hábito", 408));
                put("Harari, Yuval Noan", new Livro("21 Lições Para o Século 21", 432));

            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {

            System.out.println(livro.getKey()+ "-" + livro.getValue().getNome());

        }

        System.out.println("--\tOrdem alfabética dos nomes dos livros\t---.");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());

        meusLivros3.addAll(meusLivros.entrySet());

        for (Map.Entry<String, Livro> livro : meusLivros3) {

            System.out.println(livro.getKey()+ "-" + livro.getValue().getNome());

        }

    }
}

class Livro{

    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return Objects.equals(getNome(), livro.getNome()) && Objects.equals(getPaginas(), livro.getPaginas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPaginas());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {

        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
