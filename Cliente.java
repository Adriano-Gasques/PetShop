public class Cliente {
    private int idade;
    private String nome;
    private String Sobrenome;
    private int cpf;
    private String sexo;

//======= inicializando endereço;========
    private Endereco endereco = new Endereco();

    public Endereco getEndereco(){return endereco;}

    public void setEndereco(Endereco endereco){this.endereco = endereco;}

//======getters and setters========================
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setSobrenome(String sobrenome) {
        this.Sobrenome = sobrenome;
    }
}
