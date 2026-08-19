package com.example.openclose.descuentos;

public class DescuentoFijo implements Descuento{

    @Override
    public double aplicarDescuento(double monto) {
        return monto-10;
    }
}
