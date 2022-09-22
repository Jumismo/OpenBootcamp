package com.juanmi.javabasico.bloque5;

public class CocheCRUDImpl implements CocheCRUD{


    @Override
    public void save() {
        System.out.println("Funcion save");
    }

    @Override
    public void findAll() {
        System.out.println("Funcion findAll");
    }

    @Override
    public void delete() {
        System.out.println("Funcion delete");
    }
}
