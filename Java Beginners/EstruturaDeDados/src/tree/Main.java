package tree;

public class Main {

    public static void main(String[] args) {

        BinTree<Obj> myTree = new BinTree<>();

        myTree.inserir(new Obj(13));
        myTree.inserir(new Obj(10));
        myTree.inserir(new Obj(25));
        myTree.inserir(new Obj(2));
        myTree.inserir(new Obj(12));
        myTree.inserir(new Obj(20));
        myTree.inserir(new Obj(31));
        myTree.inserir(new Obj(29));

        myTree.exibirInOrdem();
        myTree.exibirPreOrdem();
        myTree.exibirPosOrdem();

        myTree.remover(new Obj(7));
        myTree.exibirInOrdem();

        myTree.remover(new Obj(2));
        myTree.exibirInOrdem();
    }


}
