import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Fase4Resumen {

    enum Fruta {
        MANZANA, PERA, PLATANO, NARANJA
    }

    public static void main(String[] args) {
        // Frutas disponibles
        System.out.println("Frutas disponibles:");
        for (Fruta f : Fruta.values()) {
            System.out.println("- " + f);
        }

        // Lista de clientes
        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Mario");
        clientes.add("Isidrito");
        clientes.add("Sandrorey");
        clientes.add("Samu");
        clientes.add("TacuyoLaLaguna");

        System.out.println("\nClientes atendidos:");
        for (String cliente : clientes) {
            System.out.println("- " + cliente);
        }

        // Ventas registradas
        HashMap<Fruta, Integer> ventas = new HashMap<>();
        ventas.put(Fruta.MANZANA, 10);
        ventas.put(Fruta.PLATANO, 17); // 12 + 5
        ventas.put(Fruta.NARANJA, 5);  // 7 - 2

        System.out.println("\nVentas registradas:");
        for (Map.Entry<Fruta, Integer> entry : ventas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Mini informe
        Fruta masVendida = null;
        int cantidadMax = -1;

        for (Map.Entry<Fruta, Integer> entry : ventas.entrySet()) {
            if (entry.getValue() > cantidadMax) {
                cantidadMax = entry.getValue();
                masVendida = entry.getKey();
            }
        }

        System.out.println("\nMini Informe:");
        System.out.println("Fruta más vendida: " + masVendida);
        System.out.println("Total de clientes atendidos: " + clientes.size());
    }
}
