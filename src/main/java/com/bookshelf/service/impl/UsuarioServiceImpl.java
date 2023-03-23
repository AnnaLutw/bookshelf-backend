package com.bookshelf.service.impl;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshelf.domain.Usuario;
import com.bookshelf.dto.UsuarioDto;
import com.bookshelf.repository.UsuarioRepository;
import com.bookshelf.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public List<Usuario> findAll() {
		return repository.findAll();
	}

	@Override
	public Usuario save(Usuario usuario) {
		return repository.save(usuario);
	}

	@Override
	public UsuarioDto login(String email, String senha) {
		
		Usuario emailDois = repository.findByUsuarioAndSenha(email, senha);
		if(emailDois == null) {
			return null;
		}
		else {
			String originalInput = emailDois.getEmail() + ":"+ emailDois.getSenha();
			UsuarioDto usuarioDto = new UsuarioDto(emailDois);
			usuarioDto.setToken(Base64.getEncoder().encodeToString(originalInput.getBytes()));
			return usuarioDto;
		}
	}

	@Override
	public Usuario findByUsuario(String string) {
		return repository.findByUsuario(string);
	}
	
}
