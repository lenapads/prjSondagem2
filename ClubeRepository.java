package com.example.lenoca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.lenoca.entities.Clube;

public interface ClubeRepository extends JpaRepository<Clube, Long>{

	@Query("SELECT c FROM Clube c JOIN c.membros m WHERE m.nome = :nome")
	List<Clube> findClubeByMembro(@Param("nome")String nome);
}
