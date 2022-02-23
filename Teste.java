import java.util.ArrayList;
import java.util.List;

public class Teste {

    private static final Teclado teclado = new Teclado();

    private static Ficha f1;

    private static Cliente c1;

    private static Animal a1;

    private static List<Ficha> bdf1 = new ArrayList<Ficha>();

    private static List<Cliente> bdc1 = new ArrayList<Cliente>();

    private int cod = 1;


//====================================================================================

    public static void main(String[] args) {


        int menuPrincipal;


        System.out.println("1) Cadastrar ficha");
        System.out.println("2) Consultar ficha pelo codigo");
        System.out.println("3) Imprimir todas as fichas");
        System.out.println("4) Sair");
        menuPrincipal = Integer.parseInt(teclado.entDados("Escolha uma opcao:"));

        switch (menuPrincipal) {


//=========Cadastrar Fichas==========================================================================================

            case 1:
                int menu1;
                f1 = new Ficha();
                c1 = new Cliente();
                int cod = 1;
                System.out.println("1 - Novo Cliente");
                System.out.println("2 - Cliente Cadastrado");
                menu1 = Integer.parseInt(teclado.entDados("Escolha uma opcao:"));
                switch (menu1) {

                    case 1:
                        System.out.println("Cadastrando um novo cliente");
                        cadastrarCliente(c1);
                        break;

                    case 2:
                        int menu2_1;
                        buscarCliente();
                        System.out.println("1 - Animal(is) cadastrado(s)");
                        System.out.println("2 - Novo animal");
                        menu2_1 = Integer.parseInt(teclado.entDados("Escolha uma opcao:"));
                        switch (menu2_1) {
                            case 1:
                                System.out.println("Animal(is) do cliente " + c1.getNome());
                                imprimirFichaAnimal();
                                break;

                            case 2:
                                System.out.println("Cadastrando um novo animal");
                                cadastraAnimal(a1);
                                break;
                        }
                }
                break;


//=========Consultar Fichas==========================================================================================

            case 2:
                int menu2;
                System.out.println("Consultar Ficha por:");
                System.out.println("Codigo da Ficha");
                System.out.println("Cliente");
                menu2 = Integer.parseInt(teclado.entDados("Escolha uma opcao:"));
                switch (menu2) {
                    case 1:
                        f1.setCod(Integer.parseInt(teclado.entDados("Informe o Codigo:\t")));
                        break;

                    case 2:
                        String consutarNome = teclado.entDados("Digite o Nome do Cliente:");
                        break;
                }
                break;


//=========Imprimir todas as Fichas==========================================================================================

            case 3:
                System.out.println("Imprimeindo todas as fichas");
                imprimirTodasFichas();
                break;


//=========Sair==========================================================================================

            case 4:
                System.out.println("Saindo do menu");
                break;


//=========Opcao default==========================================================================================

            default:
                System.out.println("Opcao invalida!");
        }
    }


    public static void cadastrarFicha(Ficha f1) {

        System.out.println("cadastrar ficha");

        f1.setCod(this.cod);

//============Dados Cliente===================================================================================
        f1.getCliente().setNome(c1.getNome());
        f1.getCliente().setSobrenome(c1.getSobrenome());
        f1.getCliente().setCpf(c1.getCpf());
        f1.getCliente().setIdade(c1.getIdade());
        f1.getCliente().setSexo(c1.getSexo());
//============Endereço========================================================================================
        c1.getEndereco().setRua(c1.getEndereco().getRua());
        c1.getEndereco().setNumero(c1.getEndereco().getNumero());
        c1.getEndereco().setCidade(c1.getEndereco().getCidade());
        c1.getEndereco().setEstado(c1.getEndereco().getEstado());


//============Animal========================================================================================
        f1.getAnimal().setNome(teclado.entDados("Informe o Nome......: "));
        f1.getAnimal().setTipo(teclado.entDados("Informe o Tipo......: "));
        f1.getAnimal().setRaca(teclado.entDados("Informe o Raca......: "));
        f1.getAnimal().setIdade(Integer.parseInt(teclado.entDados("Informe o Idade..: ")));
        f1.getAnimal().setSexo(teclado.entDados("Informe o Sexo......: "));
    }

    public static Cliente cadastrarCliente(Cliente c1) {
        System.out.println("cadastrar Cliente");
//============Dados Cliente===================================================================================
        System.out.println("insira dos dados do Cliente");
        c1.setNome(teclado.entDados("Informe o Nome......: "));
        c1.setSobrenome(teclado.entDados("Informe o Sobrenome......: "));
        c1.setCpf(Integer.parseInt(teclado.entDados("Informe o CPF......: ")));
        c1.setIdade(Integer.parseInt(teclado.entDados("Informe o Idade..: ")));
        c1.setSexo(teclado.entDados("Informe o Sexo......: "));
//============Endereço========================================================================================
        c1.getEndereco().setRua(teclado.entDados("Informe a Rua......: "));
        c1.getEndereco().setNumero(Integer.parseInt(teclado.entDados("Informe o Numero......: ")));
        c1.getEndereco().setCidade(teclado.entDados("Informe a Cidade......: "));
        c1.getEndereco().setEstado(teclado.entDados("Informe o Estado......: "));

        bdc1.add(c1);
        return (c1);

    }


}