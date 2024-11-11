package com.tests.junit_tests.carro.extend;

import com.tests.junit_tests.carro.Carro;

public class CarroDeportivo extends Carro {

    private boolean modoAltoRendimiento;

    public CarroDeportivo(String modelo, int año, int velocidad) {
        super(modelo, año, velocidad);
        this.modoAltoRendimiento = false;
    }

    @Override
    public int acelerar(int incrementoVelocidad) {
        super.setVelocidad(super.getVelocidad() * incrementoVelocidad);
        return super.getVelocidad();
    }

    // getters and setters
    public boolean getModoAltoRendimiento() {
        return modoAltoRendimiento;
    }

    public void setModoAltoRendimiento(boolean modoAltoRendimiento) {
        this.modoAltoRendimiento = modoAltoRendimiento;
    }

}
