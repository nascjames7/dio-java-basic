package dio.strategy;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Comportament normal = new NormalComportament();

        Comportament defensivo = new DefensiveComportament();

        Comportament agressivo = new AgressiveComportament();

        Robo robo = new Robo();

        robo.setComportament(normal);
        robo.mover();
        robo.mover();

        robo.setComportament(defensivo);
        robo.mover();


        robo.setComportament(agressivo);
        robo.mover();



    }
}
