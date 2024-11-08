package school.sptech;

public abstract class Figura {
    public abstract Double calcularArea();

    @Override
    public String toString() {
        return "Figura: " + this.getClass().getSimpleName();
    }
}
