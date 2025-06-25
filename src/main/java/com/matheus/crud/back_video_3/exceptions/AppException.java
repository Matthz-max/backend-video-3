package com.matheus.crud.back_video_3.exceptions;

import org.springframework.http.HttpStatus;

// Classe para criar exceções personalizadas no projeto
public class AppException extends RuntimeException {

    private final HttpStatus status; // Código de status HTTP (ex: 404, 400, etc)

    // Construtor que recebe a mensagem de erro e o status HTTP
    public AppException(String message, HttpStatus status) {
        super(message);        // Define a mensagem de erro
        this.status = status;  // Define o status HTTP
    }

    // Getter para pegar o status
    public HttpStatus getStatus() {
        return status;
    }
}
