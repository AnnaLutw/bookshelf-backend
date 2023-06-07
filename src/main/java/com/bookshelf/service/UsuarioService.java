package com.bookshelf.service;

import java.util.List;
import java.util.Optional;

import com.bookshelf.domain.Usuario;

public interface UsuarioService {
	
	
	List<Usuario> findAll();
	Usuario save(Usuario usuario);
	Usuario login(String usuario, String senha);

	Optional<Usuario> findById(Long id);
}
