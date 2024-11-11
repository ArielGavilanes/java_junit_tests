package com.tests.junit_tests.carro.extend;

import com.tests.junit_tests.carro.Carro;

public class Camioneta extends Carro {
    private boolean modo4x4;

    public Camioneta(String modelo, int año, int velocidad) {
        super(modelo, año, velocidad);
        this.modo4x4 = false;
    }

    @Override
    public int acelerar(int incrementoVelocidad) {
        super.setVelocidad(super.getVelocidad() * incrementoVelocidad);
        return super.getVelocidad();
    }

    public boolean activarModo4x4() {
        this.setModo4x4(true);
        return this.getModo4x4();
    }

    // getters and setters
    public boolean getModo4x4() {
        return modo4x4;
    }

    public void setModo4x4(boolean modo4x4) {
        this.modo4x4 = modo4x4;
    }
}
