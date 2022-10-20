package implement.main.set;

import java.util.Objects;

public class Carro implements Comparable<Carro>{

    String marca;

    public Carro(String marca) {

        this.marca = marca;
    }

    @Override
    public int compareTo(Carro o) {
        if (this.marca.length() < o.marca.length()) {
            return -1;
        } else if (this.marca.length() > o.marca.length()){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carro)) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }


}
