public class Aluno extends Pessoa {
    private int nota;
    private String dataNascimento;
    private String email;

    public Aluno(String nome, String data, int numero, int nota, String telefone, String dataNascimento, String email) {
        super(nome, data, numero, telefone);
        this.nota = nota;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}
