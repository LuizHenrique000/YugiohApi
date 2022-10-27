package com.fundatec.lp3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp3.model.CardMonstro;
import com.fundatec.lp3.repository.CardMonstroRepository;

@Service
public class CardMonstroService {
	
	private CardMonstroRepository repository;
	
	@Autowired
	public CardMonstroService(CardMonstroRepository repository) {
		this.repository = repository;
	}
	
	public List<CardMonstro> listar() {
		return repository.findAll();
	}

	public CardMonstro salvarMonstro(CardMonstro cardMonstro) {
		return repository.save(cardMonstro);
	}
	
	public void deletarTodos() {
		repository.deleteAll();
	}
}
