package tema5.Practica_Objetos_II;

import java.util.Scanner;

public class testJuego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Granja granja = new Granja("Granja Sur", "Andalucia");

        TractorAutonomo t1 = new TractorAutonomo(1, "John Deere", 150.5f, 15.0f);
        DronRiego d1 = new DronRiego(2, "DJI Agras", 30, 2000.0f);

        granja.addMaquina(t1);
        granja.addMaquina(d1);

        boolean salir = false;

        while (!salir) {
            System.out.println("\n1. Imprimir datos de la granja");
            System.out.println("2. Añadir una maquina");
            System.out.println("3. Añadir horas de operacion maquina");
            System.out.println("4. Calcular el total de horas de operacion");
            System.out.println("5. Listar todas las maquinas");
            System.out.println("6. Salir");

            int opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 1) {
                granja.imprimirDatosGranja();
            } else if (opcion == 2) {
                System.out.println("Elige: 1.Tractor 2.Dron 3.Cosechadora");
                int tipo = Integer.parseInt(sc.nextLine());
                System.out.println("Id:");
                int id = Integer.parseInt(sc.nextLine());
                System.out.println("Modelo:");
                String modelo = sc.nextLine();

                if (tipo == 1) {
                    granja.addMaquina(new TractorAutonomo(id, modelo, 100f, 10f));
                } else if (tipo == 2) {
                    granja.addMaquina(new DronRiego(id, modelo, 20, 1000f));
                } else if (tipo == 3) {
                    granja.addMaquina(new CosechadoraAutonoma(id, modelo, 5f, 20f));
                }
                System.out.println("Maquina anadida.");
            } else if (opcion == 3) {
                System.out.println("Id de maquina:");
                int idB = Integer.parseInt(sc.nextLine());
                System.out.println("Horas:");
                float horas = Float.parseFloat(sc.nextLine());

                Maquina m = granja.buscarMaquinaPorId(idB);
                if (m != null) {
                    m.encender();
                    m.trabajar(horas);
                    m.apagar();
                    System.out.println("Horas anadidas.");
                } else {
                    System.out.println("No existe la maquina.");
                }
            } else if (opcion == 4) {
                granja.calcularTotalHoras();
                System.out.println("Total horas actualizado.");
            } else if (opcion == 5) {
                System.out.println(granja.toString());
                for (int i = 0; i < granja.getMaquinas().size(); i++) {
                    System.out.println(granja.getMaquinas().get(i).toString());
                }
            } else if (opcion == 6) {
                salir = true;
            }
        }
    }
}
