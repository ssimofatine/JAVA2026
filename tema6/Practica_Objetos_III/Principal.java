package tema6.Practica_Objetos_III;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Agencia agencia = new Agencia();

        for (int i = 1; i <= 10; i++) {
            agencia.addCoche(new CocheEstandar("Seat", "Ibiza", "00" + i + "AA", 2020, TipoCombustible.GASOLINA, TipoCoche.SEDAN, 30.0, true));
        }
        for (int i = 11; i <= 20; i++) {
            agencia.addCoche(new CochePremium("Audi", "Q7", "11" + i + "BB", 2023, TipoCombustible.DIESEL, TipoCoche.DEPORTIVO, 80.0, true, true));
        }

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