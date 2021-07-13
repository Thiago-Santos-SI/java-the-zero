public class Teste {
    public static void main(String[] args) {
        String[] numColegas = new String[4];
        cadastraColega(0, "thiago", numColegas);
        cadastraColega(1, "sandy", numColegas);
        cadastraColega(2, "isaias", numColegas);


        for (String colegas : numColegas) {
            if (!(colegas == null)){
                System.out.println(colegas);
            }
        }

    }
    public static void cadastraColega(int posicao, String  nome, String[] numColegas) {
        numColegas[posicao] = nome;
    }
}
