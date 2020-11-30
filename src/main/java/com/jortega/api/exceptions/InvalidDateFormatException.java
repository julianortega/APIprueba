package com.jortega.api.exceptions;

public class InvalidDateFormatException extends RuntimeException {
    public InvalidDateFormatException(String date) {
        super("La fecha '" + date + "' no cumple con el formato: yyyy-MM-dd HH:mm:ss");
    }
}