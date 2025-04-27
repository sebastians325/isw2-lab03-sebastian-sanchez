package ServicioLimpieza;

import ServicioLimpieza.ServicioLimpieza;

public class ServicioIndustrial extends ServicioLimpieza {

    private double multiplicadorRiesgo;

    public ServicioIndustrial(double multiplicadorRiesgo, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.multiplicadorRiesgo = multiplicadorRiesgo;
    }
    
    @Override
    public double calcularPrecioFinal() {
        if(!incluyeMateriales) {
            throw new IllegalArgumentException("Los servicios industriales requieren materiales");
        }
        
        return calcularPrecioBase() * multiplicadorRiesgo;
    }

    @Override
    public String getDescripcion() {
        return "Servicio Industrial"; 
    }
    
}
