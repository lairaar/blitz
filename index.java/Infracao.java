/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blitz;

/**
 *
 * @author 20171TIIMI0173
 */
public class Infracao {
    private String cod;
    private Data dataInfr;
    private Veiculo veiculo;
    private Motorista condutor;
    private Natureza natureza;

    public Infracao(String cod, Data dataInfr, Veiculo veiculo, Motorista condutor, Natureza natureza) {
        this.cod = cod;
        this.dataInfr = dataInfr;
        this.veiculo = veiculo;
        this.condutor = null;
        this.natureza = natureza;
    }

 
    public String getCod(){
        return cod;
    }
    
    public void setCod(String cod){
        this.cod = cod;
    }
    
    public Data getdataInfr(){
        return dataInfr;
    }
    
    public void setdataInfr(Data dataInfr){
        this.dataInfr = dataInfr;
    }
    
    public Veiculo getVeiculo(){
        return veiculo;
    }
    
    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }
    
    public Motorista getCondutor(){
        return condutor;
    }
    
    public void setCondutor(Motorista condutor){
        this.condutor = condutor;
    }
    
    public Natureza getNatureza(){
        return natureza;
    }
    
    public void setNatureza(Natureza natureza){
        this.natureza = natureza;
    }
}
