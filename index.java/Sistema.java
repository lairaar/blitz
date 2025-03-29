/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blitz;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author 20171TIIMI0173
 */
public class Sistema {
    private ArrayList<Motorista> motoristas;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Infracao> infracoes;
    private ArrayList<Natureza> naturezas;

    public Sistema() {
        motoristas =  new ArrayList();
        veiculos =  new ArrayList();
        infracoes =  new ArrayList();
        naturezas =  new ArrayList();
        
            Natureza leve = new Natureza("Leve",3);
            naturezas.add(leve);
            Natureza media = new Natureza("Média",4);
            naturezas.add(media);
            Natureza grave = new Natureza("Grave",5);
            naturezas.add(grave);
            Natureza gravissima = new Natureza("Gravíssima",7);
            naturezas.add(gravissima);
    }

    public ArrayList<Motorista> getMotoristas() {
        return motoristas;
    }

    public void setMotoristas(ArrayList<Motorista> motoristas) {
        this.motoristas = motoristas;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
    public ArrayList<Infracao> getInfracoes() {
        return infracoes;
    }

    public void setInfracoes(ArrayList<Infracao> infracoes) {
        this.infracoes = infracoes;
    }

    public ArrayList<Natureza> getNaturezas() {
        return naturezas;
    }

    public void setNaturezas(ArrayList<Natureza> naturezas) {
        this.naturezas = naturezas;
    }
   
    public void incluirVeiculos(Veiculo i){
        this.veiculos.add(i);
    }
  
    public void incluirMotoristas(Motorista m) {   
        this.motoristas.add(m);
    }
}
    

