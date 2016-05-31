package br.unibh.seguros.entidades;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="tb_dependente")@PrimaryKeyJoinColumn
public class Dependente extends PessoaFisica implements Serializable{
	
	private static final long serialVersionUID = 1L;
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dependenteIR == null) ? 0 : dependenteIR.hashCode());
		result = prime * result + ((grauParentesco == null) ? 0 : grauParentesco.hashCode());
		result = prime * result + ((percentualBeneficio == null) ? 0 : percentualBeneficio.hashCode());
		return result;
	}
	
	@NotBlank
	@Pattern(regexp = "[A-zÀ-ú ]*")
	@Size(max=30)
	@Column (name="grau_parentesco",length=30, nullable=false)
	private String grauParentesco;
	
	@NotNull
	@DecimalMin("0.0")
	@DecimalMax("100.0")
	@Column (name="percentual_beneficio",columnDefinition="DECIMAL(30)", nullable=false)
	private BigDecimal percentualBeneficio;
	
	@Column (name="dependente_ir", columnDefinition="CHAR(1)", nullable=false)
	private Character dependenteIR;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Proponente proponente;
	
	public String getGrauParentesco() {
		return grauParentesco;
	}
	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}
	public BigDecimal getPercentualBeneficio() {
		return percentualBeneficio;
	}
	public void setPercentualBeneficio(BigDecimal percentualBeneficio) {
		this.percentualBeneficio = percentualBeneficio;
	}
	public Proponente getProponente() {
		return proponente;
	}
	public void setProponente(Proponente proponente) {
		this.proponente = proponente;
	}
}
