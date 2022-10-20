package collections.set2;

import java.util.*;

//Dadas as seguintes informações sobre meus cachorros, crie uma lista e ordene esta lista exibindo:
//(nome - idade - cor)

//Cão 1 = nome: Rex, idade: 7, cor: yellow;
//Cão 2 = nome: Kiza, idade: 10, cor: brown;
//Cão 3 = nome: Benji, idade: 1, cor: black;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t---.");
        Set<Cao> meusCaes = new HashSet<>() {{

            add(new Cao("Rex", 7, "yellow"));
            add(new Cao("Kiza", 10, "brown"));
            add(new Cao("Benji", 1, "black"));
        }};

        for (Cao cao : meusCaes) System.out.println(cao.getNome() + " - " + cao.getIdade() + " - " + cao.getCor());

        System.out.println("--\tOrdem de inserção\t---.");
        Set<Cao> meusCaes1 = new LinkedHashSet<>() {{

            add(new Cao("Rex", 7, "yellow"));
            add(new Cao("Kiza", 10, "brown"));
            add(new Cao("Benji", 1, "black"));
        }};
        for (Cao cao : meusCaes1) System.out.println(cao.getNome() + " - " + cao.getIdade() + " - " + cao.getCor());

        System.out.println("--\tOrdem Natural\t---.");
        Set<Cao> meusCaes2 = new TreeSet<>(meusCaes1);
        for (Cao cao : meusCaes2) System.out.println(cao.getNome() + " - " + cao.getIdade() + " - " + cao.getCor());

        System.out.println("--\tOrdem Nome/Cor/Idade\t---.");
        Set<Cao> meusCaes3 = new TreeSet<>(new ComparatorNomeCorIdade());
        meusCaes3.addAll(meusCaes);
        for (Cao cao : meusCaes2) System.out.println(cao.getNome() + " - " + cao.getIdade() + " - " + cao.getCor());

    }

}

    class Cao implements Comparable <Cao> {

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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cao cao = (Cao) o;
            return idade == cao.idade && Objects.equals(nome, cao.nome) && Objects.equals(cor, cao.cor);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, idade, cor);
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
        public int compareTo(Cao cao) {
            int idade = Integer.compare(this.getIdade(), cao.getIdade());

            if(idade != 0) return idade;

            return this.getCor().compareToIgnoreCase(cao.getCor());
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

