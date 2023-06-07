package com.bookshelf.domain;


import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@Table(name = "livros_favoritos")
@Entity(name = "LivroFavoritos")
public class LivroFavorito  {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    @JoinColumn(name="id_usuario", referencedColumnName = "id")
    private Usuario idUsuario;

}
