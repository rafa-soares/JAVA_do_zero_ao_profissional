package com.java.poo.sessao10.excessoesPersonalizas.excessaoChecada;

public class NotaInvalidaException extends Exception {

    public NotaInvalidaException(String message, String nome) {
        super(String.format(message, nome));
    }
}
