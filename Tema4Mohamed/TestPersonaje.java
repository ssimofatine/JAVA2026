package Tema4Mohamed;
import java.util.Scanner;
public class TestPersonaje {
    static void main(String[] args) {

        String nombre,clase,nombre1,clase1;
        int mana, damage, nivel,mana1,damage1,nivel1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del personaje Uno");
        nombre = sc.nextLine();

        System.out.println("Ingrese la clase del personaje Uno");
        clase = sc.nextLine();


        System.out.println("Ingrese el mana del personaje Uno");
        mana = sc.nextInt();

        System.out.println("Ingrese el damage del personaje Uno");
        damage = sc.nextInt();

        System.out.println("Ingrese el nivel del personaje Uno");
        nivel = sc.nextInt();

        sc.nextLine();

        Personaje pers1 = new Personaje(nombre,clase,mana,damage,nivel);

        System.out.println("Ingrese el nombre del personaje Dos");
        nombre1 = sc.nextLine();

        System.out.println("Ingrese la clase del personaje Dos");
        clase1 = sc.nextLine();

        System.out.println("Ingrese la nivel del personaje Dos");
        nivel1 = sc.nextInt();

        System.out.println("Ingrese el mana del personaje Dos");
        mana1 = sc.nextInt();

        System.out.println("Ingrese el damage del personaje Dos");
        damage1 = sc.nextInt();


        Personaje pers2 = new Personaje(nombre1,clase1,mana1,damage1,nivel1);





    }
}
