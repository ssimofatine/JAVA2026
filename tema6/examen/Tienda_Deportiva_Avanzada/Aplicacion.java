package tema6.examen.Tienda_Deportiva_Avanzada;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        Equipamiento e1 = new Equipamiento("E01", "Balon", 15.5, 10, "Futbol", "Adidas");
        RopaDeportiva r1 = new RopaDeportiva("R01", "Camiseta", 25.0, 5, "L", "Algodon");

        tienda.anadirProducto(e1);
        tienda.anadirProducto(r1);

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n1. Mostrar inventario");
            System.out.println("2. Agregar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Actualizar producto");
            System.out.println("5. Realizar compra");
            System.out.println("6. Mostrar historial de compras");
            System.out.println("7. Salir");

            try {
                int opcion = Integer.parseInt(sc.nextLine());

                if (opcion == 1) {
                    tienda.mostrarInventario();
                } else if (opcion == 2) {
                    System.out.println("1. Equipamiento 2. Ropa Deportiva");
                    int tipo = Integer.parseInt(sc.nextLine());
                    System.out.println("Codigo:");
                    String cod = sc.nextLine();
                    System.out.println("Nombre:");
                    String nom = sc.nextLine();
                    System.out.println("Precio:");
                    double pre = Double.parseDouble(sc.nextLine());
                    System.out.println("Stock:");
                    int stk = Integer.parseInt(sc.nextLine());

                    if (tipo == 1) {
                        System.out.println("Deporte:");
                        String dep = sc.nextLine();
                        System.out.println("Marca:");
                        String mar = sc.nextLine();
                        Equipamiento eq = new Equipamiento(cod, nom, pre, stk, dep, mar);
                        tienda.anadirProducto(eq);
                    } else if (tipo == 2) {
                        System.out.println("Talla:");
                        String tal = sc.nextLine();
                        System.out.println("Material:");
                        String mat = sc.nextLine();
                        RopaDeportiva ro = new RopaDeportiva(cod, nom, pre, stk, tal, mat);
                        tienda.anadirProducto(ro);
                    }
                } else if (opcion == 3) {
                    System.out.println("Codigo a eliminar:");
                    String codEliminar = sc.nextLine();
                    tienda.eliminarProducto(codEliminar);
                } else if (opcion == 4) {
                    System.out.println("Codigo a actualizar:");
                    String codAct = sc.nextLine();
                    System.out.println("Nuevo Precio:");
                    double preAct = Double.parseDouble(sc.nextLine());
                    System.out.println("Nuevo Stock:");
                    int stkAct = Integer.parseInt(sc.nextLine());
                    tienda.actualizarProducto(codAct, preAct, stkAct);
                } else if (opcion == 5) {
                    System.out.println("Codigo a comprar:");
                    String codComp = sc.nextLine();
                    System.out.println("Cantidad:");
                    int cant = Integer.parseInt(sc.nextLine());

                    tienda.realizarCompra(codComp, cant);
                    System.out.println("Compra realizada con exito.");

                } else if (opcion == 6) {
                    tienda.mostrarHistorialCompras();
                } else if (opcion == 7) {
                    salir = true;
                } else {
                    System.out.println("Opcion no valida");
                }
            } catch (StockInsuficienteException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Error de entrada. Intente de nuevo.");
            }
        }
    }
}
