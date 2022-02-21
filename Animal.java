public class Animal {
    private int idade;
    private String nome;
    private String raca;
    private String tipo;
    private boolean sexo;
    private Endereco endereco = new Endereco();

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isSexo() {
        return sexo;
    }
}
