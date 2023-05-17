package com.bookshelf.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookshelf.domain.Usuario;
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
	public Usuario login(String email, String senha) {
		return repository.findByEmailAndSenha(email, senha);
	}

	
}
