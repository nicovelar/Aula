package ActividadEvaluativa;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        //Declaración de variables
        double sueldoTotal;
        Integer sueldoBasico;
        Integer bonificacionArea;
        Integer bonificacionHijos;
        Integer hijos;
        String areaTrabajo;
        Scanner sc = new Scanner(System.in);

        //Se piden los datos
        System.out.println("Ingresar Area de Trabajo");
        areaTrabajo = sc.nextLine();
        System.out.println("Ingresar Sueldo Básico");
        sueldoBasico = sc.nextInt();
        System.out.println("Ingresar Numero de Hijos");
        hijos = sc.nextInt();


        //Procesar el área de trabajo
        switch (areaTrabajo) {
            case "Sistemas":
                bonificacionArea = (sueldoBasico *25 /100);
                break;
            case "Contabilidad":
                bonificacionArea = (sueldoBasico *20 /100);;
                break;
            default:
                bonificacionArea = (sueldoBasico *10 /100);;
                break;
        }

        //Verificar la cantidad de hijos y procesar el sueldoTotal
        if(hijos >= 2) {
            bonificacionHijos = 150 * hijos;
            sueldoTotal = sueldoBasico + bonificacionArea + bonificacionHijos;
        } else sueldoTotal = sueldoBasico + bonificacionArea;

        System.out.println("Su sueldo es: " + sueldoTotal);

    }
}
