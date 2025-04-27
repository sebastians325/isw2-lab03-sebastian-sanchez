package ServicioLimpieza;

import ServicioLimpieza.ServicioLimpieza;

public class ServicioOficina extends ServicioLimpieza {

    private int cantidadEmpleados;

    public ServicioOficina(int cantidadEmpleados, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.cantidadEmpleados = cantidadEmpleados;
    }
    
    @Override
    public double calcularPrecioFinal() {
        double duracionTotal = duracionHoras + 0.1 * cantidadEmpleados; 
        double base = duracionTotal * tarifaHora;
    
        return base * 1.18;
    }
    
    @Override
    public String getDescripcion() {
        return "Servicio Oficina"; 
    }

    /*
    @Override
    public double calcularPrecioFinal() {
        duracionHoras = duracionHoras + 0.1 * cantidadEmpleados; 
        double precioBase = calcularPrecioBase();
        precioBase *= 1.18;
        
        return precioBase;
    }
    */
    
}
