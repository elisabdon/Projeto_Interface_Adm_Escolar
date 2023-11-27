import java.util.Date;

public class Inscricao {
    private Aluno aluno;
    private Curso curso;
    private Date dataInscricao;

    // Construtor
    public Inscricao(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataInscricao = new Date(); // Data atual como data de inscrição
    }

    // Getters e Setters
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    // Método toString para representar a inscrição como uma String
    @Override
    public String toString() {
        return "Inscricao{" +
                "aluno=" + aluno.getNome() +
                ", curso=" + curso.getNome() +
                ", dataInscricao=" + dataInscricao +
                '}';
    }
}
