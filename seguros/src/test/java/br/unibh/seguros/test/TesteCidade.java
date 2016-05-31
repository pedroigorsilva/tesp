package br.unibh.seguros.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import br.unibh.seguros.entidades.Cidade;
import br.unibh.seguros.util.Resources;

@RunWith(Arquillian.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TesteCidade {
	@Deployment
	public static Archive<?> createTestArchive() {
		return ShrinkWrap.create(WebArchive.class, "test3.war")
			.addClasses(Resources.class, Cidade.class)
			.addAsResource("META-INF/persistence.xml", "META-INF/persistence.xml")
			.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
	}
	
	@Inject
	private Logger log;
	@Inject
	private EntityManager em;
	@Inject
	protected UserTransaction utx;
	@Before
	public void preparePersistenceTest() throws Exception {
		utx.begin();
		em.joinTransaction();
	}
	
	@After
	public void commitTransaction() throws Exception {
		try { utx.commit(); } catch (Exception e){}
	}
	
	@Test
	public void teste01_inserirSemErro() throws Exception {
		log.info("============> Executando " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Cidade c = new Cidade();
		c.setEstado("MG");
		c.setCidade("Belo Horizonte");
		em.persist(c);
		Cidade aux = (Cidade) em.createQuery("select c from Cidade c where c.estado = :estado AND c.cidade = :cidade")
				.setParameter("estado", "MG").setParameter("cidade", "Belo Horizonte").getSingleResult();
		assertNotNull(aux);
	}
	
	@Test
	public void teste02_inserirComErroValidation1() throws Exception {
		log.info("============> Executando " + Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			Cidade c = new Cidade();
			c.setEstado("18");
			em.persist(c);
		} catch (Exception e){
			assertTrue(checkString(e, "Favor fornecer apenas letras maiusculas"));
		}
	}
	
	@Test
	public void teste03_inserirComErroValidation2() throws Exception {
		log.info("============> Executando " + Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			Cidade c = new Cidade();
			c.setEstado("Ass");
			em.persist(c);
		} catch (Exception e){
			assertTrue(checkString(e, "tamanho deve estar entre 2 e 2"));
		}
	}
	
	@Test
	public void teste04_inserirComErroValidation3() throws Exception {
		log.info("============> Executando " + Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			Cidade c = new Cidade();
			c.setEstado("A");
			em.persist(c);
		} catch (Exception e){
			assertTrue(checkString(e, "tamanho deve estar entre 2 e 2"));
		}
	}
	
	@Test
	public void teste05_inserirComErroValidation4() throws Exception {
		log.info("============> Executando " + Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			Cidade c = new Cidade();
			c.setEstado("As");
			em.persist(c);
		} catch (Exception e){
			assertTrue(checkString(e, "Favor fornecer apenas letras maiusculas"));
		}
	}
	
	@Test
	public void teste06_inserirComErroValidation5() throws Exception {
		log.info("============> Executando " + Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			Cidade c = new Cidade();
			c.setCidade("DikehvnsheDikehvnsheDikehvnsheDikehvnsheDikehvnsheDikehvnsheDikehvnsheDikehvnsheDikehvnsheDikehvnsheDikehvnsheDikehvnshe");
			em.persist(c);
		} catch (Exception e){
			assertTrue(checkString(e, "O tamanho não deve ultrapassar 100 caracteres"));
		}
	}
	
	@Test
	public void teste07_inserirComErroValidation6() throws Exception {
		log.info("============> Executando " + Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			Cidade c = new Cidade();
			c.setEstado("  ");
			em.persist(c);
		} catch (Exception e){
			assertTrue(checkString(e, "O estado não pode ser vazio"));
		}
	}
	
	@Test
	public void teste08_inserirComErroValidation7() throws Exception {
		log.info("============> Executando " + Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			Cidade c = new Cidade();
			c.setCidade("  ");
			em.persist(c);
		} catch (Exception e){
			assertTrue(checkString(e, "A cidade não pode ser nula"));
		}
	}
	
	@Test
	public void teste05_atualizar() throws Exception {
		log.info("============> Executando " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Cidade c = (Cidade) em.createQuery("select c from Cidade c where c.estado = :estado AND c.cidade = :cidade")
				.setParameter("estado", "MG").setParameter("cidade", "Belo Horizonte").getSingleResult();
		c.setCidade("Rio de Janeiro");
		c.setEstado("RJ");
		em.flush();
		Cidade aux = (Cidade) em.createQuery("select c from Cidade c where c.estado = :estado AND c.cidade = :cidade")
				.setParameter("estado", "RJ").setParameter("cidade", "Rio de Janeiro").getSingleResult();
		assertNotNull(aux);
	}
	
	@Test
	public void teste06_excluir() throws Exception {
		log.info("============> Executando " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Cidade c = (Cidade) em.createQuery("select c from Cidade c where c.estado = :estado AND c.cidade = :cidade")
				.setParameter("estado", "RJ").setParameter("cidade", "Rio de Janeiro").getSingleResult();
		em.remove(c);
		em.flush();
		assertEquals(em.createQuery("select c from Cidade c where c.estado = :estado AND c.cidade = :cidade")
				.setParameter("estado", "RJ").setParameter("cidade", "Rio de Janeiro").getResultList().size(), 0);
	}
	
	private boolean checkString(Throwable e, String str){
		if (e.getMessage().contains(str)){
			return true;
		} else if (e.getCause() != null){
			return checkString(e.getCause(), str);
		}
		return false;
	}
}
