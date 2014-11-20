/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emprestimos.RN;

import Emprestimos.Pers.LoginPers;
import Emprestimos.VO.LoginVO;

/**
 *
 * @author lennonalves
 */
public class LoginRN {
    
    public static LoginRN instancia;
    
    protected LoginRN(){}
    
    public static LoginRN getInstancia() {
        if (instancia == null)
            instancia = new LoginRN();
        return instancia;
    }
    
    private String mensagem = null;
    
    public String autenticaLogin(LoginVO lvo) {
        if (camposVazios(lvo) == true) {
            mensagem = "ERRO: Favor preencher os campos corretamente.";
        }
        else {
            if (temPermissao(lvo) == true)
                mensagem = "Login realizado com sucesso!";
            else
                mensagem = "ERRO: Não encontramos um usuário/senha correspondente, tente novamente.";
        }
        return mensagem;
    }
    
    public boolean camposVazios(LoginVO lvo) {
        return lvo.getUser().trim().equals("") || lvo.getUser().trim().equals("") || lvo.getSenha() == null || lvo.getSenha() == null;
    }
    
    public boolean temPermissao(LoginVO lvo) {
        LoginPers lpers = LoginPers.getInstancia();
        return lpers.fazerLogin(lvo);
    }
}
