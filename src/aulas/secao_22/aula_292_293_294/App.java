package aulas.secao_22.aula_292_293_294;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {

		/*
		 * Pessoa p1 = new Pessoa(null, "Maria da Silva", "maria@gmail.com"); Pessoa p2
		 * = new Pessoa(null, "Joao dos Santos", "joao@outlook.com"); Pessoa p3 = new
		 * Pessoa(null, "Alex Telles", "alex@gmail.com");
		 */
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/*
		 * em.getTransaction().begin(); em.persist(p1); em.persist(p2); em.persist(p3);
		 * em.getTransaction().commit();
		 */
		
		Pessoa p = em.find(Pessoa.class, 2);
		//System.out.println(p);
		
		em.getTransaction().begin();
			em.remove(p);
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
	}

}
