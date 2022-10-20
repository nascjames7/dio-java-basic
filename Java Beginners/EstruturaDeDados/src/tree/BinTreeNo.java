package tree;

public class BinTreeNo <T extends Comparable<T>>{

    private T conteudo;
    private BinTreeNo<T> noEsq;
    private BinTreeNo<T> noDir;

    public BinTreeNo(T conteudo) {
        this.conteudo = conteudo;
        this.noEsq = null;
        this.noDir = null;
    }

    public BinTreeNo() {
    }

    @Override
    public String toString() {
        return "BinTreeNo{" +
                "conteudo=" + conteudo +
                '}';
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinTreeNo<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinTreeNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    public BinTreeNo<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(BinTreeNo<T> noDir) {
        this.noDir = noDir;
    }
}
