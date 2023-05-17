package com.bookshelf.dto;

import com.bookshelf.domain.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UsuarioDto (
		@NotNull(message = "O id não pode ser nulo")
		Long id,
		@NotBlank(message = "O campo usuario não pode estar vazio")
		String usuario,
		@NotBlank(message = "O campo email não pode estar vazio")
		String email,
		@NotBlank(message = "O campo senha não pode estar vazio")
		String senha

){


}
