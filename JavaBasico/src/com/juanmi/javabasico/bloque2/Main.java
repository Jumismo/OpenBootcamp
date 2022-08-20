package com.juanmi.javabasico.bloque2;

public class Main {
    public static void main(String[] args) {

        System.out.println(precioConIVA(300, 10));
    }

    public static double precioConIVA(double precio, double iva) {
        return precio + ((precio * iva) / 100);
    }
}
