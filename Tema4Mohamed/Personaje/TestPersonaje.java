package Tema4Mohamed.Personaje;

import java.util.Scanner;
public class TestPersonaje {

    public static int MaxNivel(){
        Scanner sc5 = new Scanner(System.in);
        boolean salir = true;
        int Resultado = 0;

        try {
            do {
                System.out.println("Selector Max Del Nivel se es quires como este (1,2,3,4,5,6)");
                System.out.println("1. Nivel uno");
                System.out.println("2. Nivel dos");
                System.out.println("3. Nivel tres");
                System.out.println("4. Nivel cuatro");
                System.out.println("5. Nivel cinco");
                System.out.println("6. Nivel seis");
                int s = Integer.parseInt(sc5.nextLine());
                switch (s){
                    case 1:
                        Resultado += 1;
                        salir = false;
                        break;
                    case 2:
                        Resultado += 2;
                        salir = false;
                        break;
                    case 3:
                        Resultado += 3;
                        salir = false;
                        break;
                    case 4:
                        Resultado += 4;
                        salir = false;
                        break;
                    case 5:
                        Resultado += 5;
                        salir = false;
                        break;
                    case 6:
                        Resultado += 6;
                        salir = false;
                        break;
                    default:
                        System.out.println("ERROR, Tu numero no es valido");
                        break;
                }
            }while (salir);
        }catch (NumberFormatException e){
            System.out.println("ERROR, Tu numero no es valido");
        }
        return Resultado;
    }

    public static int MaxDmage(){
        Scanner sc6 = new Scanner(System.in);
        boolean salir = true;
        int Damage = 0;

        try {
            do {
                System.out.println("Selector Max Del Damage se es quires como este (1,2,3,4,5,6)");
                System.out.println("1. 50 Damage");
                System.out.println("2. 60 Damage");
                System.out.println("3. 70 Damage");
                System.out.println("4. 80 Damage");
                System.out.println("5. 90 Damage");
                System.out.println("6. 100 Damage");
                int s = Integer.parseInt(sc6.nextLine());
                switch (s){
                    case 1:
                        Damage += 50;
                        salir = false;
                        break;
                    case 2:
                        Damage += 60;
                        salir = false;
                        break;
                    case 3:
                        Damage += 70;
                        salir = false;
                        break;
                    case 4:
                        Damage += 80;
                        salir = false;
                        break;
                    case 5:
                        Damage += 90;
                        salir = false;
                        break;
                    case 6:
                        Damage += 100;
                        salir = false;
                        break;
                    default:
                        System.out.println("ERROR, Tu numero no es valido");
                        break;
                }
            }while (salir);
        }catch (NumberFormatException e){
            System.out.println("ERROR, Tu numero no es valido");
        }
        return Damage;
    }

    public static int ComprarMana(){
        Scanner sc1 = new Scanner(System.in);
        boolean Salir = true;
        int Mana = 0;
        int s;
        try {
            do {
                System.out.println("Tu quires comprar Mana selector (1) es Si o (0) es No quires comprar Mana : ) ");
                s = Integer.parseInt(sc1.nextLine());
                switch(s) {
                    case 1:
                        System.out.println("Gracias por comprar Mana. Ahora tu tienes " + Personaje.MAX_SALUD + " Mana");
                        Mana = 200;
                        Salir = false;
                        break;
                    case 0:
                        System.out.println("No quires comprar Mana. Ahora tu tiene 0 Mana, Gracias");
                        Salir = false;
                        break;
                    default:
                        System.out.println("ERROR, Tu numero no es valido. porfa selector (1) es Si o (0) es No");
                        break;
                }
            }while (Salir);
        }catch (NumberFormatException e){
            System.out.println("ERROR, Tu numero no es valido");
        }
        return Mana;
    }

    public static String Clase(){
        Scanner sc3 = new Scanner(System.in);
        boolean salir = true;
        int s;
        String Resultado = "";
        try {
            do {
                System.out.println("porfa selector una clase:");
                System.out.println("1.Guerrero");
                System.out.println("2.Mago");
                System.out.println("3.Ladron");
                s = Integer.parseInt(sc3.nextLine());
                switch (s){
                    case 1:
                        Resultado = "Guerrero";
                        salir = false;
                        break;
                    case 2:
                        Resultado = "Mago";
                        salir = false;
                        break;
                    case 3:
                        Resultado = "Ladron";
                        salir = false;
                        break;
                    default:
                        System.out.println("ERROR, Tu numero no es valido");
                        break;
                }
            }while (salir);
        }catch (NumberFormatException e){
            System.out.println("ERROR, Tu numero no es valido");
        }
        return Resultado;
    }

