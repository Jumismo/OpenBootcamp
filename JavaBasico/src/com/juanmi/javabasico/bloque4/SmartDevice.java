package com.juanmi.javabasico.bloque4;

public class SmartDevice {

    private String modelo;

    private String pantalla;

    public SmartDevice(String modelo, String pantalla) {
        this.modelo = modelo;
        this.pantalla = pantalla;
    }

    public SmartDevice() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "modelo='" + modelo + '\'' +
                ", pantalla='" + pantalla + '\'' +
                '}';
    }
}
