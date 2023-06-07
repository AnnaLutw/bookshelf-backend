package com.bookshelf.resource;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.bookshelf.service.UsuarioService;

import com.bookshelf.domain.Usuario;

@CrossOrigin(origins = "*", maxAge = 3600)
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

	@PostMapping("/login")
	public Usuario login(String email, String senha) {
		System.out.println("Logada");
		return service.login(email, senha);
	}
	@GetMapping(value = "/{id}")
	public Optional<Usuario> findById(@PathVariable Long id){
		return service.findById(id);
	}

}
