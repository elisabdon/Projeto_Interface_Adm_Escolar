import java.util.List;

public class CursoController {
    private Curso curso;

    public CursoController(Curso curso) {
        this.curso = curso;
    }

    public void inscreverAluno(Aluno aluno) {
        curso.inscreverAluno(aluno);
    }

    public void desinscreverAluno(Aluno aluno) {
        curso.removerAluno(aluno);
    }

    public List<Aluno> getAlunosInscritos() {
        return curso.getAlunosInscritos();
    }

}
