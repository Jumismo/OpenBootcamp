package com.juanmi.javabasico.bloque1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        short numero = 4;
        int entero = 5;
        long numeroLargo = 5L;

        float flotante = 2.4f;
        double decimal = 4.5;

        char caracter = 'A';
        String cadena = "Hola";

        boolean bandera = true;

        String[] array = new String[3];
        List<String> tipoLista = new ArrayList<>();
        Map<String, String> mapa = new HashMap<>();

        System.out.println("short: " + numero);
        System.out.println("int: " + entero);
        System.out.println("long: " + numeroLargo);

        System.out.println("float: " + flotante);
        System.out.println("double: " + decimal);

        System.out.println("char: " + caracter);
        System.out.println("String: " + cadena);

        System.out.println("boolean: " + bandera);

        System.out.println("array: " + array);
        System.out.println("list: " + tipoLista);
        System.out.println("map: " + mapa);

    }
}
