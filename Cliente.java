public class Cliente {
    private int idade;
    private String nome;
    private String Sobrenome;
    private int cpf;
    private boolean sexo;

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public boolean isSexo() {
        return sexo;
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

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }
}
