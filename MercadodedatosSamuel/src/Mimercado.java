import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Mimercado {

    // -----------------------
    // Fase 1 – Enumerados
    // -----------------------
    enum Fruta {
        MANZANA, PERA, PLATANO, NARANJA
    }

    // Fruta favorita
    static Fruta frutaFavorita = Fruta.PLATANO;

    // Lista de clientes
    static ArrayList<String> clientes = new ArrayList<>();

    // Mapa de ventas (fruta -> cantidad)
    static HashMap<Fruta, Integer> ventas = new HashMap<>();

    public static void main(String[] args) {
        fase1_enum();
        fase2_clientes();
        fase3_ventas();
        faseFinal_resumen();
    }

    // -----------------------
    // Fase 1 – Enumerados
    // -----------------------
    public static void fase1_enum() {
        System.out.println("Fase 1 – Enumerados:");
        System.out.println("Mi fruta estrella es: " + frutaFavorita + "\n");
    }

    // -----------------------
    // Fase 2 – Lista de clientes
    // -----------------------
    public static void fase2_clientes() {
        System.out.println("Fase 2 – Lista de Clientes:");

        // 1. Añadir al menos 5 clientes
        clientes.add("Mario");
        clientes.add("Isidrito");
        clientes.add("Sandrorey");
        clientes.add("Samu");
        clientes.add("TacuyoLaLaguna");

        // 2. Imprimir la lista completa
        System.out.println("Clientes actuales: " + clientes);

        // 3. Eliminar un cliente
        clientes.remove("Carlos");

        // 4. Imprimir lista actualizada
        System.out.println("Clientes después de eliminar a Carlos: " + clientes + "\n");
    }

    // -----------------------
    // Fase 3 – HashMap de ventas
    // -----------------------
    public static void fase3_ventas() {
        System.out.println("Fase 3 – HashMap de Ventas:");

        // 1. Registrar al menos 3 frutas
        ventas.put(Fruta.MANZANA, 10);
        ventas.put(Fruta.NARANJA, 7);
        ventas.put(Fruta.PLATANO, 12);

        // 2. Simular 2 ventas nuevas
        // Sumar 5 a PLATANO
        ventas.put(Fruta.PLATANO, ventas.get(Fruta.PLATANO) + 5);

        // Restar 2 a NARANJA
        ventas.put(Fruta.NARANJA, ventas.get(Fruta.NARANJA) - 2);

        // 3. Imprimir inventario final
        System.out.println("Inventario final de frutas:");
        for (Map.Entry<Fruta, Integer> entry : ventas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }

    // -----------------------
    // Fase Final – Resumen
    // -----------------------
    public static void faseFinal_resumen() {
        System.out.println("Fase Final – Resumen del Mercado:");

        // 1. Imprimir frutas disponibles
        System.out.println("Frutas disponibles:");
        for (Fruta f : Fruta.values()) {
            System.out.println("- " + f);
        }

        // 2. Imprimir lista de clientes atendidos
        System.out.println("\nClientes atendidos:");
        for (String cliente : clientes) {
            System.out.println("- " + cliente);
        }

        // 3. Imprimir ventas registradas
        System.out.println("\nVentas registradas:");
        for (Map.Entry<Fruta, Integer> entry : ventas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 4. Mini informe
        System.out.println("\nMini Informe:");
        Fruta masVendida = null;
        int cantidadMax = -1;

        for (Map.Entry<Fruta, Integer> entry : ventas.entrySet()) {
            if (entry.getValue() > cantidadMax) {
                cantidadMax = entry.getValue();
                masVendida = entry.getKey();
            }
        }

        System.out.println("Fruta más vendida: " + masVendida);
        System.out.println("Total de clientes atendidos: " + clientes.size());
    }
}
