package com.example.lenoca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lenoca.entities.Membro;
import com.example.lenoca.services.MembroService;

@RestController
@RequestMapping("/membros")
public class MembroController {

	private final MembroService membroService;
	
	@Autowired
	public MembroController(MembroService membroService) {
		this.membroService = membroService;
	}
	
	@PostMapping("/create")
	public Membro createMembro(@RequestBody Membro membro) {
		return membroService.saveMembro(membro);
	}
	
	@GetMapping("/{id}")
	public Membro getMembro(@PathVariable Long id) {
		return membroService.findMembroByid(id);
	}
	
	@GetMapping("/all")
	public List<Membro> getAllMembros(){
		return membroService.findAllMembros();
	}
	 @DeleteMapping("/{id}")
	 public void deleteMembro(@PathVariable Long id) {
		membroService.deleteMembro(id); 
	 }
}
