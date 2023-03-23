package com.bookshelf.dto;

import com.bookshelf.domain.Usuario;

public class UsuarioDto {
	
	private int id;
	
	private String usuario;
	private String email;
	private String senha;
	private String token;
	
	public UsuarioDto(Usuario usuario) {
		setId(usuario.getId());
		setUsuario(usuario.getUsuario());
		setEmail(usuario.getEmail());
		setSenha(usuario.getSenha());
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
}
