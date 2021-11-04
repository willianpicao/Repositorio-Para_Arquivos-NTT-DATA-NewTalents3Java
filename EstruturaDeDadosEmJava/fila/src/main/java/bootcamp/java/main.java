package bootcamp.java;

public class main {
    public static void main(String[] args){
        Fila minhaFila = new Fila();

        minhaFila.insereNo("primeiro");
        minhaFila.insereNo("segundo");
        minhaFila.insereNo("terceiro");
        minhaFila.insereNo("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.removeNo());
        System.out.println(minhaFila);

        minhaFila.insereNo("ultimo");
        System.out.println(minhaFila);

        System.out.println(minhaFila.first());
    }
}
