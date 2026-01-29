package Tema4Mohamed.Cballo;

import java.util.ArrayList;

public class ProbarCaballoSimo {
    static void main(String[] args) {


        CaballoSimo c = new CaballoSimo("Manolo", "Nigro", 2);
        CaballoSimo c1 = new CaballoSimo("Margareta", "Marron", 5);

        ArrayList<CaballoSimo> lista = new ArrayList<>();

        lista.add(c);
        lista.add(c1);

        for (int i = 0; i < lista.size(); i++) {
            CaballoSimo a = lista.get(i);
            for (int j = 0; j < 5; j++) {
                a.correr();

            }
        }

        for (int i = 0; i < lista.size() ; i++) {
            CaballoSimo a = lista.get(i);
            a.pintarCaballo();
        }
    }

}
