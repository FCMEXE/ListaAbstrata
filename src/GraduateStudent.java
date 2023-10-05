public class GraduateStudent extends student {
    String anoConclusaoEnsinoMedio;
    double ac1;
    double ac2;
    double af;
    double ag;

    GraduateStudent() {
    }

    GraduateStudent(String Ra, String anoConclusaoEnsinoMedio, String curso) {
    }

    @Override
    public String toString() {
        return "\n  Ra:" + getRa() +
                "\n Nome:" + getNome() +
                "\n Ano de Conclusão:" + anoConclusaoEnsinoMedio +
                "\n Nota final:" + CalcularMedia() +
                "\n Resultado do curso:" + verificarAprovacao();
    }

    public double CalcularMedia() {
        return (ac1 * 0.1) + (ac2 * 0.3) + (ag * 0.2) + (af * 0.4);
    }

    public String verificarAprovacao() {
        return "sim";
    }

    public String getAnoConclusaoEnsinoMedio() {
        return anoConclusaoEnsinoMedio;
    }

    public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    public double getAc1() {
        return ac1;
    }

    public void setAc1(double ac1) {
        this.ac1 = ac1;
    }

    public double getAc2() {
        return ac2;
    }

    public void setAc2(double ac2) {
        this.ac2 = ac2;
    }

    public double getAf() {
        return af;
    }

    public void setAf(double af) {
        this.af = af;
    }

    public double getAg() {
        return ag;
    }

    public void setAg(double ag) {
        this.ag = ag;
    }
}
