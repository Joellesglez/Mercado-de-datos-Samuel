import java.util.HashMap;
import java.util.Map;

public class Fase3Venta{

    enum Fruta {
        MANZANA, PERA, PLATANO, NARANJA
    }

    public static void main(String[] args) {
        // Precio por fruta (simulado)
        HashMap<Fruta, Double> precios = new HashMap<>();
        precios.put(Fruta.MANZANA, 1.0);
        precios.put(Fruta.PERA, 1.2);
        precios.put(Fruta.PLATANO, 0.5);
        precios.put(Fruta.NARANJA, 0.8);

        // Ventas por fruta (en unidades)
        HashMap<Fruta, Integer> ventas = new HashMap<>();
        ventas.put(Fruta.MANZANA, 0);
        ventas.put(Fruta.PERA, 0);
        ventas.put(Fruta.PLATANO, 0);
        ventas.put(Fruta.NARANJA, 0);

        // Simulamos compras de algunos clientes
        System.out.println("=== Registro de Compras ===");

        registrarCompra("Isidrito", Fruta.PLATANO, 5.23, precios, ventas);
        registrarCompra("Mario", Fruta.MANZANA, 3.50, precios, ventas);
        registrarCompra("Sandrorey", Fruta.NARANJA, 4.8, precios, ventas);
        registrarCompra("Samu", Fruta.NARANJA, 12.10, precios, ventas);
        registrarCompra("TacuyoLaLaguna", Fruta.NARANJA, 7, precios, ventas);

        // Mostrar resumen del inventario actualizado
        System.out.println("\n=== Inventario actualizado ===");
        for (Map.Entry<Fruta, Integer> entry : ventas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " unidades vendidas");
        }
    }

    public static void registrarCompra(
            String cliente,
            Fruta fruta,
            double montoEnEuros,
            HashMap<Fruta, Double> precios,
            HashMap<Fruta, Integer> ventas
    ) {
        double precioUnitario = precios.get(fruta);
        int unidades = (int) (montoEnEuros / precioUnitario);

        // Sumar al registro de ventas
        ventas.put(fruta, ventas.get(fruta) + unidades);

        System.out.println(cliente + " ha comprado " + unidades + " " + fruta + "(s) por " + montoEnEuros + "€.");
    }
}
