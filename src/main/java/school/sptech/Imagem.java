package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras = new ArrayList<>();

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        return figuras.stream().mapToDouble(Figura::calcularArea).sum();
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> resultado = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20) {
                resultado.add(figura);
            }
        }
        return resultado;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> resultado = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura instanceof Quadrado) {
                resultado.add(figura);
            }
        }
        return resultado;
    }
}
