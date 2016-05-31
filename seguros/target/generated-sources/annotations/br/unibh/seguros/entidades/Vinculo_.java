package br.unibh.seguros.entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Vinculo.class)
public abstract class Vinculo_ {

	public static volatile SingularAttribute<Vinculo, Proponente> proponente;
	public static volatile SingularAttribute<Vinculo, String> pessoaReferencia;
	public static volatile SingularAttribute<Vinculo, String> emailReferencia;
	public static volatile SingularAttribute<Vinculo, BigDecimal> salario;
	public static volatile SingularAttribute<Vinculo, String> tipoVinculo;
	public static volatile SingularAttribute<Vinculo, String> telefoneReferencia;
	public static volatile SingularAttribute<Vinculo, Long> id;
	public static volatile SingularAttribute<Vinculo, String> empresa;
	public static volatile SingularAttribute<Vinculo, Date> dataAte;
	public static volatile SingularAttribute<Vinculo, String> cargo;
	public static volatile SingularAttribute<Vinculo, Long> version;
	public static volatile SingularAttribute<Vinculo, Date> dataDesde;

}

