package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.service.CalculadoraGoogle;

public class Calculadora {

    CalculadoraGoogle calculadoraGoogle;

    public int sumaNuestra(int a, int b) {
        return calculadoraGoogle.sumar(a,b);
    }

}

