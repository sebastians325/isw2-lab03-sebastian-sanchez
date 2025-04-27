package ServicioLimpieza;

import ServicioLimpieza.ServicioLimpieza;

public class ServicioHogar extends ServicioLimpieza {

    private boolean esApartamento;

    public ServicioHogar(boolean esApartamento, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.esApartamento = esApartamento;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioBase = calcularPrecioBase();
        if (esApartamento) {
            precioBase *= 0.9;
        } 
        return precioBase;
    }
    
    @Override
    public String getDescripcion() {
        return "Servicio Hogar"; 
    }
}
