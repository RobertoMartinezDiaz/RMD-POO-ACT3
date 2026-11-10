package Ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String password) {
        System.out.println("Autenticando a " + usuario + " mediante base de datos local.");
        return true;
    }
}