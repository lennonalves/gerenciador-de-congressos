/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import TELAS.TelaLogin;

/**
 *
 * @author victorambiel
 */
public class ProxyLogin extends TelaLogin {
    
    private String usuario, senha;
    
//    public static TelaLoginProxy instancia;
//
//    protected TelaLoginProxy(){}
    
    public ProxyLogin(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
//    public static TelaLoginProxy getInstancia() {
//        if (instancia == null)
//            instancia = new TelaLoginProxy();
//        return instancia;
//    }
    
    

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
