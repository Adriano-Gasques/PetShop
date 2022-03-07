package Classes;

public class Animal {
    private int idade;
    private String nome;
    private String raca;
    private String tipo;
    private String sexo;


//============Getters and Setters==================================

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

    public void setSexo(String sexo) {
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

    public String getSexo() {
        return sexo;
    }
}
