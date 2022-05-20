package com.projeto1.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto1.cursomc.domain.Categorias;
import com.projeto1.cursomc.repositories.CategoriaRepository;
import com.projeto1.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categorias buscar(Integer id) {
		
		Optional<Categorias> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + 
				", Tipo: " + Categorias.class.getName()));
	}
}
