package ActividadEvaluativa;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Integer numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else System.out.println("Es impar");
    }
}
