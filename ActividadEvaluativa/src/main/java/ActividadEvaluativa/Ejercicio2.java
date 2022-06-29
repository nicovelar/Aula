package ActividadEvaluativa;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        double millas;
        double kilometros;
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero de millas");
        millas = sc.nextInt();

       while (millas != 0) {
        kilometros = millas * 1.6093;
        System.out.println(df.format(kilometros));
        System.out.println("Ingrese numero de millas");
        millas = sc.nextInt();
       }
    }

}
