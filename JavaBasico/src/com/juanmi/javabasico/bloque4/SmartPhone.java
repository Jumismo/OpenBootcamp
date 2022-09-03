package com.juanmi.javabasico.bloque4;

public class SmartPhone extends SmartDevice{

    private String colorCarcasa;

    public SmartPhone(String modelo, String pantalla, String colorCarcasa) {
        super(modelo, pantalla);
        this.colorCarcasa = colorCarcasa;
    }

    public String getColorCarcasa() {
        return colorCarcasa;
    }

    public void setColorCarcasa(String colorCarcasa) {
        this.colorCarcasa = colorCarcasa;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "colorCarcasa='" + colorCarcasa + '\'' +
                "} " + super.toString();
    }
}
