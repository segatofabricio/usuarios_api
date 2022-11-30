package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.CriarContaPostDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags="Criar conta de usuário")
@RestController
public class CriarContaController {
	@ApiOperation("Serviço para criação de usuário")
	@PostMapping("/api/criar-conta")
	public void post(@RequestBody CriarContaPostDto dto) {
		
	}
	
}
