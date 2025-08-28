import java.util.ArrayList;

public class Fase2Cliente {

    public static void main(String[] args) {
        ArrayList<String> clientes = new ArrayList<>();

        // 1. 5 clientes
        clientes.add("Mario");
        clientes.add("Isidrito");
        clientes.add("Sandrorey");
        clientes.add("Samu");
        clientes.add("TacuyoLaLaguna");

        // 2. Mostrar la lista completa
        System.out.println("Clientes actuales: " + clientes);

        // 3. Eliminar un cliente
        clientes.remove("Samu");

        // 4. Mostrar lista actualizada
        System.out.println("Clientes después de eliminar a Samu: " + clientes);
    }
}
