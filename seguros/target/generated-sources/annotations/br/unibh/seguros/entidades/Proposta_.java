package br.unibh.seguros.entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Proposta.class)
public abstract class Proposta_ {

	public static volatile SingularAttribute<Proposta, String> classe;
	public static volatile SingularAttribute<Proposta, Proponente> proponente;
	public static volatile SingularAttribute<Proposta, Date> data;
	public static volatile SingularAttribute<Proposta, String> conta;
	public static volatile SingularAttribute<Proposta, BigDecimal> valorPremio;
	public static volatile SingularAttribute<Proposta, Long> version;
	public static volatile SingularAttribute<Proposta, String> agencia;
	public static volatile CollectionAttribute<Proposta, Tramitacao> tramitacoes;
	public static volatile SingularAttribute<Proposta, String> tipoSegurado;
	public static volatile SingularAttribute<Proposta, Long> id;
	public static volatile SingularAttribute<Proposta, String> situacaoAtual;
	public static volatile SingularAttribute<Proposta, Integer> diaPagamento;
	public static volatile SingularAttribute<Proposta, String> bancoPagamento;
	public static volatile SingularAttribute<Proposta, Date> dataTerminoVigencia;
	public static volatile SingularAttribute<Proposta, Date> dataInicioVigencia;
	public static volatile SingularAttribute<Proposta, Questionario> questionario;
	public static volatile SingularAttribute<Proposta, BigDecimal> valorSegurado;
	public static volatile SingularAttribute<Proposta, Integer> carenciaEmMeses;

}

