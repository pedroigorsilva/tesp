package br.unibh.seguros.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.Past;

@Entity
@Table(name="tb_questionario")
public class Questionario implements Serializable{
	
	private static final long serialVersionUID = 1L;
			
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataUltimaConsultaMedica == null) ? 0 : dataUltimaConsultaMedica.hashCode());
		result = prime * result + ((dataUltimaInternacao == null) ? 0 : dataUltimaInternacao.hashCode());
		result = prime * result + ((executaAtividadeDeRisco == null) ? 0 : executaAtividadeDeRisco.hashCode());
		result = prime * result + ((historicoCancerFamilia == null) ? 0 : historicoCancerFamilia.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((portadorMolestiaGrave == null) ? 0 : portadorMolestiaGrave.hashCode());
		result = prime * result
				+ ((portadorNecessidadesEspeciais == null) ? 0 : portadorNecessidadesEspeciais.hashCode());
		result = prime * result + ((possuiDoencaContagiosa == null) ? 0 : possuiDoencaContagiosa.hashCode());
		result = prime * result + ((possuiPlanoSaudeParticular == null) ? 0 : possuiPlanoSaudeParticular.hashCode());
		result = prime * result + ((praticaEsportes == null) ? 0 : praticaEsportes.hashCode());
		result = prime * result
				+ ((seEnvolveuEmAcidenteUltimoAno == null) ? 0 : seEnvolveuEmAcidenteUltimoAno.hashCode());
		result = prime * result + ((utilizaRemedioControlado == null) ? 0 : utilizaRemedioControlado.hashCode());
		return result;
	}

	@Version
	@Column(columnDefinition="bigint NOT NULL DEFAULT 0")
	private Long version;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="portador_necessidades_especiais", nullable=false)
	private Character portadorNecessidadesEspeciais;
	
	@Column(name="portador_molestia_grave", nullable=false)
	private Character portadorMolestiaGrave;
	
	@Column(name="utiliza_remedio_controlado", nullable=false)
	private Character utilizaRemedioControlado;
	
	@Past
	@Column(name="data_ultima_internacao")
	@Temporal(TemporalType.DATE)
	private Date dataUltimaInternacao;
	
	@Past
	@Column(name="data_ultima_consulta_medica")
	@Temporal(TemporalType.DATE)
	private Date dataUltimaConsultaMedica;
	
	@Column(name="possui_plano_saude_particular", nullable=false)
	private Character possuiPlanoSaudeParticular;
	
	@Column(name="pratica_esportes", nullable=false)
	private Character praticaEsportes;

	@Column(name="executa_atividade_de_risco", nullable=false)
	private Character executaAtividadeDeRisco;

	@Column(name="se_envolveu_em_acidente_ultimo_ano", nullable=false)
	private Character seEnvolveuEmAcidenteUltimoAno;

	@Column(name="historico_cancer_familia", nullable=false)
	private Character historicoCancerFamilia;

	@Column(name="possui_doenca_contagiosa", nullable=false)
	private Character possuiDoencaContagiosa;
	
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
	public Date getDataUltimaInternacao() {
		return dataUltimaInternacao;
	}
	public void setDataUltimaInternacao(Date dataUltimaInternacao) {
		this.dataUltimaInternacao = dataUltimaInternacao;
	}
	public Date getDataUltimaConsultaMedica() {
		return dataUltimaConsultaMedica;
	}
	public void setDataUltimaConsultaMedica(Date dataUltimaConsultaMedica) {
		this.dataUltimaConsultaMedica = dataUltimaConsultaMedica;
	}
}
