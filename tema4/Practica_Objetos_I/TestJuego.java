package tema4.Practica_Objetos_I;

import java.util.Scanner;

public class TestJuego {


    public static clase Arma1(){
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        clase Resultado = null;
        try {
            do {
                //MAGO, BRUJO, BARBARO, CABALLERO
                System.out.println("porfa selection una Jugador:");
                System.out.println("1.MAGO");
                System.out.println("2.BRUJO");
                System.out.println("3.BARBARO");
                System.out.println("4.CABALLERO");;

                int s = Integer.parseInt(sc.nextLine());

                if (s >= 1 && s <= 4) {
                    salir = false;
                }
                switch (s){
                    case 1:
                        Resultado = clase.MAGO;
                        break;
                    case 2:
                        Resultado = clase.BRUJO;
                        break;
                    case 3:
                        Resultado = clase.BARBARO;
                        break;
                    case 4:
                        Resultado = clase.CABALLERO;;
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

    public static Tipo Tipo1(){
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        Tipo Resultado = null;
        try {
            do {
                //ESPADA, HACHA, BASTON, ARCO
                System.out.println("porfa selection Tipo de Arma:");
                System.out.println("1.ESPADA");
                System.out.println("2.HACHA");
                System.out.println("3.BASTON");
                System.out.println("4.ARCO");;

                int s = Integer.parseInt(sc.nextLine());

                if (s >= 1 && s <= 4) {
                    salir = false;
                }
                switch (s){
                    case 1:
                        Resultado = Tipo.ESPADA;
                        break;
                    case 2:
                        Resultado = Tipo.HACHA;
                        break;
                    case 3:
                        Resultado = Tipo.BASTON;
                        break;
                    case 4:
                        Resultado = Tipo.ARCO;;
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


    public static clase1 Arma2(){
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        clase1 Resultado = null;
        try {
            do {
                //GOBLIN, TROLL, SKRALL, DEMONIO, FANTASMA
                System.out.println("porfa selection un Monstruo:");
                System.out.println("1.GOBLIN");
                System.out.println("2.TROLL");
                System.out.println("3.SKRALL");
                System.out.println("4.DEMONIO");
                System.out.println("5.FANTASMA");

                int s = Integer.parseInt(sc.nextLine());

                if (s >= 1 && s <= 5) {
                    salir = false;
                }
                switch (s){
                    case 1:
                        Resultado = clase1.GOBLIN;
                        break;
                    case 2:
                        Resultado = clase1.TROLL;
                        break;
                    case 3:
                        Resultado = clase1.SKRALL;
                        break;
                    case 4:
                        Resultado = clase1.DEMONIO;
                        break;
                    case 5:
                        Resultado = clase1.FANTASMA;
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

    // Arma para dos Manos
    public static boolean DosManos(){
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        boolean Resultado = true;

        try {
            do {
                System.out.println("porfa selection numero desde (1 o 2) :");
                System.out.println("1. Este Arma Para Dos Manos Libres ");
                System.out.println("2. Este Arma Para Dos Manos Ocupados ");

                int s = Integer.parseInt(sc.nextLine());

                switch (s){
                    case 1:
                        System.out.println("Este Arma Para Dos Manos Libres");
                        salir = false;
                        break;
                    case 2:
                        System.out.println("Este Arma Para Dos Manos Ocupados");
                        Resultado = false;
                        salir = false;
                        break;
                    default:
                        System.out.println("ERROR Este Numero No Valida.");
                        break;
                }
            }while (salir);
        }catch (NumberFormatException e){
            System.out.println("ERROR Este Numero No Valida.");

        }
        return Resultado;
    }


    static void main(String[] args) {

        // Crear un jugador
        clase armaClase = Arma1();
        Jugador jugador = new Jugador("Mohamed",armaClase,2,0,200,null,null);

        // Crear armas

        Tipo armaTipo = Tipo1();
        //boolean dosManos = DosManos();
        boolean dosManos = DosManos();
        Arma espada = new Arma("Espada de acero", armaTipo, 25, dosManos);
        Arma hacha = new Arma("Hacha doble", armaTipo, 40, dosManos);

        // Equipar armas
        jugador.equipar(espada);
        jugador.equipar(hacha);

        // Crear monstruos
        clase1 monstruoClase = Arma2();
        Monstruo goblin = new Monstruo("Goblin", monstruoClase, 10,100.0,10);
        Monstruo troll = new Monstruo("Troll", monstruoClase, 20,200.0,20);
        Monstruo skrall = new Monstruo("Skrall", monstruoClase, 30,100.0,30);
        Monstruo demonio = new Monstruo("Demonio", monstruoClase, 40,100.0,40);

        // Simular combate
        jugador.golpear(goblin);
        jugador.golpear(troll);
        jugador.golpear(skrall);
        jugador.golpear(demonio);

        // Mostrar resultados
        System.out.println(jugador);
        System.out.println(goblin);
        System.out.println(troll);
        System.out.println(skrall);
        System.out.println(demonio);

        // Crear un mago
        Mago mago = new Mago("Merlin", 100);

        // Crear hechizos
        Hechizo bolaDeFuego = new Hechizo("Bola de fuego", 20, 7, Hechizo.Tipo.FUEGO);
        Hechizo escudoMagico = new Hechizo("Escudo mágico", 15, 5, Hechizo.Tipo.AIRE);
        Hechizo rayoElectrico = new Hechizo("Rayo eléctrico", 25, 9, Hechizo.Tipo.ELECTRICIDAD);

        // Aprender hechizos
        mago.aprenderHechizo(bolaDeFuego);
        mago.aprenderHechizo(escudoMagico);
        mago.aprenderHechizo(rayoElectrico);

        // Crear pruebas
        Prueba romperMuro = new Prueba("Romper muro", 5, 10);
        Prueba derrotarOrco = new Prueba("Derrotar orco", 8, 15);
        Prueba derrotarElfoOscuro = new Prueba("Derrotar elfo oscuro", 10, 20);

        // Resolver pruebas
        mago.lanzarHechizo("Bola de fuego", romperMuro);
        mago.lanzarHechizo("Escudo mágico", derrotarOrco);
        mago.lanzarHechizo("Rayo eléctrico", derrotarElfoOscuro);

        // Mostrar resultados
        System.out.println(mago);
    }
}
