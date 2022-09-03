package com.juanmi.javabasico.bloque4;

public class Main {

    public static void main(String[] args) {
        SmartDevice sd = new SmartDevice("Xiaomi", "6 pulgadas");
        System.out.println(sd.toString());
        SmartWatch sw = new SmartWatch("Xiaomi", "2 pulgadas", "Rojo");
        System.out.println(sw.toString());
        SmartPhone sp = new SmartPhone("Xiaomi", "5 pulgadas", "Azul");
        System.out.println(sp.toString());

    }
}
