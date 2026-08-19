package com.example.openclose.descuentos;

public class DescuentoVariable implements Descuento{

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.9;
    }
}
