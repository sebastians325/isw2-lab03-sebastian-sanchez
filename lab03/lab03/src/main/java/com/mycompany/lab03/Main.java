package com.mycompany.lab03;

import Descuento.DescuentoClienteFrecuente;
import Descuento.DescuentoCampania;
import Decorator.ConAromatizante;
import Decorator.ConDesinfeccion;
import Factory.ServicioFactory;
import ServicioLimpieza.ServicioHogar;
import ServicioLimpieza.ServicioIndustrial;
import ServicioLimpieza.ServicioLimpieza;
import ServicioLimpieza.ServicioOficina;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Ejercicio 01: Crear e imprimir precio final de servicios ===");

        ServicioHogar servicioHogar = new ServicioHogar(true, "Av. Siempre Viva 123", 3, 50, true, "Homero Simpson");
        System.out.println(servicioHogar.getDescripcion() + " - Precio Final: $" + servicioHogar.calcularPrecioFinal());

        ServicioOficina servicioOficina = new ServicioOficina(20, "Av. Principal 456", 5, 60, true, "Lisa Simpson");
        System.out.println(servicioOficina.getDescripcion() + " - Precio Final: $" + servicioOficina.calcularPrecioFinal());

        ServicioIndustrial servicioIndustrial = new ServicioIndustrial(1.5, "Parque Industrial 789", 8, 70, true, "Sr. Burns");
        System.out.println(servicioIndustrial.getDescripcion() + " - Precio Final: $" + servicioIndustrial.calcularPrecioFinal());

        System.out.println("\n=== Ejercicio 02: Aplicar e imprimir dos descuentos sobre un servicio ===");

        double precioOriginal = servicioHogar.calcularPrecioFinal();
        System.out.println("Precio Original Servicio Hogar: $" + precioOriginal);

        DescuentoClienteFrecuente descuentoCliente = new DescuentoClienteFrecuente();
        double precioConDescuentoCliente = descuentoCliente.aplicarDescuento(precioOriginal);
        System.out.println("Precio con descuento Cliente Frecuente: $" + precioConDescuentoCliente);

        DescuentoCampania descuentoCampania = new DescuentoCampania();
        double precioConDescuentoCampania = descuentoCampania.aplicarDescuento(precioOriginal);
        System.out.println("Precio con descuento de Campaña: $" + precioConDescuentoCampania);

        System.out.println("\n=== Ejercicio 03: Decorar un servicio con dos servicios adicionales ===");

        // Primero creamos un servicio base
        ServicioLimpieza servicioBase = new ServicioOficina(10, "Calle Falsa 123", 4, 55, true, "Marge Simpson");

        // Decoramos el servicio agregando desinfección y aromatizante
        servicioBase = new ConDesinfeccion(servicioBase, servicioBase.getDireccionCliente(), servicioBase.getDuracionHoras(), servicioBase.getTarifaHora(), servicioBase.isIncluyeMateriales(), servicioBase.getNombreCliente());
        servicioBase = new ConAromatizante(servicioBase, servicioBase.getDireccionCliente(), servicioBase.getDuracionHoras(), servicioBase.getTarifaHora(), servicioBase.isIncluyeMateriales(), servicioBase.getNombreCliente());

        System.out.println(servicioBase.getDescripcion() + " - Precio Final con adicionales: $" + servicioBase.calcularPrecioFinal());

        System.out.println("\n=== Ejercicio 04: Usar ServicioFactory para crear un servicio ===");

        ServicioLimpieza servicioDesdeFactory = ServicioFactory.crearServicio(
                "hogar",
                "Av. Los Cerezos 456",
                2,
                45,
                true,
                "Bart Simpson",
                true // esApartamento = true
        );

        System.out.println("Servicio creado con Factory: " + servicioDesdeFactory.getDescripcion());
        System.out.println("Precio Final: $" + servicioDesdeFactory.calcularPrecioFinal());
    }
}
