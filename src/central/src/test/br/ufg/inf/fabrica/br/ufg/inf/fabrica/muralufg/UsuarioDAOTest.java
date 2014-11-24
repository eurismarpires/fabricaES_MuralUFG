package br.ufg.inf.fabrica.br.ufg.inf.fabrica.muralufg;

import org.junit.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.ufg.inf.fabrica.muralufg.Usuario;

import static org.junit.Assert.assertEquals;


/**
 * Created by Eurismar on 24/11/2014.
 */
public class UsuarioDAOTest {
    private EntityManager em;
    @BeforeClass
    public static void setUpClass(){
        EntityManager em = getEntityManager();

    }
    @AfterClass
    public static void tearDownClass(){

    }
    @Before
    public void setUp(){

    }
    @After
    public void tearDown(){

    }

    @Test
    public void testUsuarioDAO(){
        em.getTransaction().begin();
        Usuario usuarioPersistido = new Usuario();
        em.persist(usuarioPersistido);
        Usuario usuarioRetornado = em.find(Usuario.class,usuarioPersistido);
        assertEquals(usuarioPersistido,usuarioRetornado);

    }
    private static EntityManager getEntityManager(){
        EntityManagerFactory factory = null;
        EntityManager entityManager = null;
        try {
            factory = Persistence.createEntityManagerFactory("br.ufg.inf.fabrica.muralufg_central_jar_1.0-SNAPSHOTPU");
            entityManager = factory.createEntityManager();
        }finally {
            factory.close();
        }
        return entityManager;
    }
}
