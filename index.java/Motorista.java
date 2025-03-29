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
public class Motorista {
    private String nCNH;
    private String nome;
    private Data venCNH;

    public Motorista(String nCNH, String nome, Data venCNH) {
        this.nCNH = nCNH;
        this.nome = nome;
        this.venCNH = venCNH;
    }

    public String getnCNH() {
        return nCNH;
    }
    
    public void setnCNH(String nCNH) {
        this.nCNH = nCNH;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getVenCNH() {
        return venCNH;
    }

    public void setVenCNH(Data venCNH) {
        this.venCNH = venCNH;
    }
}
