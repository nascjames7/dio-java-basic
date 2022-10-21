package dio.singleton;

//O singleton cria uma única instância de si mesmo.
//Estamos realizando o programação de um singleton apressado.
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    //Construtor privado.
    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}
