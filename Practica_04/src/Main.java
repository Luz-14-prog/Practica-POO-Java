import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== CONTROL DE ASISTENCIA =====");
        Scanner input=new Scanner(System.in);
        Asistencia estudiante = new Asistencia();
        System.out.print("ingrese el nombre del estudiante: ");
        estudiante.setNombre(input.nextLine());
        System.out.print("ingrese la cantidad de dias asistidos: ");
        estudiante.setDiasasistidos(input.nextDouble());

        System.out.println(" ");

        System.out.println("Calculando porcentaje de asistencia... ");

        System.out.println(" ");

        System.out.println("El porcentaje de asistencia es de: " + estudiante.Porcentaje()+"%");
        System.out.println("Estado del estudiante: "+estudiante.Estado());
    }
}