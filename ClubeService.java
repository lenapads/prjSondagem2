package com.example.lenoca.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.lenoca.entities.Clube;
import com.example.lenoca.repositories.ClubeRepository;

@Service
public class ClubeService {
	private final ClubeRepository clubeRepository;
	
	@Autowired
	public ClubeService(ClubeRepository clubeRepository) {
		this.clubeRepository = clubeRepository;
	}
	
	public Clube findClubeByid(Long id) {
		Optional<Clube> clube = clubeRepository.findById(id);
		return clube.orElseGet(null);
	}
	
	public List<Clube> findAllClubes(){
	  return clubeRepository.findAll();	
	}
	
	public Clube saveClube(Clube clube) {
		return clubeRepository.save(clube);
	}
	 public void deleteClube(Long id) {
		  clubeRepository.deleteById(id);
	  }
	
	public List<Clube> BuscarMembroPorClube(String nome){
		return clubeRepository.findClubeByMembro(nome);
	}
}
