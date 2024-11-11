package com.tests.junit_tests.animal;

import com.tests.junit_tests.animal.iface.AnimalI;

public class Animal implements AnimalI {
    private String especie;
    private int edad;
    private String color;

    public Animal(String especie, int edad, String color) {
        this.especie = especie;
        this.edad = edad;
        this.color = color;
    }

    public static String saludoDesdeClase() {
        return "Hola! Un saludo desde la clase Animal";
    } 


    //getters and setters
    @Override
    public String getEspecie() {
        return especie;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

}
