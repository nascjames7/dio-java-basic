package dio.singleton;

public class Main {

    //Testes relacionados ao design Pattern Singleton.

    public static void main(String[] args) {

        SingletonLazy lazy = SingletonLazy.getInstance();
        //Imprime o endereço de memória.
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        //Imprime o endereço de memória.
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        //Imprime o endereço de memória.
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        //Imprime o endereço de memória.
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        //Imprime o endereço de memória.
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        //Imprime o endereço de memória.
        System.out.println(lazyHolder);
    }
}

