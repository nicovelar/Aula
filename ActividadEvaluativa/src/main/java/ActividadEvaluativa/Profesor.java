package ActividadEvaluativa;

import java.util.Random;

public class Profesor extends Persona{
    Random rand = new Random();
    int rand_int1 = rand.nextInt(100);

    public void llegaAClase() {
        if (rand_int1 >= 80) {
            asistencia = true;
        }
    }
}
