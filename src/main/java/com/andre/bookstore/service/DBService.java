package com.andre.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andre.bookstore.domain.Categoria;
import com.andre.bookstore.domain.Livro;
import com.andre.bookstore.repositories.CategoriaRepository;
import com.andre.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private LivroRepository livroRepository;

	public void getConn() {
		Categoria cat2 = new Categoria(null, "Informática", " Livros de TI");
		Categoria cat3 = new Categoria(null, "História", " Livros de hitória");
		
		Livro l2 = new Livro(null, "Arquitetura de software", "Robert Martin", "Lorem ipsum", cat2);
		Livro l3 = new Livro(null, "História da guerra", "Desconhecido", "Lorem ipsum", cat3);
		Livro l4 = new Livro(null, "2 Guerra mundial", "João Rodrigues", "Lorem ipsum", cat3);
		Livro l5 = new Livro(null, "Java para leigos", "Pedro Martins", "Lorem ipsum", cat2);
		Livro l6 = new Livro(null, "Pensamento computacional", "Álvaro Cabral", "Lorem ipsum", cat2);

		cat2.getLivros().addAll(Arrays.asList(l2, l5, l6));
		cat3.getLivros().addAll(Arrays.asList(l3, l4));
		
		
		this.categoriaRepository.saveAll(Arrays.asList(cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l2, l3, l4, l5, l6));
	}
}
