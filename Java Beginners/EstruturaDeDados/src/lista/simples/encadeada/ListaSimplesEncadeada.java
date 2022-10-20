package lista.simples.encadeada;

public class ListaSimplesEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaSimplesEncadeada() {
        this.referenciaEntrada = null;
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

    //Apresenta o conteudo do nó de indice especificado.
    public T get(int index){
        return getNo(index).getConteudo();
    }

    //Retorna o conteudo do nó excluido.
    public T remove(int index){
        //Atribui o no pivo como aquele que desejamos remover.
        No<T> noPivo = this.getNo(index);
        //Verifica se o indice é zero.
        if(index == 0){
            //Caso seja zero, atribui a referencia de entrada ao proximo nó (subsequente ao nó pivo).
            referenciaEntrada = noPivo.getProximoNo();
            //Retorna o conteudo do nó removido, noPivo.
            return noPivo.getConteudo();
        }

        //Caso não seja o indice zero.
        //Encontra o nó anterior ao que desejo remover.
        No<T> noAnterior = getNo(index - 1);
        //Guarda a referencia do proximo nó (do nó que será removido) dentro do noAnterior.
        noAnterior.setProximoNo(noPivo.getProximoNo());
        //Retorna o conteudo do nó removido, noPivo.
        return noPivo.getConteudo();
    }

    //Apresenta o nó do indice especificado.
    private No<T> getNo(int index){

        //Chama o procedimento validaIndice.
        validaIndice(index);

        //Guarda a rneweferecia da entrada.
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for(int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    //Adiciona um novo nó.
    public void add(T conteudo){
        //Instancia um novo nó.
        No<T> novoNo = new No<>(conteudo);
        //Verifica se a lista está vazia.
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
        //Guarda a referencia de entrada.
        No<T> noAuxiliar = referenciaEntrada;
        //Implementação do laço para adição do nó no final da lista.
        for(int i = 0; i < (this.size() - 1); i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    //Retorna o tamanho da lista.
    public int size(){
        int tamanhoLista = 0;
        //Guarda a referencia de entrada.
        No<T> referenciaAuxiliar = referenciaEntrada;
        //Implementa o loop infinito.
        while(true){
            //Verifica se existem mais nós.
            if(referenciaAuxiliar.getProximoNo() != null){
                tamanhoLista ++;
                //Verifica se o proximo no é o ultimo.
                if(referenciaAuxiliar.getProximoNo() != null){
                    //Caso não seja o ultimo, o nó referencia auxiliar passa a ser este nó.
                    referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
                }
                //Se o proximo nó é nulo, para o loop.
                else{
                    break;
                }
            }
            //Se a lista está vazia, para o loop.
            else{
                break;
            }
        }
        return tamanhoLista;
    }

    //Verifica se a lista está vazia.
    public boolean isEmpty(){
        return referenciaEntrada == null? true : false;
    }

    @Override
    public String toString() {

        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        //Impplementação do laço.
        for(int i = 0; i < this.size(); i++){
            //Impressão da lista (Cada nó e seu conteudo).
            strRetorno += "[No{" + "conteudo =" + referenciaEntrada + "}]--->";
            //Fazemos o noAuxiliar percorrer a lista.
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";

        return strRetorno;
    }

}
