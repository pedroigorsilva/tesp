package br.unibh.seguros.entidades;

import java.util.Date;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Proponente.class)
public abstract class Proponente_ extends br.unibh.seguros.entidades.PessoaFisica_ {

	public static volatile SingularAttribute<Proponente, String> situacaoCadastro;
	public static volatile CollectionAttribute<Proponente, Vinculo> vinculos;
	public static volatile CollectionAttribute<Proponente, Endereco> enderecos;
	public static volatile CollectionAttribute<Proponente, Dependente> dependentes;
	public static volatile CollectionAttribute<Proponente, Proposta> proposta;
	public static volatile SingularAttribute<Proponente, String> matricula;
	public static volatile SingularAttribute<Proponente, Date> dataCadastro;
	public static volatile SingularAttribute<Proponente, String> status;

}

