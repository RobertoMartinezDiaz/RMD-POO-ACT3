package Ejercicio3;

public class CamionCarga implements Conducible, CargaTransporte {

    @Override
    public void conducir() {
        System.out.println("El camión de carga está circulando.");
    }

    @Override
    public void cargarMercancia(double pesoKg) {
        System.out.println("Cargando " + pesoKg + " kg en el compartimiento del camión.");
    }
}
