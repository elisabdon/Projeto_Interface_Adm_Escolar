import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Aluno> alunosInscritos;

    public Curso(String nome) {
        this.nome = nome;
        this.alunosInscritos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void inscreverAluno(Aluno aluno) {
        this.alunosInscritos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.alunosInscritos.remove(aluno);
    }

    public List<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }

    public double calcularMediaTurma() {
        double somaNotas = 0;
        for (Aluno aluno : alunosInscritos) {
            somaNotas += aluno.getNota();
        }
        return somaNotas / alunosInscritos.size();
    }

    public double calcularDesvioPadraoTurma() {
        double media = calcularMediaTurma();
        double somaDesviosQuadrados = 0;
        for (Aluno aluno : alunosInscritos) {
            double desvio = aluno.getNota() - media;
            somaDesviosQuadrados += desvio * desvio;
        }
        double variancia = somaDesviosQuadrados / alunosInscritos.size();
        return Math.sqrt(variancia);
    }
}
