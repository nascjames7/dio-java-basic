package pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    //Remove o nó no topo da pilha.
    public No pop(){

        //Verfica se o nó no topo da pila é nulo.
        if(!isEmpty()){
            //Caso nao nulo, "cria um nó" a ser retirado da pilha e atribui-se a ele a referencia do nó do topo.
            No noPoped = refNoEntradaPilha;
            //Atribui-se a referência do nó no topo ao próximo nó da pilha (imediaamente ao nó retirado).
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return  null;
    }

    //Insere um novo nó na pilha.
    public void push(No novoNo){
        //Guarda o endereço do primeiro nó.
        No refAuxiliar = refNoEntradaPilha;
        //Atribui o novo nó a varíavel refNoEtrada.
        refNoEntradaPilha = novoNo;
        //Substitui o valor nulo pelo valor de referencia guardado no refAuxiliar, já que este será o primeiro nó .
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    //Retorna a referência do no de entrada  (no do topo).
    public No top(){
        return refNoEntradaPilha;
    }

    //Verifica se a pilha está vazia.
    //Primeira forma.
    public boolean isEmpty() {
        /*if(refNoEntradaPilha == null){
            return true;
        }

        return false;
    }*/

        //Segunda forma (Ternário).
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {

        //Será impresso ao fim de cada loop.
        String stringRetorno = "-------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "-------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            //Condição para verificar se o noAuxiliar é nulo.
            if(noAuxiliar != null){
                //Será impresso o atributo dado do nó no topo da pilha se noAuxiliar diferente de nulo.
                stringRetorno += "[No{dado = "+ noAuxiliar.getDado() +"}]\n";
                //O noAuxiliar passa a ser o próximo imediatamaente abaixo daquele que já foi impresso.
                noAuxiliar = noAuxiliar.getRefNo();
                stringRetorno += "=============\n";

            //Caso a pilha esteja vazia (noAuxiliar = null), sai do loop.
            }else{
                break;
            }
        }
        //springRetorno é impresso sempre sempre que o noAuxiliar for diferente de nulo.
        return stringRetorno;
    }
}
