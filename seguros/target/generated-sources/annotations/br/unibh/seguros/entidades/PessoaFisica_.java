package br.unibh.seguros.entidades;

import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(PessoaFisica.class)
public abstract class PessoaFisica_ {

	public static volatile SingularAttribute<PessoaFisica, String> telefoneResidencial;
	public static volatile SingularAttribute<PessoaFisica, Integer> idade;
	public static volatile SingularAttribute<PessoaFisica, String> telefoneComercial;
	public static volatile SingularAttribute<PessoaFisica, String> cpf;
	public static volatile SingularAttribute<PessoaFisica, String> nome;
	public static volatile SingularAttribute<PessoaFisica, Long> id;
	public static volatile SingularAttribute<PessoaFisica, String> telefoneCelular;
	public static volatile SingularAttribute<PessoaFisica, Date> dataNascimento;
	public static volatile SingularAttribute<PessoaFisica, Long> version;
	public static volatile SingularAttribute<PessoaFisica, String> email;

}

