package lineart.com.LineArt.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_impressao")
public class impressao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long idCliente;
	private Long idMaterial;
	private Long comprimento;
	private Long largura;
	private Long quantidade;
	private String motivo;
	private Instant data;
	
	public impressao() {
		
	}

	public impressao(Long id, Long idCliente, Long idMaterial, Long comprimento, Long largura, Long quantidade, String motivo,
			Instant data) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idMaterial = idMaterial;
		this.comprimento = comprimento;
		this.largura = largura;
		this.quantidade = quantidade;
		this.motivo = motivo;
		this.data = data;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Long getIdMaterial() {
		return idMaterial;
	}

	public void setIdMaterial(Long idMaterial) {
		this.idMaterial = idMaterial;
	}

	public Long getComprimento() {
		return comprimento;
	}

	public void setComprimento(Long comprimento) {
		this.comprimento = comprimento;
	}

	public Long getLargura() {
		return largura;
	}

	public void setLargura(Long largura) {
		this.largura = largura;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Instant getData() {
		return data;
	}

	public void setData(Instant data) {
		this.data = data;
	}

	public Long getId() {
		return id;
	}
	
	public Long getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		impressao other = (impressao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	

}
