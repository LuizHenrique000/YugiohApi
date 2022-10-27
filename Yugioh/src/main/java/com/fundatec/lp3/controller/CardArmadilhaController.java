package com.fundatec.lp3.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fundatec.lp3.model.CardArmadilha;
import com.fundatec.lp3.service.CardArmadilhaService;

@RestController
@RequestMapping("/CardArmadilha")
public class CardArmadilhaController {

	private CardArmadilhaService service;

	@Autowired
	private CardArmadilhaController(CardArmadilhaService service) {
		this.service = service;
	}

	@GetMapping
	public List<CardArmadilha> listar() {
		return service.listar();
	}

	@PostMapping
	public CardArmadilha adicionar(@RequestBody CardArmadilha cardArmadilha) {
		return service.salvarArmadilha(cardArmadilha);

	}
	
	@DeleteMapping
	public void deletar() {
		service.deletarTodos();
	}
	

}
