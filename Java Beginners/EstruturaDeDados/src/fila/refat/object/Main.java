package fila.refat.object;

public class Main {

    public static void main(String[] args) {

        Fila minhaFila = new Fila();

        minhaFila.enqueue(new fila.application.No("primeiro"));
        minhaFila.enqueue(new fila.application.No("segundo"));
        minhaFila.enqueue(new fila.application.No("terceiro"));
        minhaFila.enqueue(new fila.application.No("quarto"));
        minhaFila.enqueue(new fila.application.No("quinto"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila.first());

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue(new No("last"));

        System.out.println(minhaFila);

    }
}

