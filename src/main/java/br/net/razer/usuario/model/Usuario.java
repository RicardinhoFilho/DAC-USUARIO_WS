package br.net.razer.usuario.model;

import java.io.Serializable;


	
	public class Usuario implements Serializable{
		private int id;
		private String nome;
		private String login;
		private String senha;
		private String perfil;
		
		public Usuario() {
			super();
		}
		
		public Usuario(int id, String nome, String login, String senha, String perfil) {
			super();
			this.id = id;
			this.nome = nome;
			this.login = login;
			this.senha = senha;
			this.perfil = perfil;
		}
		
		public int getId() {
			return this.id;
		}

		public void setId(int id) {
			 this.id = id;
		}
		
		public String getNome() {
			return this.nome;
		}

		public void setNome(String nome) {
			 this.nome = nome;
		}
		
		public String getLogin() {
			return this.login;
		}

		public void setLogin(String login) {
			 this.login = login;
		}
		
		public String getSenha() {
			return this.senha;
		}

		public void setSenha(String senha) {
			 this.senha = senha;
		}
		
		public String getPerfil() {
			return this.perfil;
		}

		public void setPerfil(String perfil) {
			 this.perfil = perfil;
		}
	
	
		
	}

	
