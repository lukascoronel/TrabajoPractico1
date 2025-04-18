import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu = -1;

        System.out.println("Bienvenido al Centro de Emergencias");

        while (true) {
            System.out.println("\nMenu de opciones: ");
            System.out.println("1. Ingresar Paciente");
            System.out.println("2. Dar de Alta Medico");
            System.out.println("3. Asignar Medico a Paciente");
            System.out.println("4. Atender Paciente");
            System.out.println("5. Reporte");
            System.out.println("6. Salir");

            System.out.print("Ingrese una Opcion (1-6): ");
            String entrada = sc.nextLine();

            try {
                menu = Integer.parseInt(entrada);
                if (menu >= 1 && menu <= 6) {
                    break;
                } else {
                    System.out.println("Por favor, ingrese un número del 1 al 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese solo números.");
            }
        }
        switch (menu) {
            case 1:
                System.out.println("Elegiste el menu 1");
                ActionMenu.ingresopaciente();
                return;
            case 2:
                System.out.println("Elegiste el menu 2");
                ActionMenu.altamedico();
                return;
            case 3:
                System.out.println("Elegiste el menu 3");
                ActionMenu.asignarmedico();
                return;
            case 4:
                System.out.println("Elegiste el menu 4");
                ActionMenu.atenderpaciente();
                return;
            case 5:
                System.out.println("Elegiste el menu 5");
                ActionMenu.reporte();
                return;
            case 6:
                System.out.println("Finalizado, hasta pronto");
                break;
        }
    }
}
