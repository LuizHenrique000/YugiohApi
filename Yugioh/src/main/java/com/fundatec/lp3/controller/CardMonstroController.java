package com.fundatec.lp3.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fundatec.lp3.model.CardMonstro;
import com.fundatec.lp3.service.CardMonstroService;

@RestController
@RequestMapping("/CardMonstro")
public class CardMonstroController {
	
	private CardMonstroService service;
	
	@Autowired
	public CardMonstroController(CardMonstroService service) {
		this.service = service;
	}

	@GetMapping
	public List<CardMonstro> listar() {
		return service.listar();
	}
	
	@PostMapping
	public CardMonstro adicionar(@RequestBody CardMonstro cardMonstro) {
		return service.salvarMonstro(cardMonstro);
	}
	
	@DeleteMapping
	public void deletar() {
		service.deletarTodos();
	}
	
}
