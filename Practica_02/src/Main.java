import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("===== SISTEMA DE GESTION DE BANCOS =====");
        Scanner input = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.print("ingrese el nombre del titular de la cuenta: ");
        cuenta.setNombre(input.nextLine());
        System.out.print("ingrese el saldo inicial de la cuenta: ");
        cuenta.setSalini(input.nextDouble());
        System.out.print("ingrese el tipo de cuenta (Ahorros/Corriente): ");
        cuenta.setNombre(input.nextLine());

        System.out.println(" ");
        System.out.println("Opciones:");
        System.out.println("1. Depositar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Conultar saldo");
        System.out.println("4. Salir");
        System.out.println(" ");

        Scanner i = new Scanner(System.in);
        System.out.print("Seleccione una opcion: ");
        int opcion = i.nextInt();

        if (opcion == 1) {
            Scanner s = new Scanner(System.in);
            System.out.println("Ingrese el monto a depositar: ");
            cuenta.setMonto(s.nextDouble());
            System.out.println("Saldo actualizado: " + cuenta.Depo());
            System.out.println("Estado de la cuenta: " + cuenta.Estado());
            System.out.println("===================================");
        } else if (opcion == 2) {
            Scanner s = new Scanner(System.in);
            System.out.print("Ingrese el monto a retirar: ");
            cuenta.setMonto(s.nextDouble());
            System.out.println("Saldo actualizado: " + cuenta.Reti());
            System.out.println("Estado de la cuenta: " + cuenta.Estado());
            System.out.println("===================================");
        } else if (opcion == 3) {
            System.out.println("Saldo de cuenta: " + cuenta.getSalini());
            System.out.println("Estado de la cuenta: " + cuenta.EstadoIni());
            System.out.println("===================================");
        } else if (opcion == 4) {
            System.out.println("Que tenga un buen dia...");
        } else {
            System.out.println("Opcion invalida");
        }
    }
}