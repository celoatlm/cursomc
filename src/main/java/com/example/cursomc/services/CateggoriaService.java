package com.example.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cursomc.domain.Categoria;
import com.example.cursomc.repositories.CategoriaRepository;
import com.example.cursomc.services.excption.ObjectNotFoundException;

@Service
public class CateggoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> cat = repo.findById(id);
		if(cat == null) {
			throw new ObjectNotFoundException("Objeto não encontrado: "+ id 
					+ ", Tipo da classe " + Categoria.class.getName());
		}
		return cat.orElse(null);
		
		
	} 

}
