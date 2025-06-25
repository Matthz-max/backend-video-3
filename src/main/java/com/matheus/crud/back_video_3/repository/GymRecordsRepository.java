package com.matheus.crud.back_video_3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.matheus.crud.back_video_3.entities.GymRecord;

// Interface que gerencia o acesso ao banco de dados para GymRecord
// JpaRepository já traz os métodos prontos para CRUD (salvar, buscar, deletar, etc)
// O Long é o tipo do ID da entidade GymRecord
public interface GymRecordsRepository extends JpaRepository<GymRecord, Long> {
}
