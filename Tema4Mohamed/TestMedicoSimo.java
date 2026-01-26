package Tema4Mohamed;

import java.util.Scanner;
import java.util.ArrayList;

public class TestMedicoSimo {

    // selector Especialidad
    public static Especialidad Especialidad1(){
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        Especialidad Resultado = null;
        do {
            System.out.println("porfa selection una especialidad:");
            System.out.println("1.GENERAL");
            System.out.println("2.DIGESTIVO");
            System.out.println("3.OTORRINO");
            System.out.println("4.CARDIOLOGIA");
            System.out.println("5.NEUROLOGIA");
            System.out.println("6.TRAUMATOLOGIA");

            int s = Integer.parseInt(sc.nextLine());

            if (s >= 1 && s <= 6) {
                salir = false;
            }
            switch (s){
                case 1:
                    Resultado = Especialidad.GENERAL;
                    break;
                case 2:
                    Resultado = Especialidad.DIGESTIVO;
                    break;
                case 3:
                    Resultado =Especialidad.OTORRINO;
                    break;
                case 4:
                    Resultado = Especialidad.CARDIOLOGIA;
                    break;
                case 5:
                    Resultado = Especialidad.NEUROLOGIA;
                    break;
                case 6:
                    Resultado = Especialidad.TRAUMATOLOGIA;
                    break;
                default:
                    System.out.println("ERROR, Tu numero no es valido");
                    break;
            }
        }while (salir);
        return Resultado;
    }

    // Selector Estado
    public static Estado Estado1(){
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        Estado Resultado = null;
        do {
            System.out.println("porfa selection una especialidad:");
            System.out.println("1.ACTIVO");
            System.out.println("2.INACTIVO");

            int s = Integer.parseInt(sc.nextLine());

            if (s >= 1 && s <= 2) {
                salir = false;
            }
            switch (s){
                case 1:
                    Resultado = Estado.ACTIVO;
                    break;
                case 2:
                    Resultado = Estado.INACTIVO;
                    break;
                default:
                    System.out.println("ERROR, Tu numero no es valido");
                    break;
            }
        }while (salir);
        return Resultado;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad,edad1,NumEstado;

        String nombre,email,tele,nombre1,email1,tele1;

        System.out.println("----------------------------------------------");
        System.out.println("Porfa Dami information del medico (Por Ejemplo : Medico Uno):");
        System.out.println("----------------------------------------------");

        System.out.println("Ingrese el nombre del medico:");
        nombre = sc.nextLine();

        System.out.println("Ingrese el email:");
        email = sc.nextLine();

        System.out.println("Ingrese el telefono:");
        tele = sc.nextLine();

        System.out.println("Ingrese la edad:");
        edad = sc.nextInt();

        System.out.println("Este medico esta Inactivo? (por ejemplo : escribe (1) por Inactivo o escribe (0) por No hacer nada)");
        NumEstado = sc.nextInt();


        // limpia memoria del teclado in computadora.
        sc.nextLine();

        Especialidad especialidadTeclado = Especialidad1();

        MedicoSimo med1 = new MedicoSimo(nombre,especialidadTeclado,edad,email,tele);
        med1.baja(NumEstado);

        System.out.println("----------------------------------------------");
        System.out.println("Porfa Dami information del medico (Por Ejemplo : Medico Dos):");
        System.out.println("----------------------------------------------");

        System.out.println("Ingrese el nombre del medico:");
        nombre1 = sc.nextLine();

        System.out.println("Ingrese el email:");
        email1 = sc.nextLine();

        System.out.println("Ingrese el telefono:");
        tele1 = sc.nextLine();

        System.out.println("Ingrese la edad:");
        edad1 = sc.nextInt();

        Especialidad especialidadTeclado1 = Especialidad1();

        MedicoSimo med2 = new MedicoSimo(nombre1,especialidadTeclado1,edad1,email1,tele1);

        ArrayList<MedicoSimo> Lista = new ArrayList<>();
        Lista.add(med1);
        Lista.add(med2);

        System.out.println("----------------------------------------------");
        System.out.println("Estado Medico es : " + med1.getEstado());
        System.out.println("----------------------------------------------");
        System.out.println("Ahora quires volver Estado Medico Uno a ACTIVO? (por ejemplo : escribe (1) por SI o escribe (0) por NO");
        NumEstado = sc.nextInt();
        med1.alta(NumEstado);
        System.out.println("----------------------------------------------");
        System.out.println("Estado Medico es : " + med1.getEstado());
        System.out.println("----------------------------------------------");



        //int SumaNumeroMedico = 0;
        int NumeroMedicos = 1;

        for (int i = 0; i <Lista.size() ; i++) {

            System.out.println("--------------------------------");
            System.out.println("Informaciones del medico " +" (" + NumeroMedicos + ")" + ":");
            System.out.println("--------------------------------");
            System.out.println(Lista.get(i));
            NumeroMedicos++;
            System.out.println(" ");
        }





    }
}
