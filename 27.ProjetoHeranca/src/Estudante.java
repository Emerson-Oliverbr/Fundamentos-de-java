public class Estudante extends Pessoa{
    private int numeroMatricula;
    private String curso;

    public String exibir() {
        return "Nome: " + super.name + ", E-mail: " + super.email + ", telefone: " + super.telefone + ", Matricula: " + numeroMatricula + ", Curso: " + curso;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
