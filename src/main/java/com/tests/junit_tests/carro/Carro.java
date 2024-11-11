package com.tests.junit_tests.carro;

public abstract class Carro {
    private String modelo;
    private int año;
    private int velocidad;

    public Carro(String modelo, int año, int velocidad) {
        this.modelo = modelo;
        this.año = año;
        this.velocidad = velocidad;
    }

    public abstract int acelerar(int incrementoVelocidad);

    // getters and setters
    public String getmodelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

}
