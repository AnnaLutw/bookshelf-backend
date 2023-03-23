package com.bookshelf.resource;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookshelf.service.UsuarioService;

import com.bookshelf.domain.Usuario;

@CrossOrigin
@RestController()
@RequestMapping(value="/api/usuarios", produces= MediaType.APPLICATION_JSON_VALUE)
public class UsuarioResource {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping("/findAll")
	public List<Usuario> findAll(){
		List<Usuario> usuarios = service.findAll();
		return usuarios;		
	}
	
	@PostMapping(value="/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Usuario save(@RequestBody Usuario usuario) {
		return service.save(usuario);
	}
}
