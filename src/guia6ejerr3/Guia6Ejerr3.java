/*
 Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer
dos números en forma de cadena. A continuación, utilice el método parseInt() de la clase
Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por
ultimo realizar una división con los dos números y mostrar el resultado.
 */
package guia6ejerr3;

import java.util.Scanner;


public class Guia6Ejerr3 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        String numero1Str = scanner.nextLine();
        int numero1 = Integer.parseInt(numero1Str);

        System.out.print("Ingrese el segundo número: ");
        String numero2Str = scanner.nextLine();
        int numero2 = Integer.parseInt(numero2Str);

        // Realizar la división
        double resultado = (double) numero1 / numero2;

        System.out.println("El resultado de la división es: " + resultado);

        scanner.close();
    }
}
