package ServicioLimpieza;

public abstract class ServicioLimpieza {
    
    protected String direccionCliente;
    protected double duracionHoras;
    protected double tarifaHora;
    protected boolean incluyeMateriales;
    protected String nombreCliente;

    public ServicioLimpieza(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        this.direccionCliente = direccionCliente;
        this.duracionHoras = duracionHoras;
        this.tarifaHora = tarifaHora;
        this.incluyeMateriales = incluyeMateriales;
        this.nombreCliente = nombreCliente;
    }
 
    public double calcularPrecioBase() {
        return duracionHoras * tarifaHora;
    }
    
    public abstract double calcularPrecioFinal();
    public abstract String getDescripcion();

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public boolean isIncluyeMateriales() {
        return incluyeMateriales;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }
    
    
}
