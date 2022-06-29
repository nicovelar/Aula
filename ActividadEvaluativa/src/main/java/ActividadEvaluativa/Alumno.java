package ActividadEvaluativa;


import java.util.Random;

public class Alumno extends Persona{
    Integer calificaciones;
    Random rand = new Random();
    int rand_int1 = rand.nextInt(100);


   public void llegaAClase() {
        if (rand_int1 >= 50) {
            asistencia = true;
        }
    }

}
