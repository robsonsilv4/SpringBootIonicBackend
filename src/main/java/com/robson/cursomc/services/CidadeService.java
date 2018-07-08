package com.robson.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.robson.cursomc.domain.Cidade;
import com.robson.cursomc.repositories.CidadeRepository;

public class CidadeService {
	@Autowired
	private CidadeRepository repo;
	
	public List<Cidade> findByEstado(Integer estadoId) {
		return repo.findCidades(estadoId);
	}
}
