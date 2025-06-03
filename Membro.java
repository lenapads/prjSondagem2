package com.example.lenoca.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_membro")
public class Membro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
	private String nome;
	private String matricula;
	private String email;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "tb_clube_membro", joinColumns = @JoinColumn(name = "membro_id"), inverseJoinColumns = @JoinColumn(name = "clube_id"))
	private List<Clube> clube;
	
	public Membro() {
		
	}

	public Membro(Long id, String nome, String matricula, String email, List<Clube> clube) {
		super();
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.clube = clube;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Clube> getClube() {
		return clube;
	}

	public void setClube(List<Clube> clube) {
		this.clube = clube;
	}

	

}