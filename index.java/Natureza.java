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
public class Natureza {
    private String tpInfr;
    private int pontuacao;

    public Natureza(String tpInfr, int pontuacao) {
        this.tpInfr = tpInfr;
        this.pontuacao = pontuacao;
    }
    
    public String getTpInfr(){
        return tpInfr;
    }
    
    public void setTpInfr(String tpInfr){
        this.tpInfr = tpInfr;
    }
    
    public int getPontuacao(){
        return pontuacao;
    }
    
    public void setPontuacao(int pontuacao){
        this.pontuacao = pontuacao;
    }
}
