package trabalhosUFCG;

public class Disciplina {

    private String nomeDisciplina;

    private int cargaHoraria;

    private int exercicios;

    private int cargaHorariaExercicios;

    public Disciplina(String nomeDisciplina, int cargaHoraria) {
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public void adicionaExercicios(int exercicios, int horas) {
        this.exercicios = this.exercicios + exercicios;
        this.cargaHorariaExercicios = this.cargaHorariaExercicios + horas;
    }

    public int cargaHorariaExercicios() {
        return this.cargaHorariaExercicios;
    }

    public int totalExercicios() {
        return this.exercicios;
    }

    public String toString() {
        return this.nomeDisciplina + ": " + totalExercicios() + " execicio(s)" + " CargaTotal " + cargaHoraria + "H " + "CargaExercicio " + this.cargaHorariaExercicios + "H";
    }
}
