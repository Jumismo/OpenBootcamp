package com.juanmi.javabasico.bloque3;

public class Main {

    public static void main(String[] args) {

        String[] nombres = {"Hola", "Mundo"};

        String result = "";
        for(String nombre : nombres) {
            result += nombre;
        }

        System.out.println(result);

    }


}
