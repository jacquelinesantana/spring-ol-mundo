package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//esse é nosso arquivo/classe controladora que vai controlar as totas que vão ser entregues ao usuário
//anotação @RestController é para informar que se trata de um arquivo que será o controlador das rodas da api
//anotação @RequestMapping é para informar o endpoint tera no seu endereço o /ola
@RestController
@RequestMapping("ola")
public class OlaMundo {
	
	//esse método Ola mundo vai retornar uma string com o valor Olá Mundo ele recebe a anotação @GetMapping para ser entregue pelo verbo get
	//atenção você pode definir uma rota especifica para acessar esse método com @GetMapping("/metodo1") por exemplo
	@GetMapping
	public String olaMundo() {
		return "Olá mundo!!!!";
	}

}
