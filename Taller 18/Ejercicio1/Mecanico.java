package Ejercicio1;

public class Mecanico implements Reparacion {
    @Override
    public void reparar() {
        System.out.println("El mecánico está realizando reparaciones del sistema.");
    }
}
//Se usa solamente la interfaz que le corresponde(Reparacion)
