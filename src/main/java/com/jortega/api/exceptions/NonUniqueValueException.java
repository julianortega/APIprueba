package com.jortega.api.exceptions;

public class NonUniqueValueException extends RuntimeException {
    public NonUniqueValueException(String variable, Long value) {
        super("La variable '" + variable + "' necesita un valor único y el valor '" + value + "' ya está en uso.");
    }
}