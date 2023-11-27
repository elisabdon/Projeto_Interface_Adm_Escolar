public class Pessoa {
    private String nome;
    private String data;
    private int numero;
    private String telefone;


    public Pessoa(String nome, String data, int numero, String telefone){
        this.nome = nome;
        this.data = data;
        this.numero = numero;
        this.telefone = telefone;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }


    public String getNome()
    {
        return nome;
    }

    public void setData(String data)
    {
        this.data = data;
    }


    public String getData()
    {
        return data;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }


    public int getNumero()
    {
        return numero;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }


    public String getTelefone()
    {
        return telefone;
    }



}
