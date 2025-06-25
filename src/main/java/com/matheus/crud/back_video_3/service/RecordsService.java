package com.matheus.crud.back_video_3.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.matheus.crud.back_video_3.dtos.GymRecordDto;
import com.matheus.crud.back_video_3.entities.GymRecord;
import com.matheus.crud.back_video_3.exceptions.AppException;
import com.matheus.crud.back_video_3.mappers.GymRecordMapper;
import com.matheus.crud.back_video_3.repository.GymRecordsRepository;

import lombok.RequiredArgsConstructor;

@Service // Indica que esta classe é um serviço no Spring
@RequiredArgsConstructor // Cria construtor automaticamente para os atributos finais (injeção de dependências)
public class RecordsService {

    private final GymRecordsRepository gymRecordsRepository; // Acesso ao banco de dados
    private final GymRecordMapper gymRecordMapper;           // Conversão entre entidade e DTO

    // Pega todos os registros da academia e converte para DTO
    public List<GymRecordDto> allRecords() {
        return gymRecordMapper.toGymRecordDtos(gymRecordsRepository.findAll());
    }

    // Cria um novo registro de academia
    public GymRecordDto createGymRecords(GymRecordDto gymRecordDto) {
        GymRecord gymRecord = gymRecordMapper.toGymRecord(gymRecordDto); // Converte DTO para entidade
        GymRecord savedGymRecord = gymRecordsRepository.save(gymRecord); // Salva no banco
        return gymRecordMapper.toGymRecordDto(savedGymRecord);           // Retorna o registro salvo como DTO
    }

    // Atualiza um registro inteiro pelo ID
    public GymRecordDto updateGymRecord(Long id, GymRecordDto recordDto) {
        GymRecord record = gymRecordsRepository.findById(id) // Busca registro pelo ID
                .orElseThrow(() -> new AppException("Gym record not found", HttpStatus.NOT_FOUND)); // Erro se não achar

        // Atualiza os campos da entidade com os dados do DTO
        gymRecordMapper.updateGymRecord(record, gymRecordMapper.toGymRecord(recordDto));
        
        GymRecord savedGymRecord = gymRecordsRepository.save(record); // Salva alteração no banco
        return gymRecordMapper.toGymRecordDto(savedGymRecord);        // Retorna registro atualizado como DTO
    }

    // Atualiza parcialmente o registro (só os campos que vierem no DTO)
    public GymRecordDto patchGymRecord(Long id, GymRecordDto recordDto) {
        GymRecord record = gymRecordsRepository.findById(id) // Busca registro pelo ID
                .orElseThrow(() -> new AppException("Gym record not found", HttpStatus.NOT_FOUND));

        // Atualiza só se o campo não for nulo
        if (recordDto.getExercise() != null) {
            record.setExercise(recordDto.getExercise());
        }
        if (recordDto.getWeight() != null) {
            record.setWeight(recordDto.getWeight());
        }

        GymRecord savedRecord = gymRecordsRepository.save(record); // Salva no banco
        return gymRecordMapper.toGymRecordDto(savedRecord);        // Retorna registro atualizado como DTO
    }

    // Deleta um registro pelo ID
    public GymRecordDto deleteGymRecord(Long id) {
        GymRecord record = gymRecordsRepository.findById(id) // Busca registro pelo ID
                .orElseThrow(() -> new AppException("Gym record not found", HttpStatus.NOT_FOUND));
        GymRecordDto gymRecordDto = gymRecordMapper.toGymRecordDto(record); // Converte para DTO antes de deletar

        gymRecordsRepository.deleteById(id); // Deleta do banco

        return gymRecordDto; // Retorna o registro deletado como confirmação
    }

    // Busca um registro pelo ID e retorna como DTO
    public GymRecordDto getGymRecord(Long id) {
        GymRecord record = gymRecordsRepository.findById(id)
                .orElseThrow(() -> new AppException("Gym record not found", HttpStatus.NOT_FOUND));
        return gymRecordMapper.toGymRecordDto(record);
    }
}
