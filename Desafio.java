import java.util.Scanner;

public class Desafio {
    public static void main(String[]args){
        //Variables
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;
        // Imprimir los datos
        System.out.println("***********************************");
        System.out.println("\n Nombre del Cliente: " + nombre);
        System.out.println("\n El tipo de Cuenta es: " + tipoDeCuenta);
        System.out.println("\n El saldo disponible de la cuenta es: " + saldo + " $");
        System.out.println("************************************");

        String menu = """
            *** Escriba el numero de la opción que desea realizar ***
            1. Consultar saldo
            2. Retirar
            3. Depositar
            9. Salir
            """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

        }

    }
}

