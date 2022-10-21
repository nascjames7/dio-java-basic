package dio.strategy;

public class DefensiveComportament implements Comportament{

    @Override
    public void mover() {
        System.out.println("Move-se defensivamente!");
    }
}
