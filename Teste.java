import java.util.ArrayList;
import java.util.List;

public class Teste {

    private static Teclado teclado = new Teclado();

    private static Ficha f1;

    private static Cliente c1;

    private static List<Ficha> bdf1 = new ArrayList<Ficha>();

    private static List<Cliente> bdc1 = new ArrayList<Cliente>();

    private static int menu;


//====================================================================================

    public static void main(String[] args) {

        int menuPrincipal;


        System.out.println("1) Cadastrar ficha");
        System.out.println("2) Consultar ficha pelo codigo");
        System.out.println("3) Imprimir todas as fichas");
        System.out.println("4) Sair");
        menuPrincipal = Integer.parseInt(teclado.entDados("Escolha uma opcao:"));

        switch (menuPrincipal) {


//=========Cadastrar Ficha==========================================================================================

            case 1:
                int menu1;
                f1 = new Ficha();
                System.out.println("1 - Novo Cliente");
                System.out.println("2 - Cliente Cadastrado");
                menu1 = Integer.parseInt(teclado.entDados("Escolha uma opcao:"));
                switch (menu1) {

                    case 1:
                        cadastrarCliente(c1);
                        break;

//=========Consultar Ficha=========================================================================================
                    case 2:

                        cadastrarFicha(f1);
                        break;
                }


            case 2:
                int menu2;
                System.out.println("Consultar Ficha por:");
                System.out.println("Codigo da Ficha");
                System.out.println("Cliente");
                menu2 = Integer.parseInt(teclado.entDados("Escolha uma opcao:"));
                switch (menu2) {
                    //======Consultar Ficha por codigo======================================================
                    case 1:
                        f1.setCod(Integer.parseInt(teclado.entDados("Informe o Codigo:\t")));

                        //======Consultar Ficha por Cliente======================================================
                    case 2:
                        String consutarNome = teclado.entDados("Digite o Nome do Cliente:");
                }
        }
    }

//=========Cadastrar Ficha=========================================================================================
   public static void cadastrarFicha (Ficha f1){
        System.out.println("Cadastrar Ficha");
    }
//=========Consultar Ficha=========================================================================================
    public static void consultarFicha (Ficha f1){
        System.out.println("Consultar Ficha");
    }
//=========Editar Ficha=========================================================================================
    public static void editarFicha (Ficha f1){
        System.out.println("Editar Ficha");
    }



//=========Cadastrar Cliente=========================================================================================
    public static void cadastrarCliente (Cliente c1){
        System.out.println("Cadastrar Cliente");
    }
//=========Consultar Cliente=========================================================================================
    public static void consultarCliente (Cliente c1){
        System.out.println("Consultar Cliente");
    }
//=========Editar Cliente=========================================================================================
    public static void editarCliente (Cliente c1){
        System.out.println("Editar Cliente");
    }
}