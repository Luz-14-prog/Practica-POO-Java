import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("===== GESTION DE EMPLEADOS =====");

        Scanner input=new Scanner(System.in);
        Empleado salario= new Empleado();
        System.out.print("ingrese el nombre del empleado: ");
        salario.setNombre(input.nextLine());
        System.out.print("ingrese las horas trabajadas: ");
        salario.setHt(input.nextInt());
        System.out.print("ingrese las horas extras trabajadas: ");
        salario.setHet(input.nextInt());
        System.out.print("ingrese el pago por hora:");
        salario.setPph(input.nextDouble());

        System.out.println(" ");

        System.out.println("Calculando salario... ");

        System.out.println(" ");

        System.out.println("El salario total de "+salario.getNombre()+" es de: "+salario.pagoTotal());
        System.out.println("La categoria salarial es: "+salario.categoriaSalarial());
    }
}