package Ejercicio3;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generar(String contenido) {
        System.out.println("Generando hoja de cálculo Excel con: " + contenido);
    }
}
