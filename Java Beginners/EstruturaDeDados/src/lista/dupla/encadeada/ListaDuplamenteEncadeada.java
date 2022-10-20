package lista.dupla.encadeada;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> firstNo;
    private NoDuplo<T> lastNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.firstNo = null;
        this.lastNo = null;
        this.tamanhoLista = 0;
    }

    @Override
    public String toString() {

        String strRetorno = "";
        NoDuplo<T> noAuxiliar = firstNo;

        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo= " + noAuxiliar.getConteudo() + " }]--->";
            noAuxiliar = noAuxiliar.getNoPosterior();
        }
        strRetorno += "null";
        return strRetorno;
    }

    //Retorna o tamanho da lista.
    public int size(){

        return this.tamanhoLista;
    }

    //Valida o indice.
    private void validaIndice(int index){

        //Verifica se o indice chamado existe.
        if(index >= size()){
            int lastIndice = size() - 1;
            //Lança uma exceção caso o indice não exista.
            throw new IndexOutOfBoundsException("Não existe conteudo no indice " + index + " passado!"
                    + " Esta lista vai até o indice " + lastIndice + ".");
        }

    }

    //Remove o nó da lista.
    public void remove(int index){

        //Chama o procedimento validaIndice.
        validaIndice(index);

        //Verifica se queremos remover o primeiro nó.
        if (index == 0){
            //Este atributo agora aponta para o segundo nó, pois o primeiro será removido.
            firstNo = firstNo.getNoPosterior();
            //Verifica se este proximo nó é nulo (o nó que era o segundo, e agora será o primeiro).
            if(firstNo != null){
                //Caso seja não nulo, atribuímos ao atributo noAnterior o valor null.
                //Pois este agora é o primeiro nó.
                firstNo.setNoAnterior(null);
            }
        }
        else{
            //Caso não seja o primeiro nó que desejamos remover.
            //Instanciamos o nó auxiliar que recebe os atributos do nó que iremos remover.
            NoDuplo<T> noAuxiliar = getNo(index);
            //Atribuimos ao no anterior ao nó que removemos, a atributo noPosterior do próprio noAuxiliar.
            noAuxiliar.getNoAnterior().setNoPosterior(noAuxiliar.getNoPosterior());
            //Verifica se o noAuxiliar é o último nó.
            if(noAuxiliar != lastNo){
                //Se não, atribuimos ao no posterior ao nó que removemos, a atributo noAnterior do próprio noAuxiliar.
                noAuxiliar.getNoPosterior().setNoAnterior(noAuxiliar.getNoAnterior());
            }
            else{
                //Caso seja o último.
                lastNo = noAuxiliar;
            }
        }
        //Decrementa o tamanho da lista.
        this.tamanhoLista--;
    }

    //Retorna o nó com determinado indice.
    private NoDuplo<T> getNo(int index){

        NoDuplo<T> noAuxiliar = firstNo;
        //Implementação do laço.
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoPosterior();
        }
        return noAuxiliar;
    }

    //Retorna o conteudo de um nó com determinado indice.
    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    //Adiciona um nó ao fim da lista.
    public void add(T elemento){

        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoPosterior(null);
        novoNo.setNoAnterior(lastNo);
        if(firstNo == null){
            firstNo = novoNo;
        }
        if (lastNo != null) {
            lastNo.setNoPosterior(novoNo);
        }
        lastNo = novoNo;
        //Incrementa o tamanho da lista.
        tamanhoLista++;
    }

    //Adiciona um nó em determinado indice da lista.
    public void add(int index, T elemento) {

        //Guarda os atributos do nó que será empurrado para próima posição.
        NoDuplo<T> noAuxiliar = getNo(index);
        //Instancia o novo nó que será adicionado a lista duplamente encadeada.
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        //Atribui ao novo nó o atributo noPosterior guardado no noAuxiliar.
        novoNo.setNoPosterior(noAuxiliar);

        //Verifica se o noPosterior é nulo.
        if(novoNo.getNoPosterior() != null){

            //Caso nao seja nulo, atribui ao novo nó o atributo noAnterior guardado no noAuxiliar.
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            //Atribui ao proximo nó a referência do novo nó como nó anterior.
            novoNo.getNoPosterior().setNoAnterior(novoNo);
        }
        else{
            //Caso seja nulo, estamos no último elemento da lista.
            //Atribuímos ao novo nó o atributo noAnterior, guardado no noAuxiliar.
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            //O último nó passa a ser o novo nó.
            lastNo = novoNo;
        }
        //Verifica se o nó a ser inserido será o prmeiro nó.
        if(index == 0){
            //O primeiro nó passa a ser o novo nó.
            firstNo = novoNo;
        }
        else{
            //Atribui ao nó anterior a referência do novo nó como nó posterior.
            novoNo.getNoAnterior().setNoPosterior(novoNo);
        }
        tamanhoLista++;
    }

}
