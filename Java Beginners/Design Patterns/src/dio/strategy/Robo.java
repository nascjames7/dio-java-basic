package dio.strategy;

public class Robo {

    private Comportament comportament;

    public void setComportament(Comportament comportament) {
        this.comportament = comportament;

    }

    public void mover(){

        comportament.mover();
    }
}
