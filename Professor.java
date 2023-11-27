public class Professor extends Pessoa {

    private String endereco;
    private int salario;

    public Professor(String nome, String data, int numero, String telefone, String endereco, int salario) {
        super(nome, data, numero, telefone);
        this.endereco = endereco;
        this.salario = salario;
}

public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }


    public String getEndereco()
    {
        return endereco;
    }

    public void setSalario(int salario)
    {
        this.salario = salario;
    }


    public int getSalario()
    {
        return salario;
    }

}
