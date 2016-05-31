package br.unibh.seguros.entidades;

import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Setor.class)
public abstract class Setor_ {

	public static volatile CollectionAttribute<Setor, Usuario> mebros;
	public static volatile SingularAttribute<Setor, Setor> setorSuperior;
	public static volatile CollectionAttribute<Setor, Setor> setoresInferiores;
	public static volatile SingularAttribute<Setor, String> nome;
	public static volatile SingularAttribute<Setor, Long> id;
	public static volatile SingularAttribute<Setor, Long> version;

}

