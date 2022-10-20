package lista.dupla.encadeada;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> noPosterior;
    private NoDuplo<T> noAnterior;

    public NoDuplo() {
    }

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo getNoPosterior() {
        return noPosterior;
    }

    public void setNoPosterior(NoDuplo noPosterior) {
        this.noPosterior = noPosterior;
    }

    public NoDuplo getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(NoDuplo noAnterior) {
        this.noAnterior = noAnterior;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}



