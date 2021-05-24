package com.andre.bookstore.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andre.bookstore.domain.Livro;
import com.andre.bookstore.service.LivroService;

@RestController
@RequestMapping(value = "/livros")
public class LivroRosource {
	
	@Autowired
	private LivroService service;
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Livro> findById(@PathVariable Integer id){
		Livro obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}