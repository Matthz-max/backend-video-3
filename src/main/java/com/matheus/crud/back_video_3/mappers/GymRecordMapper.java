package com.matheus.crud.back_video_3.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.matheus.crud.back_video_3.dtos.GymRecordDto;
import com.matheus.crud.back_video_3.entities.GymRecord;

// Interface para mapear entre entidade e DTO usando MapStruct
@Mapper(componentModel = "spring") // Faz o Spring reconhecer e criar a implementação automaticamente
public interface GymRecordMapper {

    // Converte de DTO para entidade GymRecord
    GymRecord toGymRecord(GymRecordDto gymRecordDto);

    // Converte de entidade GymRecord para DTO, mapeando 'created' para 'date'
    @Mapping(target = "date", source = "created")
    GymRecordDto toGymRecordDto(GymRecord gymRecord);

    // Converte uma lista de entidades GymRecord para uma lista de DTOs
    List<GymRecordDto> toGymRecordDtos(List<GymRecord> gymRecords);

    // Atualiza uma entidade existente com os dados de outra, ignorando os campos id, created e modified
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "created", ignore = true)
    @Mapping(target = "modified", ignore = true)
    void updateGymRecord(@MappingTarget GymRecord target, GymRecord source);
}
