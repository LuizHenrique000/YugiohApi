package com.fundatec.lp3.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fundatec.lp3.model.CardMagia;
import com.fundatec.lp3.service.CardMagiaService;

@RestController
@RequestMapping("/CardMagia")
public class CardMagiaController {
	
	private CardMagiaService service;
	
	@Autowired
	public CardMagiaController(CardMagiaService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<CardMagia> listar(){
		return service.listar();
	}
	
	@PostMapping
	public CardMagia adicionar(@RequestBody CardMagia cardMagia) {
		return service.salvarMagia(cardMagia);
	}
	
	@DeleteMapping
	public void deletar() {
		service.deletarTodos();
	}

}
