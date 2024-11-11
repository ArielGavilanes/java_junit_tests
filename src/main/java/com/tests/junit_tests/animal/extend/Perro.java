package com.tests.junit_tests.animal.extend;

import com.tests.junit_tests.animal.Animal;

public class Perro extends Animal {
    private String raza;
    private String juguete;

    public Perro(String especie, int edad, String color, String raza, String juguete) {
        super(especie, edad, color);
        this.raza = raza;
        this.juguete = juguete;
    }

    public String jugarConJuguete() {
        return "El perro " + raza + " esta jugando con " + juguete + ".";
    }

    // getters and setters
    public String getRaza() {
        return raza;
    }

    public String getTamano() {
        return juguete;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTamano(String tamano) {
        this.juguete = tamano;
    }
}
