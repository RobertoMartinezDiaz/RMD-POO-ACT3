package Ejercicio2;

public class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void procesarGuardado(String nombre, String contenido) {
        almacenamiento.guardarArchivo(nombre, contenido);
    }
}