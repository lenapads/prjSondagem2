package com.example.lenoca.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.lenoca.entities.Membro;
import com.example.lenoca.repositories.MembroRepository;


@Service
public class MembroService {
private final MembroRepository membroRepository;

	@Autowired
	public MembroService(MembroRepository membroRepository) {
		this.membroRepository = membroRepository;
	}
	
	public Membro findMembroByid(Long id) {
		Optional<Membro> membro = membroRepository.findById(id);
		return membro.orElseGet(null);
	}
	
	public List<Membro> findAllMembros(){
	  return membroRepository.findAll();	
	}
	
	public Membro saveMembro(Membro membro) {
		return membroRepository.save(membro);
	}
	 public void deleteMembro(Long id) {
		  membroRepository.deleteById(id);
	  }
}
