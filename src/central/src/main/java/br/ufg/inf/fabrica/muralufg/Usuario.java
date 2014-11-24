package br.ufg.inf.fabrica.muralufg;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Eurismar on 23/11/2014.
 */
@Entity
public class Usuario {
    @Id
    @GeneratedValue
    private long id;
    private String login;
    private String senha;
    private boolean apenasProdutor;
    private boolean administrador;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isApenasProdutor() {
        return apenasProdutor;
    }

    public void setApenasProdutor(boolean apenasProdutor) {
        this.apenasProdutor = apenasProdutor;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
}
