package fila.refat.generics;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    //Verifica se a fila está vazia.
    public boolean isEmpty(){
        return refNoEntradaFila == null? true : false;
    }

    //Adiciona um novo nó (enfileira).
    public void enqueue (T obj){
        //Instanciação de um nó que recebe como parametro um objeto.
        No novoNo = new No(obj);
        //Atribui a referencia do novo nó a referencia de entrada na fila.
        novoNo.setRefNo(refNoEntradaFila);
        //A referencia de entrada aponta para o novo nó.
        refNoEntradaFila = novoNo;
    }

    //Mostra o primeiro nó da fila.
    public T first() {

        //Verifica se a fila está vazia.
        if (!isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (true) {
                //Teste para verificação da validade do primeiro nó.
                if (primeiroNo.getRefNo() != null) {
                    //Caso exista outro nó na frente, ele passa a ser o primeiro nó.
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    //Mostra e retira o primeiro nó da fila (desenfileira).
    public T dequeue(){

        //Verifica se a fila está vazia.
        if(!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            //Guarda a referencia de entrada na fila.
            No noAuxiliar = refNoEntradaFila;
            while (true) {
                //Teste para verificação da validade do primeiro nó.
                if(primeiroNo.getRefNo() != null){
                    //Tranforma o noAuxiliar no primeiroNo, enquanto retira o antigo primeiro nó.
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();

                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    @Override
    public String toString() {

        String stringRetorno =  "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{object = "+ noAuxiliar.getObject() + "}]--->";

                //Testarse existe apenas um nó na fila.
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    //O primeiro nó da fila aponta para null.
                    stringRetorno += "null";
                    break;
                }
            }
        }
        else{
            stringRetorno = "null";
        }
        return stringRetorno;
    }

}



