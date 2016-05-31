package br.unibh.seguros.entidades;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Cidade.class)
public abstract class Cidade_ {

	public static volatile SingularAttribute<Cidade, String> estado;
	public static volatile SingularAttribute<Cidade, String> cidade;
	public static volatile SingularAttribute<Cidade, Long> id;
	public static volatile SingularAttribute<Cidade, Long> version;

}

