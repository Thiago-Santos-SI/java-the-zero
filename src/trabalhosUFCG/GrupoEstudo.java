package trabalhosUFCG;

public class GrupoEstudo {

    private String disciplina;

    private String[] numColegas;

    public GrupoEstudo(String disciplina, int numColegas) {
        this.disciplina = disciplina;
        this.numColegas = new String[numColegas];
    }

    public void cadastraColega(int posicao, String nomeColega) {
        this.numColegas[posicao] = nomeColega;
    }

    public int totalCadastrados() {
        int count = 0;
        for (int i = 0; i < this.numColegas.length; i++) {
            if (this.numColegas[i] != null) {
                count++;
            }
        }
        return count;
    }

    public String getColega(int posicao) {
        if (this.numColegas[posicao] == null) {
            return "-- SEM COLEGA --";
        } else {
            return this.numColegas[posicao];
        }
    }

    public boolean isColega(String nome) {
        for (String colegas : this.numColegas) {
            if (colegas == nome) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Grupo de Estudo de " + this.disciplina + " Capacidade: " + this.totalCadastrados() + "/" + numColegas.length;
    }
}
