package com.fundatec.lp3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp3.model.CardArmadilha;
import com.fundatec.lp3.repository.CardArmadilhaRepository;

@Service
public class CardArmadilhaService {

	private CardArmadilhaRepository repository;

	@Autowired
	public CardArmadilhaService(CardArmadilhaRepository repository) {
		this.repository = repository;
	}

	public List<CardArmadilha> listar() {
		return repository.findAll();
	}

	public CardArmadilha salvarArmadilha(CardArmadilha cardArmadilha) {
		return repository.save(cardArmadilha);
	}

	public void deletarTodos() {
		repository.deleteAll();
	}
}