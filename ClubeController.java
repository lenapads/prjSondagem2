package com.example.lenoca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lenoca.entities.Clube;
import com.example.lenoca.services.ClubeService;

@RestController
@RequestMapping("/clubes")
public class ClubeController {

	private final ClubeService clubeService;
	
	@Autowired
	public ClubeController(ClubeService clubeService) {
		this.clubeService = clubeService;
	}
	
	@PostMapping("/create")
	public Clube createClube(@RequestBody Clube clube) {
		return clubeService.saveClube(clube);
	}
	
	@GetMapping("/{id}")
	public Clube getClube(@PathVariable Long id) {
		return clubeService.findClubeByid(id);
	}
	
	@GetMapping("/all")
	public List<Clube> getAllClubes(){
		return clubeService.findAllClubes();
	}
	
	 @DeleteMapping("/{id}")
	 public void deleteClube(@PathVariable Long id) {
		clubeService.deleteClube(id); 
	 }
	@GetMapping("/clube-membro/")
	public List<Clube> getMembroPorClube(@PathVariable String nome) {
		return clubeService.BuscarMembroPorClube(nome);
	}
}
