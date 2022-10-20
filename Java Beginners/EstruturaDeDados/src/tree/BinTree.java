package tree;

public class BinTree <T extends Comparable<T>>{

    private BinTreeNo<T> raiz;

    public BinTree() {
        this.raiz = null;
    }

    //Remove o conteudo de um nó.
    public void remover(T conteudo) {//Este método é grande por ser não recursivo.

        //Tratamento de exceção,
        try {
            //Criação dos nós pai, filho, temporario (temp) e atual e atribuição dos atributos do nó raiz ao mesmo (atual).
            BinTreeNo<T> atual = this.raiz;
            BinTreeNo<T> pai = null;
            BinTreeNo<T> filho = null;
            BinTreeNo<T> temp = null;

            //Laço para percorrer a árvore.
            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                //Atribuição dos atributos do nó atual ao nó pai.
                pai = atual;

                //Verifição de comparação entre os conteudos para facilitar a busca na árvore binária.
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    //Caso afirmativo, ou seja, menor, vamos para a esquerda.
                    atual = atual.getNoEsq();

                } else {
                    //Caso negativo, ou seja, maior, vamos para a direita.
                    atual = atual.getNoDir();
                }
            }
                //Verifição se o atual é nulo (árvore vazia, ou conteudo não encontrado).
                //Em ambos os casos, chegaremos nesta situação.
                if (atual == null) {
                    //Impressão de mensagem.
                    System.out.println("\nConteúdo não encontrado! Bloco Try.");
                }
                //Verfica se o nó pai é nulo.
                if (pai == null) {
                    //Verfica se o nó direito na referência do nó atual é nulo.
                    if (atual.getNoDir() == null) {
                        this.raiz = atual.getNoEsq();

                        //Verfica se o nó direito na referência do nó atual é nulo.
                    } else if (atual.getNoEsq() == null) {
                        this.raiz = atual.getNoDir();

                    } else {
                        //Implementação do laço.
                        for (temp = atual, filho = atual.getNoEsq();//condições iniciais do laço
                             filho.getNoDir() != null; //condição de parada
                             temp = filho, filho = filho.getNoEsq()) { //incremento
                            //Verifica se o nó filho é diferente do nó filho esquerdo do nó atual.
                            if (filho != atual.getNoEsq()) {
                                //Caso seja, passa-se a referência do nó esquerdo do nó filho para a referência do nó direito de temp.
                                temp.setNoDir(filho.getNoEsq());
                                //Caso seja, passa-se a referência do nó esquerdo do nó raiz para a referência do nó esquerdo de filho.
                                filho.setNoEsq(raiz.getNoEsq());
                            }
                        }
                        //Atribui-se a referência do nó direito do nó raiz para a referência do nó direito de filho.
                        filho.setNoDir(raiz.getNoDir());
                        raiz = filho;
                    }

                    //Verfica se o nó direito na referência do nó atual é nulo.
                } else if (atual.getNoDir() == null) {
                    //Verifica se a referência esquerda do nó pai é igual ao nó atual.
                    if ((pai.getNoEsq() == atual)) {
                        //Atribui-se a referência do nó esquerdo do nó atual para a referência do nó esquerdo de pai.
                        pai.setNoEsq(atual.getNoEsq());
                        //Caso contrário.
                    } else {
                        //Atribui-se a referência do nó esquerdo do nó atual para a referência do nó direito de pai.
                        pai.setNoDir(atual.getNoEsq());
                    }
                }
                //Verfica se o nó esquerdo na referência do nó atual é nulo.
                else if (atual.getNoEsq() == null) {
                    //Verifica se a referência esquerda do nó pai é igual ao nó atual.
                    if ((pai.getNoEsq() == atual)) {
                        //Atribui-se a referência do nó direito do nó atual para a referência do nó esquerdo de pai.
                        pai.setNoEsq(atual.getNoDir());
                        //Caso contrário.
                    } else {
                        //Atribui-se a referência do nó direito do nó atual para a referência do nó direito de pai.
                        pai.setNoDir(atual.getNoDir());
                    }
                } else {
                    //pai.setNoDir(filho);
                    for (temp = atual, filho = atual.getNoEsq();//condições iniciais do laço
                         filho.getNoDir() != null; //condição de parada
                         temp = filho, filho = filho.getNoDir()) { //incremento
                        //Verifica se o nó filho é diferente do nó filho esquerdo do nó atual.
                        if (filho != atual.getNoEsq()) {
                            //Caso seja, passa-se a referência do nó esquerdo do nó filho para a referência do nó direito de temp.
                            temp.setNoDir(filho.getNoEsq());
                            //Caso seja, passa-se a referência do nó esquerdo do nó raiz para a referência do nó esquerdo de filho.
                            filho.setNoEsq(atual.getNoEsq());
                        }
                        filho.setNoDir(atual.getNoDir());
                        if (pai.getNoEsq() == atual) {
                            pai.setNoEsq(filho);
                        } else {
                            pai.setNoDir(filho);
                        }
                    }
                }
        } catch (NullPointerException erro) {
            //Impressão de mensagem.
            System.out.println("\nConteúdo não encontrado! Bloco Catch.");
        }
    }

    //Exibe os nós em ordem.
    public void exibirInOrdem(){

        //Exibe os nós em ordem.
        System.out.println("\nExibindo InOrdem: ");
        //Chamada do procedimento privado exibirInOrdem a partir do nó raiz.
        exibirInOrdem(this.raiz);
    }

    //Exibe os nós dentro do procedimento publico exibirInOrdem() conforme especificado.
    private void exibirInOrdem(BinTreeNo<T> atual){

        //Verifica se o nó atual é nulo.
        if(atual != null){
            //Chamada recursiva do procedimento privado exibirInOrdem(BinTreeNo<T> atual).
            //Percorre a árvore em direção ao extremo nó esquerdo (o de valor menor).
            exibirInOrdem(atual.getNoEsq());
            //Impressão do conteudo do nó.
            System.out.print(atual.getConteudo()+ ", ");
            //Chamada recursiva do procedimento privado exibirInOrdem(BinTreeNo<T> atual).
            //Percorre a árvore em direção ao nó direito (irmão do nó atual impresso imediatamente anteriormente).
            //Impressão do conteudo do nó irmão do noESq, ou seja, do noDir.
            exibirInOrdem(atual.getNoDir());
        }
    }

    //Exibe os nós em pós-ordem.
    public void exibirPosOrdem(){

        //Exibe os nós em ordem.
        System.out.println("\nExibindo PosOrdem: ");
        //Chamada do procedimento privado exibirPosOrdem a partir do nó raiz.
        exibirPosOrdem(this.raiz);
    }

    //Exibe os nós dentro do procedimento publico exibirPosOrdem() conforme especificado.
    private void exibirPosOrdem(BinTreeNo<T> atual){

        //Verifica se o nó atual é nulo.
        if(atual != null){
            //Chamada recursiva do procedimento privado exibirInOrdem(BinTreeNo<T> atual).
            //Percorre a árvore em direção ao extremo nó esquerdo (o de valor menor).
            exibirPosOrdem(atual.getNoEsq());
            //Chamada recursiva do procedimento privado exibirPosOrdem(BinTreeNo<T> atual).
            //Percorre a árvore em direção ao nó direito (irmão do nó atual impresso imediatamente anteriormente).
            //Impressão do conteudo do nó irmão do noESq, ou seja, do noDir.
            exibirPosOrdem(atual.getNoDir());
            //Impressão do conteudo do nó.
            System.out.print(atual.getConteudo()+ ", ");

        }
    }

    //Exibe os nós em pré-ordem.
    public void exibirPreOrdem(){

        //Exibe os nós em pré-ordem.
        System.out.println("\nExibindo PreOrdem: ");
        //Chamada do procedimento privado exibirPreOrdem a partir do nó raiz.
        exibirPreOrdem(this.raiz);
    }

    //Exibe os nós dentro do procedimento publico exibirPreOrdem() conforme especificado.
    private void exibirPreOrdem(BinTreeNo<T> atual){

        //Verifica se o nó atual é nulo.
        if(atual != null){
            //Impressão do conteudo do nó.
            System.out.print(atual.getConteudo()+ ", ");
            //Chamada recursiva do procedimento privado exibirPreOrdem(BinTreeNo<T> atual).
            //Percorre a árvore em direção ao extremo nó esquerdo (o de valor menor).
            exibirPreOrdem(atual.getNoEsq());
            //Chamada recursiva do procedimento privado exibirPreOrdem(BinTreeNo<T> atual).
            //Percorre a árvore em direção ao nó direito (irmão do nó atual impresso imediatamente anteriormente).
            //Impressão do conteudo do nó irmão do noESq, ou seja, do noDir.
            exibirPreOrdem(atual.getNoDir());
        }
    }

    //Insere um conteudo.
    public void inserir(T conteudo){

        //Instancia um novo nó com o conteudo passado.
        BinTreeNo<T> novoNo = new BinTreeNo<>(conteudo);
        //Chamada da função inserir, que insere um novo nó instanciado acima a partir do nó raiz.
        //Como a raiz é inicialmente nula, o primeiro nó inserido também será a raiz.
        raiz = inserir(raiz, novoNo);
    }


    //Insere um novo nó (método recursivo).
    private BinTreeNo<T> inserir(BinTreeNo<T> atual, BinTreeNo<T> novoNo){

        //Verifica se o nó atual é nulo.
        if(atual == null){
            //Insere novoNo.
            return novoNo;
            //Caso contrário, compara-se os conteudos dos nós.
            //E o conteudo do nó novoNo é menor que o conteudo do nó atual.
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            //Atribui como referência de noEsq do nó atual o menor nó entre o nó atual.getNoEsq() e o novoNo...
            //...quando comparado através da função recursiva inserir.
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
            //Caso seja maior ou igual a zero:
        }else{
            //Atribui como referência de noDir do nó atual o menor nó entre o nó atual.getNoDir() e o novoNo...
            //...quando comparado através da função recursiva inserir.
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        //Retorna o nó atual.
        return atual;
    }
}
