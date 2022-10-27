package com.fundatec.lp3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp3.model.CardMagia;
import com.fundatec.lp3.repository.CardMagiaRepository;

@Service
public class CardMagiaService {

	private CardMagiaRepository repository;

	@Autowired
	public CardMagiaService(CardMagiaRepository repository) {
		this.repository = repository;
	}

	public List<CardMagia> listar() {
		return repository.findAll();
	}

	public CardMagia salvarMagia(CardMagia cardMagia) {
		return repository.save(cardMagia);
	}

	public void deletarTodos() {
		repository.deleteAll();
	}

}
