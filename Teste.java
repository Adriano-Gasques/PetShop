import java.util.ArrayList;
import java.util.List;

public class Teste {

    private static final Teclado teclado = new Teclado();

    private static Ficha f1;

    private static Cliente c1;

    private static Animal a1;

    private static final List<Ficha> bdf1 = new ArrayList<>();

    private static final List<Cliente> bdc1 = new ArrayList<>();

    static int cod = 0;


//====================================================================================

    public static void main(String[] args) {

        boolean vai = true;
        int menuPrincipal;

        while (vai) {
            int cod = 0;
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
                    System.out.println("1 - Novo Cliente");
                    System.out.println("2 - Cliente Cadastrado");
                    menu1 = Integer.parseInt(teclado.entDados("Escolha uma opcao:"));
                    switch (menu1) {

                        case 1:
                            System.out.println("Cadastrando um novo cliente");
                            cadastrarCliente(c1);
                            cadastrarFicha(f1);
                            break;

                        case 2:
                            int menu2_1;
                            //buscarCliente();
                            System.out.println("1 - Animal(is) cadastrado(s)");
                            System.out.println("2 - Novo animal");
                            menu2_1 = Integer.parseInt(teclado.entDados("Escolha uma opcao:"));
                            switch (menu2_1) {
                                case 1:
                                    System.out.println("Animal(is) do cliente " + c1.getNome());
                                    //imprimirFichaAnimal();
                                    break;

                                case 2:
                                    System.out.println("Cadastrando um novo animal");
                                    //cadastraAnimal(a1);
                                    break;
                            }
                            break;
                    }
                    break;


//=========Consultar Fichas==========================================================================================

                case 2:
                    f1 = new Ficha();
                    int menu2;
                    System.out.println("Consultar Ficha por:");
                    System.out.println("Codigo da Ficha");
                    System.out.println("Cliente");
                    menu2 = Integer.parseInt(teclado.entDados("Escolha uma opcao:"));
                    switch (menu2) {
                        case 1:
                            f1.setCod(Integer.parseInt(teclado.entDados("Informe o Codigo:\t")));
                            f1 = consultarCodigo(f1);
                            if (f1 != null) {
                                imprimirFicha(f1);
                            } else {
                                teclado.entDados("\nNao existe pessoa com este codigo! Press <Enter>...");
                            }
                            break;

                        case 2:
                            f1.getCliente().setNome(teclado.entDados("Digite o Nome do Cliente:"));
                            f1 = consultarNome(f1);
                          /*  if (f1 != null) {
                                imprimirFicha(f1);
                            } else {
                                teclado.entDados("\nNao existe pessoa com este codigo! Press <Enter>...");
                            }
                            
                            */
                            break;
                    }
                    break;


//=========Imprimir todas as Fichas==========================================================================================

                case 3:
                    System.out.println("Imprimeindo todas as fichas");
                    imprimirTudo();
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
    }


    public static Ficha cadastrarFicha(Ficha f1) {

        System.out.println("cadastrar ficha");
        f1.setCod(cod);
//============Dados Cliente===================================================================================
        f1.getCliente().setNome(c1.getNome());
        f1.getCliente().setSobrenome(c1.getSobrenome());
        f1.getCliente().setCpf(c1.getCpf());
        f1.getCliente().setIdade(c1.getIdade());
        f1.getCliente().setSexo(c1.getSexo());
//============Endereço========================================================================================
        f1.getCliente().getEndereco().setRua(c1.getEndereco().getRua());
        f1.getCliente().getEndereco().setNumero(c1.getEndereco().getNumero());
        f1.getCliente().getEndereco().setCidade(c1.getEndereco().getCidade());
        f1.getCliente().getEndereco().setEstado(c1.getEndereco().getEstado());
//============Animal========================================================================================
        f1.getAnimal().setNome(teclado.entDados("Informe o Nome......: "));
        f1.getAnimal().setTipo(teclado.entDados("Informe o Tipo......: "));
        f1.getAnimal().setRaca(teclado.entDados("Informe o Raca......: "));
        f1.getAnimal().setIdade(Integer.parseInt(teclado.entDados("Informe o Idade..: ")));
        f1.getAnimal().setSexo(teclado.entDados("Informe o Sexo......: "));

//============ficha========================================================================================
        f1.setObs(teclado.entDados("Informe o que é pra ser feito......: "));
        f1.setPrazo(teclado.entDados("Informe o prazo......: "));

        bdf1.add(f1);
        return(f1);
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

    public static void imprimirFicha(Ficha f1) {
//====================Ficha===========================================================================================================
        System.out.println("==========Dados da Ficha================");
        System.out.println("Cod: " + f1.getCod());
        System.out.println("Seviço: " + f1.getObs());
        System.out.println("Prazo: " + f1.getPrazo());
//====================Cliente===================================================================================================================
        System.out.println("==========Dados do CLiente==============");
        System.out.println("Nome do CLiente: " + f1.getCliente().getNome()+ " " +f1.getCliente().getSobrenome());
        System.out.println("Idade: " + f1.getCliente().getIdade());
        System.out.println("CPF: " + f1.getCliente().getCpf());
//====================Endereço===============================================================================================================
        System.out.println("Residente da rua :  " + f1.getCliente().getEndereco().getRua() + "  Nº  " + f1.getCliente().getEndereco().getNumero() + ", " + f1.getCliente().getEndereco().getCidade() + " -- " + f1.getCliente().getEndereco().getEstado());
//====================Aniamal=================================================================================================================
        System.out.println("==========Dados do Animal===============");
        System.out.println("Nome: " + f1.getAnimal().getNome());
        System.out.println("Tipo: " + f1.getAnimal().getTipo());
        System.out.println("Raca: " + f1.getAnimal().getRaca());
        System.out.println("Idade: " + f1.getAnimal().getIdade());
        System.out.println("Sexo: " + f1.getAnimal().getSexo());
    }

    public static void imprimirTudo() {
        for (int i = 0; i < bdf1.size(); i++) {
            imprimirFicha(bdf1.get(i));
        }
    }

    public static Ficha consultarCodigo (Ficha f1) {
        for (int i = 0; i < bdf1.size(); i++) {
            if (f1.getCod() == bdf1.get(i).getCod()) {
                return bdf1.get(i);
            }
        }
        return null;
    }

    public static Ficha consultarNome (Ficha f1) {
        for (int i = 0; i < bdf1.size(); i++) {
            if (f1.getCliente().getNome().contains(bdf1.get(i).getCliente().getNome())) {
                if (bdf1.get(i) != null) {
                    imprimirFicha(bdf1.get(i));
                } else {
                    teclado.entDados("\nNao existe pessoa com este codigo! Press <Enter>...");
                }
            }
        }
        return null;
    }

}