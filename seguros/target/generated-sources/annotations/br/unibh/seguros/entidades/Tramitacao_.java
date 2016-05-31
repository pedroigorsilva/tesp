package br.unibh.seguros.entidades;

import java.io.File;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Tramitacao.class)
public abstract class Tramitacao_ {

	public static volatile SingularAttribute<Tramitacao, String> situacaoFinal;
	public static volatile SingularAttribute<Tramitacao, Setor> setorResponsavel;
	public static volatile SingularAttribute<Tramitacao, Usuario> usuarioDecisao;
	public static volatile SingularAttribute<Tramitacao, Proposta> proposta;
	public static volatile SingularAttribute<Tramitacao, String> situacaoInicial;
	public static volatile SingularAttribute<Tramitacao, File> documento;
	public static volatile SingularAttribute<Tramitacao, Long> id;
	public static volatile SingularAttribute<Tramitacao, String> etapaProcesso;
	public static volatile SingularAttribute<Tramitacao, String> comentario;
	public static volatile SingularAttribute<Tramitacao, Long> version;
	public static volatile SingularAttribute<Tramitacao, Date> dataHora;
	public static volatile SingularAttribute<Tramitacao, String> tipoDecisao;

}

