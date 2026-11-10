package Ejercicio2;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombre, String contenido) {
        System.out.println("Guardando el archivo '" + nombre + "' en el disco local.");
    }

    @Override
    public String recuperarArchivo(String nombre) {
        System.out.println("Leyendo el archivo '" + nombre + "' del disco local.");
        return "Contenido simulado del archivo local";
    }
}
