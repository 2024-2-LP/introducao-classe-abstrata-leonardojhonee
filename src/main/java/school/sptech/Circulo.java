package school.sptech;

public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", área=" + calcularArea() + "]";
    }
}
