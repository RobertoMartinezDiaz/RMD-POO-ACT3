package Ejercicio2;

public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombre, String contenido) {
        System.out.println("Subiendo el archivo '" + nombre + "' al servidor en la nube.");
    }

    @Override
    public String recuperarArchivo(String nombre) {
        System.out.println("Descargando el archivo '" + nombre + "' desde la nube.");
        return "Contenido simulado desde la nube";
    }
}
