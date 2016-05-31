package br.unibh.seguros.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="tb_cidade")
public class Cidade implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Version
	@Column(columnDefinition="bigint NOT NULL DEFAULT 0")
	private Long version;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O estado não pode ser vazio")
	@Pattern(regexp = "[A-Z]*", message="Favor fornecer apenas letras maiusculas")
	@Size(min=2, max=2, message="tamanho deve estar entre 2 e 2")
	@Column (columnDefinition="CHAR(2)", nullable=false)
	private String estado;
	
	@NotBlank(message = "A cidade não pode ser nula")
	@Pattern(regexp = "[A-zÀ-ú ]*")
	@Size(max=100, message="O tamanho não deve ultrapassar 100 caracteres")
	@Column(columnDefinition="VARCHAR(100)", length=100, nullable=false)
	private String cidade;

	public Cidade() {
		
	}
	
	public Cidade(Long id, String estado, String cidade) {
		super();
		this.id = id;
		this.estado = estado;
		this.cidade = cidade;
	}

	public Long getVersion() {
		return version;
	}
	
	public void setVersion(Long version) {
		this.version = version;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
