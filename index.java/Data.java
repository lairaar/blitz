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
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    Data() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String printData(){
        return dia + "/" + mes + "/" + ano;
    }
    
    public boolean Ano(Data d){
        if(d.ano == ano + 1){
            if(mes > d.mes){
                return true;
            } else if (mes == d.mes) {
                if(dia >= d.dia){
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else if (d.ano == ano){
            if(d.mes > mes){
                return true;
            } else if (mes == d.mes){
                if(dia <= d.dia){
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
}
