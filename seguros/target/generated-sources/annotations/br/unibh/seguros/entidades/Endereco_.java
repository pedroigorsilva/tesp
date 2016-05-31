package br.unibh.seguros.entidades;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Endereco.class)
public abstract class Endereco_ {

	public static volatile SingularAttribute<Endereco, String> tipo;
	public static volatile SingularAttribute<Endereco, String> cidade;
	public static volatile SingularAttribute<Endereco, String> estado;
	public static volatile SingularAttribute<Endereco, Proponente> proponente;
	public static volatile SingularAttribute<Endereco, String> complemento;
	public static volatile SingularAttribute<Endereco, String> numero;
	public static volatile SingularAttribute<Endereco, String> logradouro;
	public static volatile SingularAttribute<Endereco, Long> id;
	public static volatile SingularAttribute<Endereco, String> tipoLogradouro;
	public static volatile SingularAttribute<Endereco, Long> version;
	public static volatile SingularAttribute<Endereco, String> cep;

}

