package lista.circular;

import lista.dupla.encadeada.NoDuplo;

public class ListaCircular<T> {

    private No<T> head;//cabeça (último nó)
    private No<T> tail;//cauda (primeiro nó)

    private int tamanhoLista;

    public ListaCircular() {
        this.head = null;
        this.tail = null;
        this.tamanhoLista = 0;
    }

    @Override
    public String toString() {

        String strRetorno = "";
        No<T> noAuxiliar = this.tail;

        for(int i = 0; i < this.size(); i++){
            noAuxiliar = noAuxiliar.getProximoNo();
            strRetorno += "[No{conteudo "+noAuxiliar.getConteudo() + "}]--->";
        }
        //Verifica se a lista está vazia.
        strRetorno += this.size() != 0 ? "(Retorna ao início)" : "[]";

        return strRetorno;
    }

    //Apresenta o nó do indice especificado.
    private No<T> getNo(int index) {

        //Verifica se a lista está vazia.
        if(this.isEmpty()){
            //Caso esteja vazia, lança esta exceção.
            throw new IndexOutOfBoundsException("A lista está vazia!");
        }
        //Atribuição do nó cauda ao noAuxiliar.
        No<T> noAxiliar = this.tail;
        //Implementação do laço.
        for(int i = 0; (i < index) && (noAxiliar != null); i++){
            //Para realizar a circulação na lista
            noAxiliar = noAxiliar.getProximoNo();
        }
        return noAxiliar;
    }

    //Apresenta o conteudo do nó de indice especificado.
    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    //Remove um nó da lista circular.
    public void remove(int index){

        //Verifica se o indice faz parte da lista (validação).
        if(index >= tamanhoLista){
            //Caso seja, lança esta exceção.
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista!");
        }
        //Atribuição do nó cauda ao noAuxiliar (guarda os seus atributos).
        No<T> noAuxiliar = this.tail;
        //Verifica se o índice é zero, nó cauda (primeiro nó).
        if(index == 0) {
            //Atribui ao nó cauda os atributos do proximo nó.
            this.tail = this.tail.getProximoNo();
            //Atualiza no nó cabeça a referência do proximo do novo nó cauda.
            this.head.setProximoNo(this.tail);
        }
        else{
            //Verifica se o índice é um (segundo nó).
            if(index == 1){
                //Ajusta a referência do próximo nó contida no nó cauda.
                this.tail.setProximoNo(this.tail.getProximoNo().getProximoNo());
            }
            else{
                //Implementação do laço.
                for(int i = 0; i < (index - 1); i++){
                    //Percorre a lista.
                    noAuxiliar = noAuxiliar.getProximoNo();
                }
                //Ajusta a referência do próximo nó contida no nó noAuxiliar.
                noAuxiliar.setProximoNo(noAuxiliar.getProximoNo().getProximoNo());
            }
        }
        //Decremento do tamanho da lista.
        this.tamanhoLista--;
    }

    //Adiciona um novo nó no início da lista circular.
    public void add(T conteudo){

        No<T> novoNo = new No<>(conteudo);
        //Verifica se a lista está vazia.
        if(this.tamanhoLista == 0){
            //Atribuimos ao nó cabeça os atributos no novo nó.
            this.head = novoNo;
            //O nó cabeça é exatamente o nó cauda.
            this.tail = this.head;
            //Lista circular: o nó aponta para ele mesmo, pois é tanto cabeça quanto cauda.
            this.head.setProximoNo(tail);
        }
        else{
            //Atribuimos ao novoNo a referência proximoNo como sendo o nó cabeça.
            novoNo.setProximoNo(this.tail);
            //Atribuimos ao nó cabeça a referência proximoNo como sendo o novoNo.
            this.head.setProximoNo(novoNo);
            //Atribuimos ao nó cauda os atributos no novo nó.
            this.tail = novoNo;
        }
        //Incrementa o tamanho da lista.
        this.tamanhoLista++;
    }

    //Retona o tamanho da lista.
    public int size(){
        return this.tamanhoLista;
    }

    //Verifica se a lista está vazia.
    public boolean isEmpty(){
        return this.tamanhoLista == 0? true : false;
    }

}
