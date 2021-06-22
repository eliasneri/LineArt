package lineart.com.LineArt.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_materiais")
public class materiais implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private Long largura;
	private Double valorM2;
	private String marca;
	private String fornecedor;
	
	public materiais(Long id, String descricao, Long largura, Double valorM2, String marca, String fornecedor) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.largura = largura;
		this.valorM2 = valorM2;
		this.marca = marca;
		this.fornecedor = fornecedor;
	}
	
	public materiais() {
		
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getLargura() {
		return largura;
	}

	public void setLargura(Long largura) {
		this.largura = largura;
	}

	public Double getValorM2() {
		return valorM2;
	}

	public void setValorM2(Double valorM2) {
		this.valorM2 = valorM2;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Long getId() {
		return id;
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
		materiais other = (materiais) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	

}
