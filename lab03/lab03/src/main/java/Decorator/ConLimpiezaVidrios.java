package Decorator;

import Decorator.ServicioAdicional;
import ServicioLimpieza.ServicioLimpieza;

public class ConLimpiezaVidrios extends ServicioAdicional {

    public ConLimpiezaVidrios(ServicioLimpieza servicioLimpieza, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(servicioLimpieza, direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
    }

    @Override
    public double calcularPrecioFinal() {
        return servicioLimpieza.calcularPrecioFinal() + 40.0;
    }

    @Override
    public String getDescripcion() {
        return servicioLimpieza.getDescripcion() + " con limpieza de vidrios ";
    }
    
}
