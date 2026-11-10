package Ejercicio1;

public class PersonalAseo implements Limpieza {
    @Override
    public void limpiar() {
        System.out.println("El personal de aseo está realizando labores de limpieza.");
    }
}
//Se usa solamente la interfaz que le corresponde(limpieza)
