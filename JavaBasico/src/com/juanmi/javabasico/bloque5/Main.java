package com.juanmi.javabasico.bloque5;

public class Main {

    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        cocheCRUD.delete();
        cocheCRUD.findAll();
        cocheCRUD.save();
    }
}
