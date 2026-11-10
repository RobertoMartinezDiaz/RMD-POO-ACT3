package Ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String token) {
        System.out.println("Autenticando a " + usuario + " mediante proveedor OAuth externo.");
        return true;
    }
}
