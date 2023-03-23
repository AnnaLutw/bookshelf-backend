package com.bookshelf.service;

import java.util.List;

import com.bookshelf.domain.Usuario;
import com.bookshelf.dto.UsuarioDto;

public interface UsuarioService {
	
	
	List<Usuario> findAll();
	
	Usuario save(Usuario usuario);
	UsuarioDto login(String usuario, String senha);
	Usuario findByUsuario(String string);
}
