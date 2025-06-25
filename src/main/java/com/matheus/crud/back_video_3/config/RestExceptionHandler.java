package com.matheus.crud.back_video_3.config;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.matheus.crud.back_video_3.dtos.ErrorDto;
import com.matheus.crud.back_video_3.exceptions.AppException;

@ControllerAdvice // Diz ao Spring que esta classe vai tratar erros globais da aplicação
public class RestExceptionHandler {

    @ExceptionHandler(value = { AppException.class }) // Quando der uma AppException, cai aqui
    @ResponseBody // Faz o método retornar o JSON direto na resposta HTTP
    public ResponseEntity<ErrorDto> handleException(AppException ex) {
        return ResponseEntity
                .status(ex.getStatus()) // Retorna o status que veio dentro da exception
                .body(new ErrorDto(ex.getMessage())); // Retorna a mensagem de erro dentro de um DTO
    }
}
