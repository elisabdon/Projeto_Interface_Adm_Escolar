import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private String endereco;
    private int id;
    private int ano;
    private Diretor diretor; // Adicionando campo para Diretor
    private List<Professor> professores;
    private List<Aluno> alunos;
    private List<Curso> cursos;

    // Modificado para incluir Diretor no construtor
    public Escola(String nome, String endereco, int id, int ano, Diretor diretor) {
        this.nome = nome;
        this.endereco = endereco;
        this.id = id;
        this.ano = ano;
        this.diretor = diretor; // Inicializando o diretor
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
   
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    public int getAno()
    {
        return ano;
    }

 public void adicionarProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
    
    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public Diretor getDiretor() {
        return diretor;
    }
    public void removerProfessor(Professor professor) {
        this.professores.remove(professor);
    }

    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void removerCurso(Curso curso) {
        this.cursos.remove(curso);
    }

    public String gerarRelatorioCurso(Curso curso) {
        StringBuilder relatorio = new StringBuilder("Relatório de Notas para o Curso: " + curso.getNome() + "\n");
        for (Aluno aluno : curso.getAlunosInscritos()) {
            relatorio.append("Aluno: ").append(aluno.getNome()).append(", Nota: ").append(aluno.getNota()).append("\n");
        }
        relatorio.append("Média da Turma: ").append(curso.calcularMediaTurma()).append("\n");
        relatorio.append("Desvio Padrão da Turma: ").append(curso.calcularDesvioPadraoTurma()).append("\n");

        return relatorio.toString();
    }

    // Método para gerar relatórios para todos os cursos da escola
    public String gerarRelatorioTodosCursos() {
        StringBuilder relatorioTodosCursos = new StringBuilder("Relatórios de Notas para Todos os Cursos da Escola " + nome + "\n");
        for (Curso curso : cursos) {
            relatorioTodosCursos.append(gerarRelatorioCurso(curso)).append("-----------------------------\n");
        }
        return relatorioTodosCursos.toString();
        
    }
}