    public static void ComprarNevil(Personaje pers1){
        Scanner sc4 = new Scanner(System.in);
        boolean salir = true;
        try {
            do {
                System.out.println("Personaje (" + pers1.getNombre() + ") Ahora quires comprar nivel :");
                System.out.println("1.Si");
                System.out.println("2.No");
                int s = Integer.parseInt(sc4.nextLine());
                switch (s){
                    case 1:
                        System.out.println("Gracias por Comprar nivel");
                        pers1.subirNivel();
                        pers1.bajaMana();
                        salir = false;
                        break;
                    case 2:
                        System.out.println("No quires comprar nivel, Vale Gracias");
                        pers1.bajaMana();
                        salir = false;
                        break;
                    default:
                        System.out.println("ERROR, Tu numero no es valido");
                        break;
                }
            }while (salir);
        }catch (NumberFormatException e){
            System.out.println("ERROR, Tu numero no es valido");
        }
    }


    static void main(String[] args) {

        String nombre,clase,nombre1,clase1;
        int mana, damage, nivel,mana1,damage1,nivel1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del personaje Uno");
        nombre = sc.nextLine();


        damage = MaxDmage();

        nivel = MaxNivel();

        clase = Clase();

        mana = ComprarMana();

        sc.nextLine();

        Personaje pers1 = new Personaje(nombre,clase,mana,damage,nivel);

        System.out.println("------------------------");
        System.out.println("Ingrese el nombre del personaje Dos");
        nombre1 = sc.nextLine();

        damage1 = MaxDmage();

        nivel1 = MaxNivel();

        clase1 = Clase();

        mana1 = ComprarMana();


        Personaje pers2 = new Personaje(nombre1,clase1,mana1,damage1,nivel1);

        System.out.println("------------------------");
        System.out.println("Informacion Personaje Uno : ");
        System.out.println("------------------------");
        System.out.println(pers1);

        System.out.println("------------------------");
        System.out.println("Informacion Personaje Dos : ");
        System.out.println("------------------------");
        System.out.println(pers2);
        System.out.println("------------------------");

        pers1.ataque(pers2);
        pers2.ataque(pers1);

        System.out.println("------------------------");
        System.out.println("Comprobar si la persona sigue viva.: ");
        System.out.println("------------------------");
        if (pers1.getSalud() != 0 && pers2.getSalud() != 0) {
            System.out.println("dibujar : " + pers1.getSalud() + " y " + pers2.getSalud());
        }else if (pers2.getSalud() != 0) {
            System.out.println("El personaje (" + pers1.getNombre() + ") Él todavía está vivo ): tiene salud : " + pers2.getSalud());
        }else if (pers1.getSalud() != 0) {
            System.out.println("El personaje (" + pers1.getNombre() + ") Él todavía está vivo ): tiene salud : " + pers1.getSalud());
        }

        boolean fuera = true;
        while (fuera){
            if (pers1.getSalud() != 0 && pers2.getSalud() != 0) {
                System.out.println("------------------------");
                System.out.println("Ah!! Problema del dibujar ");
                System.out.println("------------------------");
                ComprarNevil(pers1);
                ComprarNevil(pers2);

                System.out.println("-----------------------");
                System.out.println(pers1.getNombre() + " ahora Volver a ataque : ");
                System.out.println("-----------------------");
                pers1.ataque(pers2);
                //System.out.println(pers1);
                System.out.println("------------------------");
                System.out.println(pers2.getNombre() + " ahora volver a ataque : ");
                System.out.println("------------------------");
                pers2.ataque(pers1);
                //System.out.println(pers2);
                System.out.println("------------------------");
            }else {
                fuera = false;
            }
        }



        //pers1.revivir();
        //pers2.revivir();

        System.out.println("------------------------");
        System.out.println("Rsultado ataque Personaje Uno: ");
        System.out.println("------------------------");
        System.out.println(pers1);
        System.out.println("------------------------");
        System.out.println("Resultado ataque Personaje Dos: ");
        System.out.println("------------------------");
        System.out.println(pers2);
        System.out.println("------------------------");

        System.out.println("------- Resultado Final --------");

        if (pers1.getSalud()  > pers2.getSalud() ) {
            System.out.println("El personaje (" + pers1.getNombre() + ") Él ganó");
        }else if (pers2.getSalud() > pers1.getSalud()) {
            System.out.println("El personaje (" + pers2.getNombre() + ") Él ganó");
        }





    }
}
