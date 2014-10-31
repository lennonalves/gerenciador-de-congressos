/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AbstractFactory;

/**
 *
 * @author lennon
 */
public class ToyotaFabricante extends Fabricante {

    @Override
    public Motor criaMotor() {
        return new ToyotaMotor();
    }

    @Override
    public Chassi criaChassi() {
        return new ToyotaChassi();
    }

    @Override
    public Eixo criaEixo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
