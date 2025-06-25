package com.matheus.crud.back_video_3.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*; // Importa todas as anotações de controller (GetMapping, PostMapping, etc)

import com.matheus.crud.back_video_3.dtos.GymRecordDto;
import com.matheus.crud.back_video_3.service.RecordsService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController // Diz que essa classe é um controller REST (responde requisições HTTP)
@RequestMapping("/gym") // Define o início da URL: http://localhost:8080/gym
@RequiredArgsConstructor // Cria um construtor com os atributos finais (injeção de dependência)
public class RecordsController {

    private final RecordsService recordsService; // Classe que cuida da lógica do serviço

    @GetMapping("/records") // Endpoint: GET /gym/records
    public ResponseEntity<List<GymRecordDto>> allRecords() {
        return ResponseEntity.ok(recordsService.allRecords()); // Retorna todos os registros
    }

    @PostMapping("/records") // Endpoint: POST /gym/records
    public ResponseEntity<GymRecordDto> createGymRecord(@Valid @RequestBody GymRecordDto recordDto) {
        // Cria um novo registro (recebe o corpo da requisição e valida)
        GymRecordDto createdRecord = recordsService.createGymRecords(recordDto);
        return ResponseEntity
                .created(URI.create("/gym/records/" + recordDto.getId())) // Retorna status 201 Created
                .body(createdRecord);
    }

    @GetMapping("/records/{id}") // Endpoint: GET /gym/records/{id}
    public ResponseEntity<GymRecordDto> getGymRecord(@PathVariable Long id) {
        return ResponseEntity.ok(recordsService.getGymRecord(id)); // Busca um registro por id
    }

    @PutMapping("/records/{id}") // Endpoint: PUT /gym/records/{id}
    public ResponseEntity<GymRecordDto> updateGymRecord(@PathVariable Long id, @Valid @RequestBody GymRecordDto recordDto) {
        return ResponseEntity.ok(recordsService.updateGymRecord(id, recordDto)); // Atualiza o registro todo
    }

    @PatchMapping("/records/{id}") // Endpoint: PATCH /gym/records/{id}
    public ResponseEntity<GymRecordDto> patchGymRecord(@PathVariable Long id, @RequestBody GymRecordDto recordDto) {
        return ResponseEntity.ok(recordsService.patchGymRecord(id, recordDto)); // Atualiza só partes do registro
    }

    @DeleteMapping("/records/{id}") // Endpoint: DELETE /gym/records/{id}
    public ResponseEntity<GymRecordDto> deleteGymRecord(@PathVariable Long id) {
        return ResponseEntity.ok(recordsService.deleteGymRecord(id)); // Deleta o registro por id
    }
}
