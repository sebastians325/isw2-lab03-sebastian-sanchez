package Descuento;

import Descuento.DescuentoIF;

public class DescuentoClienteFrecuente implements DescuentoIF {

    private static final double PORCENTAJE_DESCUENTO = 0.15;
    
    @Override
    public double aplicarDescuento(double monto) {
        
        return monto * (1 - PORCENTAJE_DESCUENTO);
        
    }
    
}
