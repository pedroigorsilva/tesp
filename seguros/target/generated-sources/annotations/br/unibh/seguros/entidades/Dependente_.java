package br.unibh.seguros.entidades;

import java.math.BigDecimal;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Dependente.class)
public abstract class Dependente_ extends br.unibh.seguros.entidades.PessoaFisica_ {

	public static volatile SingularAttribute<Dependente, Character> dependenteIR;
	public static volatile SingularAttribute<Dependente, Proponente> proponente;
	public static volatile SingularAttribute<Dependente, BigDecimal> percentualBeneficio;
	public static volatile SingularAttribute<Dependente, String> grauParentesco;

}

