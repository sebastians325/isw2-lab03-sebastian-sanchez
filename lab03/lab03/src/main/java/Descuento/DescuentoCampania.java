package Descuento;

import Descuento.DescuentoIF;

public class DescuentoCampania implements DescuentoIF {

    private static final double PORCENTAJE_DESCUENTO = 0.20;
    
    @Override
    public double aplicarDescuento(double monto) {
        
        return monto * (1 - PORCENTAJE_DESCUENTO);
        
    }
    
}
