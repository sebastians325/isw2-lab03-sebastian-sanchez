package Decorator;

import ServicioLimpieza.ServicioLimpieza;

public abstract class ServicioAdicional extends ServicioLimpieza {
    
    protected ServicioLimpieza servicioLimpieza;

    public ServicioAdicional(ServicioLimpieza servicioLimpieza, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.servicioLimpieza = servicioLimpieza;
    }
}