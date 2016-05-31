package br.unibh.seguros.entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Seguro.class)
public abstract class Seguro_ {

	public static volatile SingularAttribute<Seguro, String> classe;
	public static volatile SingularAttribute<Seguro, Proponente> proponente;
	public static volatile SingularAttribute<Seguro, Proposta> proposta;
	public static volatile SingularAttribute<Seguro, String> conta;
	public static volatile SingularAttribute<Seguro, BigDecimal> valorPremio;
	public static volatile SingularAttribute<Seguro, Long> version;
	public static volatile SingularAttribute<Seguro, String> agencia;
	public static volatile SingularAttribute<Seguro, String> codigoSusep;
	public static volatile SingularAttribute<Seguro, String> tipoSegurado;
	public static volatile SingularAttribute<Seguro, Long> id;
	public static volatile SingularAttribute<Seguro, String> situacaoAtual;
	public static volatile SingularAttribute<Seguro, Integer> diaPagamento;
	public static volatile SingularAttribute<Seguro, String> bancoPagamento;
	public static volatile SingularAttribute<Seguro, Date> dataTerminoVigencia;
	public static volatile SingularAttribute<Seguro, Date> dataInicioVigencia;
	public static volatile SingularAttribute<Seguro, BigDecimal> valorSegurado;
	public static volatile SingularAttribute<Seguro, Integer> carenciaEmMeses;

}

