package collections.list2;

//Dadas as seguintes informações sobre meus cachorros, crie uma lista e ordene esta lista exibindo:
//(nome - idade - cor)

//Cão 1 = nome: Rex, idade: 7, cor: yellow;
//Cão 2 = nome: Kiza, idade: 10, cor: brown;
//Cão 3 = nome: Benji, idade: 1, cor: black;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrednacaoList {

    public static void main(String[] args) {

        List<Cao> meusCaes = new ArrayList<>(){{

            add(new Cao("Rex", 7, "yellow"));
            add(new Cao("Kiza", 10, "brown"));
            add(new Cao("Benji", 1, "black"));
        }};

        System.out.println("--\tOrdem de inserção\t---.");
        //Caso não sobrescreva o método toString, retornará apenas o endereço de memória.
        System.out.println(meusCaes);

        System.out.println("--\tOrdem aleatória\t---.");
        Collections.shuffle(meusCaes);
        System.out.println(meusCaes);

        System.out.println("--\tOrdem Natural\t---.");
        Collections.sort(meusCaes);
        System.out.println(meusCaes);

        System.out.println("--\tOrdem idade\t---.");

        //Primeira forma:
        Collections.sort(meusCaes, new ComparatorIdade());
        //Segunda forma:
        //meusCaes.sort(new ComparatorIdade());
        System.out.println(meusCaes);

        System.out.println("--\tOrdem cor\t---.");
        //Primeira forma:
        Collections.sort(meusCaes, new ComparatorCor());
        //Segunda forma:
        //meusCaes.sort(new ComparatorCor());
        System.out.println(meusCaes);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---.");
        //Primeira forma:
        Collections.sort(meusCaes, new ComparatorNomeCorIdade());
        //Segunda forma:
        //meusCaes.sort(new ComparatorCor());
        System.out.println(meusCaes);

    }
}

class Cao implements Comparable<Cao>{

    private String nome;
    private int idade;
    private String cor;

    public Cao(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public int compareTo(Cao cao) {//[]compareTo retorna um índice
        // (0 - nomes iguais, 1 = nomes diferentes (maior que o próximo), -1 = nomes diferentes (menor que o próximo))
        return this.getNome().compareToIgnoreCase(cao.getNome());
    }
}

class ComparatorIdade implements Comparator<Cao> {

    @Override
    public int compare(Cao c1, Cao c2) {
        return Integer.compare(c1.getIdade(), c2.getIdade());
    }
}

class ComparatorCor implements Comparator<Cao> {

    @Override
    public int compare(Cao c1, Cao c2) {
        return c1.getCor().compareToIgnoreCase(c2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Cao> {

    @Override
    public int compare(Cao c1, Cao c2) {
        int nome = c1.getNome().compareToIgnoreCase(c2.getNome());

        if(nome != 0) return nome;

        int cor = c1.getCor().compareToIgnoreCase(c2.getCor());
        if(nome != 0) return cor;

        return Integer.compare(c1.getIdade(), c2.getIdade());

    }
}

