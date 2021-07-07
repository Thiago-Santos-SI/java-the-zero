package methods;

public class Ponto {
    public int x;

    public int y;

    public double distancia(Ponto p) {
        int soma = this.x + p.x;
        //int yDist = this.y - p.y;

        return soma;
    }
}
