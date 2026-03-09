package tema6.Practica_Objetos_III;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Agencia agencia = new Agencia();

        CocheEstandar cocheEs1 = new CocheEstandar("Seat", "model1", "00"  + "AA", 2020, TipoCombustible.GASOLINA, TipoCoche.SEDAN, 30.0, true);
        agencia.addCoche(cocheEs1);

        CocheEstandar cocheEs2 = new CocheEstandar("BMW", "model1", "00"  + "AA", 2020, TipoCombustible.GASOLINA, TipoCoche.SEDAN, 30.0, true);
        agencia.addCoche(cocheEs2);

        CocheEstandar cocheEs3 = new CocheEstandar("Golf", "model1", "00"  + "AA", 2020, TipoCombustible.GASOLINA, TipoCoche.SEDAN, 30.0, true);
        agencia.addCoche(cocheEs3);

        CocheEstandar cocheEs4 = new CocheEstandar("Honday", "model1", "00" + "AA", 2020, TipoCombustible.GASOLINA, TipoCoche.SEDAN, 30.0, true);
        agencia.addCoche(cocheEs4);

        CocheEstandar cocheEs5 = new CocheEstandar("Ferari", "Ibiza", "00"  + "AA", 2020, TipoCombustible.GASOLINA, TipoCoche.SEDAN, 30.0, true);
        agencia.addCoche(cocheEs5);


        CochePremium cochePr1 = new CochePremium("Ferari", "model1", "33"  + "AA", 2020, TipoCombustible.DIESEL, TipoCoche.DEPORTIVO, 30.0, true, true);
        agencia.addCoche(cochePr1);

        CochePremium cochePr2 = new CochePremium("Ferari", "model1", "33"  + "AA", 2020, TipoCombustible.DIESEL, TipoCoche.DEPORTIVO, 30.0, true, true);
        agencia.addCoche(cochePr2);

        CochePremium cochePr3 = new CochePremium("Ferari", "model1", "33"  + "AA", 2020, TipoCombustible.DIESEL, TipoCoche.DEPORTIVO, 30.0, true, true);
        agencia.addCoche(cochePr3);

        CochePremium cochePr4 = new CochePremium("Ferari", "model1", "33"  + "AA", 2020, TipoCombustible.DIESEL, TipoCoche.DEPORTIVO, 30.0, true, true);
        agencia.addCoche(cochePr4);

        CochePremium cochePr5 = new CochePremium("Ferari", "model1", "33"  + "AA", 2020, TipoCombustible.DIESEL, TipoCoche.DEPORTIVO, 30.0, true, true);
        agencia.addCoche(cochePr5);

        Scanner sc = new Scanner(System.in);
        boolean salir = true;


        do {
            System.out.println("1. Listar Coches disponibles");
            System.out.println("2. Realizar alquiler");
            System.out.println("3. Salir");

            try {
                int opcion = Integer.parseInt(sc.nextLine());

                if (opcion == 1) {
                    agencia.listarCochesDisponibles();
                } else if (opcion == 2) {
                    System.out.println("Nombre:");
                    String nom = sc.nextLine();
                    System.out.println("Apellidos:");
                    String ape = sc.nextLine();
                    System.out.println("DNI:");
                    String dni = sc.nextLine();
                    System.out.println("Email:");
                    String email = sc.nextLine();
                    System.out.println("Direccion:");
                    String dir = sc.nextLine();
                    System.out.println("Telefono:");
                    String tel = sc.nextLine();
                    System.out.println("Licencia:");
                    String lic = sc.nextLine();

                    Cliente cli = new Cliente(nom, ape, dni, email, dir, tel, lic, LocalDate.now());

                    System.out.println("Tipo (1.SEDAN 2.SUV 3.FURGONETA 4.DEPORTIVO):");
                    int tipoNum = Integer.parseInt(sc.nextLine());
                    TipoCoche tipo = TipoCoche.SEDAN;
                    if (tipoNum == 2) tipo = TipoCoche.SUV;
                    if (tipoNum == 3) tipo = TipoCoche.FURGONETA;
                    if (tipoNum == 4) tipo = TipoCoche.DEPORTIVO;

                    System.out.println("Dias de alquiler:");
                    int dias = Integer.parseInt(sc.nextLine());

                    LocalDate inicio = LocalDate.now();
                    LocalDate fin = inicio.plusDays(dias);

                    boolean exito = agencia.realizarAlquiler(cli, tipo, inicio, fin);
                    if (exito) {
                        System.out.println("Alquiler realizado.");
                    }
                } else if (opcion == 3) {
                    salir = false;
                } else {
                    System.out.println("Opcion incorrecta");
                }
            } catch (Exception e) {
                System.out.println("Error introduciendo datos.");
            }
        }while (salir);
    }
}