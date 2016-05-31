package br.unibh.seguros.entidades;

import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Questionario.class)
public abstract class Questionario_ {

	public static volatile SingularAttribute<Questionario, Date> dataUltimaConsultaMedica;
	public static volatile SingularAttribute<Questionario, Character> portadorNecessidadesEspeciais;
	public static volatile SingularAttribute<Questionario, Character> portadorMolestiaGrave;
	public static volatile SingularAttribute<Questionario, Date> dataUltimaInternacao;
	public static volatile SingularAttribute<Questionario, Long> version;
	public static volatile SingularAttribute<Questionario, Character> seEnvolveuEmAcidenteUltimoAno;
	public static volatile SingularAttribute<Questionario, Character> historicoCancerFamilia;
	public static volatile SingularAttribute<Questionario, Character> utilizaRemedioControlado;
	public static volatile SingularAttribute<Questionario, Character> executaAtividadeDeRisco;
	public static volatile SingularAttribute<Questionario, Character> possuiPlanoSaudeParticular;
	public static volatile SingularAttribute<Questionario, Character> praticaEsportes;
	public static volatile SingularAttribute<Questionario, Long> id;
	public static volatile SingularAttribute<Questionario, Character> possuiDoencaContagiosa;

}

