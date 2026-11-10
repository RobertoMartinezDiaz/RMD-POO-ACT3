package Ejercicio3;

public class GestorReportes {
    private GeneradorReporte generadorReporte;

    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void exportar(String contenido) {
        generadorReporte.generar(contenido);
    }
}