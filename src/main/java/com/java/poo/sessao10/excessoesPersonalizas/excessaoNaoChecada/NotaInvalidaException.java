package com.java.poo.sessao10.excessoesPersonalizas.excessaoNaoChecada;

public class NotaInvalidaException extends RuntimeException {

    public NotaInvalidaException(String message, String nome) {
        super(String.format(message, nome));
    }
}
