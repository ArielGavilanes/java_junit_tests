package com.tests.junit_tests.animal.extend;

import com.tests.junit_tests.animal.Animal;

public class Gato extends Animal {

    private String raza;
    private String tamano;

    public Gato(String especie, int edad, String color, String raza, String tamano) {
        super(especie, edad, color);
        this.raza = raza;
        this.tamano = tamano;
    }

    public String presentarGato() {
        return "Soy un gato de raza " + raza + ", de tamaño " + tamano + ", y mi color es " + super.getColor() + ".";
    }

    // getters and setters
    public String getRaza() {
        return raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

}
