import java.util.ArrayList;
import java.util.List;

public class Teste {

    private static Teclado teclado = new Teclado();

    private static Ficha f1;

    private static List<Ficha> bdf1 = new ArrayList<Ficha>();

    private static int menu;


//====================================================================================

    public static void main(String[] args){

        int menuPrincipal = menu;

        System.out.println("1) Cadastrar ficha");
        System.out.println("2) Consultar ficha pelo codigo");
        System.out.println("3) Imprimir todas as fichas");
        System.out.println("4) Editar ficha pelo codigo");
        System.out.println("5) Remover ficha pelo codigo");
        System.out.println("6) Sair");
        menuPrincipal = Integer.parseInt(teclado.entDados("Escolha uma opcao:"));

        switch (menuPrincipal){

            case 1:
                f1 = new Ficha();
                System.out.println("1 - Novo Cliente");
                System.out.println("2 - Cliente Cadastrado");
                menu =Integer.parseInt(teclado.entDados("Escolha uma opcao:"));
                switch (menu){

                    case 1:
                        System.out.println("cadastrar Cliente");
                        //cadastrarCliente(f1);
                        break;

                    case 2:
                        System.out.println("cadastrar ficha");
                        //cadastrarFicha(f1);
                        break;
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
