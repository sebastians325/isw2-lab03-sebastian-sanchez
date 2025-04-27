package Factory;

import ServicioLimpieza.ServicioOficina;
import ServicioLimpieza.ServicioHogar;
import ServicioLimpieza.ServicioIndustrial;
import ServicioLimpieza.ServicioLimpieza;

public class ServicioFactory {
    
    public static ServicioLimpieza crearServicio(String tipo, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, Object valorExtra) {
        if (tipo == null) {
            throw new IllegalArgumentException("Tipo de servicio no puede ser nulo.");
        }
        
        return switch (tipo.toLowerCase()) {
            case "hogar" -> {
                if (!(valorExtra instanceof Boolean)) {
                    throw new IllegalArgumentException("Para servicio hogar se requiere un valor booleano (esApartamento).");
                }
                yield new ServicioHogar((Boolean) valorExtra, direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
            }
            case "oficina" -> {
                if (!(valorExtra instanceof Integer)) {
                    throw new IllegalArgumentException("Para servicio oficina se requiere un valor entero (cantidadEmpleados).");
                }
                yield new ServicioOficina((Integer) valorExtra, direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
            }
            case "industrial" -> {
                if (!(valorExtra instanceof Double)) {
                    throw new IllegalArgumentException("Para servicio industrial se requiere un valor decimal (multiplicadorRiesgo).");
                }
                yield new ServicioIndustrial((Double) valorExtra, direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
            }
            default -> throw new IllegalArgumentException("Tipo de servicio desconocido: " + tipo);
        };
    }
}