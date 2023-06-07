package com.bookshelf.dto;

import jakarta.validation.constraints.NotNull;

public record LivroFavoritoDto(
        @NotNull(message = "O id não pode ser nulo")
        String id,
        @NotNull(message = "O id não pode ser nulo")
        Long idUsuario

) {
}
