import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== REGISTRO DE VEHICULOS =====");

        Scanner input=new Scanner(System.in);
        Vehiculo auto= new Vehiculo();
        System.out.print("ingrese la marca del vehiculo: ");
        auto.setMarca(input.nextLine());
        System.out.print("ingrese el modelo del vehiculo: ");
        auto.setModelo(input.nextLine());
        System.out.print("ingrese el año de fabricacion: ");
        auto.setFabricacion(input.nextInt());
        System.out.print("ingrese la velocidad actual (km/h): ");
        auto.setVelocidad(input.nextInt());

        System.out.println(" ");
        System.out.println("Opciones:");
        System.out.println("1. Acelerar vehiculo");
        System.out.println("2. Frenar vehiculo");
        System.out.println("3. consultar la edad del vehiculo");
        System.out.println("4. Salir");
        System.out.println(" ");

        Scanner i = new Scanner(System.in);
        System.out.print("Seleccione una opcion: ");
        int opcion = i.nextInt();
        if (opcion == 1) {
            System.out.println("El vehiculo esta acelerando");
            System.out.println("===================================");
        } else if (opcion == 2) {
            System.out.print("El vehiculo esta frenando: ");
            System.out.println("===================================");
        } else if (opcion == 3) {
            System.out.println("El vehiculo tiene " + auto.EdadAuto()+" años de antiguedad");
            System.out.println("Estado del vehiculo: " + auto.Edad());
            System.out.println("===================================");
        } else if (opcion == 4) {
            System.out.println("Saliendo de la aplicacion...");
            System.out.println("Que tenga un buen dia...");
            System.out.println("===================================");
        } else {
            System.out.println("Opcion invalida");
            System.out.println("===================================");
        }
    }
}