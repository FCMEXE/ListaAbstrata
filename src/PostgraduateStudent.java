public class PostgraduateStudent extends student {
    String anoConclusaoGraduacao;
    double nota1;
    double nota2;

    PostgraduateStudent() {
    }

    PostgraduateStudent(String anoConclusaoGraduacao, String Ra, String nome, String curso) {
    }

    @Override
    public String toString() {
        return " \n Ano de Conclusão:" + anoConclusaoGraduacao +
                "\n Ra:" + getRa() +
                "\n Curso:" + getCurso() +
                "\n Nome:" + getNome() +
                "\n Nota final:" + CalcularMedia() +
                "\n Resultado do curso:" + verificarAprovacao();

    }

    public double CalcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String verificarAprovacao() {
        return "sim";
    }

    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }

    public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}
