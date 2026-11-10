package Ejercicio3;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void generar(String contenido) {
        System.out.println("Generando documento PDF estructurado con: " + contenido);
    }
}
