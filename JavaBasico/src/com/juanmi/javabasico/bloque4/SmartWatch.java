package com.juanmi.javabasico.bloque4;

public class SmartWatch extends SmartDevice{

    private String colorCorrea;

    public SmartWatch(String modelo, String pantalla, String colorCorrea) {
        super(modelo, pantalla);
        this.colorCorrea = colorCorrea;
    }

    public String getColorCorrea() {
        return colorCorrea;
    }

    public void setColorCorrea(String colorCorrea) {
        this.colorCorrea = colorCorrea;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "colorCorrea='" + colorCorrea + '\'' +
                "} " + super.toString();
    }
}
