package lineart.com.LineArt.DTO;

import java.io.Serializable;

import lineart.com.LineArt.entities.client;

public class clientDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String telefone;
	
	public clientDTO() {
	}

	public clientDTO(Long id, String nome, String telefone) {
		
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public clientDTO(client entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.telefone = entity.getTelefone();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

}
