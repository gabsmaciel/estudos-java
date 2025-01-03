package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario1 {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);

        ///modificações

        usuario.setNome("Leo");
        usuario.setEmail("leo@lanche.com.br");

        /// o metodo merge é responsável para pegar objeto que já está no banco e alterar

        em.merge(usuario);


        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
