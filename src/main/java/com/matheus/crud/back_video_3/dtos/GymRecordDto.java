package com.matheus.crud.back_video_3.dtos;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// DTO (Data Transfer Object) usado para transferir dados dos registros de treino (GymRecord)

// Lombok cria os métodos automaticamente: getters, setters, construtores, etc.
@AllArgsConstructor      // Construtor com todos os campos
@NoArgsConstructor       // Construtor vazio
@Builder                 // Permite criar objetos usando o padrão Builder
@Data                    // Gera getters, setters, toString, equals e hashCode
@Getter
@Setter
public class GymRecordDto {

    private Long id;                  // ID do registro

    @NotNull
    private String exercise;          // Nome do exercício (não pode ser nulo)

    @NotNull
    private Integer weight;           // Peso usado no exercício (não pode ser nulo)

    private LocalDateTime date;       // Data do registro (pode ser nulo, preenchido pelo sistema)
}
