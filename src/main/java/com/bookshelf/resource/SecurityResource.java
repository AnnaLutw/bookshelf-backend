package com.bookshelf.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookshelf.dto.UsuarioDto;
import com.bookshelf.service.UsuarioService;

@CrossOrigin
@RestController
@RequestMapping(value="/api/security", produces= MediaType.APPLICATION_JSON_VALUE )
public class SecurityResource {
	
	@Autowired
	private UsuarioService clienteService;
	
	@PostMapping("/login")
	public UsuarioDto login(String email, String senha) {
		
		return clienteService.login(email, senha);
	}
}
