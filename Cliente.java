public class Cliente {
    private int idade;
    private String nome;
    private String Sobrenome;
    private int cpf;
    private String sexo;

//======= inicializando animal e endereço;========
    private Endereco endereco = new Endereco();
    private Animal animal = new Animal();

    public Endereco getEndereco(){return endereco;}
    public Animal getAnimal(){return animal;}


    public void setEndereco(Endereco endereco){this.endereco = endereco;}
    public void setAnimal(Animal animal){this.animal = animal;}

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
