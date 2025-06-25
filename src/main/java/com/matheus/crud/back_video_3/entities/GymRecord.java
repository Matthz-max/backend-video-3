package com.matheus.crud.back_video_3.entities;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Entidade JPA que representa a tabela gym_record no banco de dados
@Entity
@Table(name = "gym_record")
@AllArgsConstructor            // Construtor com todos os campos
@NoArgsConstructor             // Construtor vazio
@Builder                       // Permite criar objetos com o padrão Builder
@Data                          // Lombok: cria getters, setters, toString, etc
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class) // Faz com que as datas sejam preenchidas automaticamente (created / modified)
public class GymRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Gera o ID automaticamente
    private Long id;

    @Column
    private String exercise;    // Nome do exercício

    @Column
    private Integer weight;     // Peso usado

    @CreatedDate
    private LocalDateTime created;  // Data de criação (preenchido automático pelo Spring)

    @LastModifiedDate
    private LocalDateTime modified; // Data da última modificação (preenchido automático)
}
