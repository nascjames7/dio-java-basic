package dio.singleton;

//O singleton cria uma única instância de si mesmo.
//Estamos realizando o programação de um singleton preguiçoso.
public class SingletonLazy {

    private static SingletonLazy instance;

    //Construtor privado.
    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance(){

        if(instance == null) {

            instance = new SingletonLazy();
        }
        return instance;
    }
}
