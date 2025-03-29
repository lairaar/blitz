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
public class Veiculo {
     private String placa;
    private Motorista propietario;
    private String modelo;
    private String cor;

    public Veiculo(String placa, Motorista propietario, String modelo, String cor) {
        this.placa = placa;
        this.propietario = propietario;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Motorista getProprietario() {
        return propietario;
    }

    public void setPropietario(Motorista propietario) {
        this.propietario = propietario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
