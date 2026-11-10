package Ejercicio2;

public class CuentaAhorros implements TransferenciaBancaria, RetiroBancario {
    @Override
    public void transferir(String cuentaDestino, double monto) {
        System.out.println("Transfiriendo $" + monto + " a la cuenta " + cuentaDestino);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retirando $" + monto + " de la cuenta de ahorros.");
    }
}
