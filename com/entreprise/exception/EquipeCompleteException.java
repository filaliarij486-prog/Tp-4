package com.entreprise.exception;

public class EquipeCompleteException extends RuntimeException {

    public EquipeCompleteException(int capacite) {
        super("équipe complète (capacité : " + capacite + ")");
    }
}