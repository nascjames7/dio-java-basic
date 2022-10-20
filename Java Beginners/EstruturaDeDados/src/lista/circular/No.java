package lista.circular;

public class No<T> {

    private No<T> proximoNo;
    private T conteudo;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
