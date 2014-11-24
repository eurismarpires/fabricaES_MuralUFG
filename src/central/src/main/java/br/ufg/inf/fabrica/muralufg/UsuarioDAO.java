package java.br.ufg.inf.fabrica.muralufg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;
import java.util.Collection;

/**
 * Created by Eurismar on 23/11/2014.
 */
public class UsuarioDAO {

    private EntityManager getEntityManager(){
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

    public boolean validarUsuario(Usuario usuario){
        return false;
    }
    public Collection obterUsuarioGrupo(GrupoDestinatario grupoDestinatario){
        return null;
    }
    public boolean bloquearUsuario(Usuario usuario, String operacao){
        return false;
    }
}
