package com.example.openclose;

import com.example.openclose.descuentos.Descuento;
import com.example.openclose.descuentos.DescuentoFijo;
import com.example.openclose.descuentos.DescuentoVariable;

public class OpenCloseApp {
    public static void main(String[] args) {
        // Definimo
        double monto = 100;
        // Inicializamos un descuento variable
        Descuento descuento = new DescuentoVariable();
        // Aplicamos el primer descuento del 10%
        double precioFinal = descuento.aplicarDescuento(monto);
        // Aplicar otro descuento
        // Redefinimos como descuento fijo
        descuento = new DescuentoFijo();
        // Aplicamos el descuento fijo de 10 soles
        precioFinal = descuento.aplicarDescuento(precioFinal);
        // Mostramos el resultado final (80 soles)
        System.out.format("Precio final: S/%.2f", precioFinal);
    }
}
