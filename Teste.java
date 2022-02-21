import java.util.ArrayList;
import java.util.List;

public class Teste {

    private static Teclado teclado = new Teclado();

    private static Ficha f1;

    private static List<Ficha> bdf1 = new ArrayList<Ficha>();

    private static List<Cliente> bdc1 = new ArrayList<Cliente>();
    
    private static int menu;


//====================================================================================

    public static void main(String[] args){

        int menuPrincipal;


        System.out.println("1) Cadastrar ficha");
        System.out.println("2) Consultar ficha pelo codigo");
        System.out.println("3) Imprimir todas as fichas");
        System.out.println("4) Sair");
        menuPrincipal = Integer.parseInt(teclado.entDados("Escolha uma opcao:"));

        switch (menuPrincipal){
            int  menu1;

//=========Cadastrar Ficha==========================================================================================

            case 1:
                f1 = new Ficha();
                System.out.println("1 - Novo Cliente");
                System.out.println("2 - Cliente Cadastrado");
                menu1 = Integer.parseInt(teclado.entDados("Escolha uma opcao:"));
                switch (menu1){

                    case 1:
                        System.out.println("cadastrar Cliente");
                        //cadastrarCliente(f1);
                        break;

                    case 2:
                        System.out.println("cadastrar ficha");
                        //cadastrarFicha(f1);
                        break;
                }
//=========Consultar Ficha==========================================================================================
            case 2:
                int menu2;
                System.out.println("Consultar Ficha por:");
                System.out.println("Codigo da Ficha");
                System.out.println("Cliente");
                menu2 =Integer.parseInt(teclado.entDados("Escolha uma opcao:"));
                switch (menu2){
                    case 1:
                        f1.setCod(Integer.parseInt(teclado.entDados("Informe o Codigo:\t")));

                    case 2:
                        String consutarNome = teclado.entDados("Digite o Nome do Cliente:");



                }
        }
    }

}


 /*   public static Ficha cadastrarFicha (Ficha f1){
        System.out.println("cadastrar ficha");
    }
    public static Ficha cadastrarCliente (Ficha f1){
        System.out.println("cadastrar Cliente");
    }
*/
