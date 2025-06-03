package com.example.lenoca.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_projeto")
public class Clube {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nomeClube;
	private String descricao;
	private String areaInteresse;
	
	@ManyToMany(mappedBy = "clube", fetch = FetchType.LAZY)
	private List<Membro> membros;
	
	public Clube() {
		
	}

	public Clube(Long id, String nomeClube, String descricao, String areaInteresse, List<Membro> membros) {
		super();
		this.id = id;
		this.nomeClube = nomeClube;
		this.descricao = descricao;
		this.areaInteresse = areaInteresse;
		this.membros = membros;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeClube() {
		return nomeClube;
	}

	public void setNomeClube(String nomeClube) {
		this.nomeClube = nomeClube;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAreaInteresse() {
		return areaInteresse;
	}

	public void setAreaInteresse(String areaInteresse) {
		this.areaInteresse = areaInteresse;
	}

	public List<Membro> getMembros() {
		return membros;
	}

	public void setMembros(List<Membro> membros) {
		this.membros = membros;
	}

	
}