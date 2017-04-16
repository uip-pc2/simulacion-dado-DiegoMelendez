package app;

/**
 * Created by Diego on 14/4/2017.
 */
public class Dado {
    // Atributos de la clase
    private int numero;

    public Dado() {
        this.numero = (int) (Math.random()*6+1);

        System.out.println(this.numero);
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Acciones de la clase
    public int lanzar() {
        System.out.println("Lanzando dado");
        System.out.println("Dado lanzado......");
        System.out.println("El dado cayo en " + getNumero());
        return 0;
    }
}
