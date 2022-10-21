package dio.singleton;

//Estamos realizando o programação de um singleton encapsulado.

public class SingletonLazyHolder {

    private static class InstanceHolder{

        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    //Construtor privado.
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance(){

        return InstanceHolder.instance;
    }


}
