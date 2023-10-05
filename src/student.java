public abstract class student extends Menu {
    private String Ra;
    private String nome;
    private String curso;

    student() {
    }

    student(String Ra, String nome, String curso) {
    }

    public String getRa() {
        return Ra;
    }

    public void setRa(String ra) {
        Ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public abstract String toString();

    public abstract double CalcularMedia();

    abstract String verificarAprovacao();

}
