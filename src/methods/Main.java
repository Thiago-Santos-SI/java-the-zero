package methods;

public class Main {
    public static void main(String[] args) {
        Ponto ponto = new Ponto();
        Ponto ponto2 = new Ponto();
        ponto.x = 10;
        ponto.y = 10;
        //ponto2.x = 50;
        ponto2.y = 50;
        System.out.println(ponto.distancia(ponto2));

    }
}
