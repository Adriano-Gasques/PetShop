package Janelas;

import Classes.Animal;
import Classes.Cliente;
import Classes.Ficha;
import Classes.Teclado;
import view.Principal;

import java.util.ArrayList;
import java.util.List;

public class TesteJanela {

    public static class Teste {

        private static final Teclado teclado = new Teclado();

        private static Ficha f1;

        private static Cliente c1;

        private static Animal a1;

        private static final List<Ficha> bdf1 = new ArrayList<>();

        private static final List<Cliente> bdc1 = new ArrayList<>();

        private static final List<Animal> bda1 = new ArrayList<>();

        static int cod = 0;

        private static final view.Principal jn1 = new Principal();

//====================================================================================

        public static void main(String[] args) {
            jn1.main();

        }


    }
}


