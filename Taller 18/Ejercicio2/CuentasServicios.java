package Ejercicio2;

public class CuentasServicios implements PagoFactura {
    @Override
    public void pagarFactura(String servicio, double monto) {
        System.out.println("Pagando el servicio de " + servicio + "por un valor de $" + monto);
    }
}
