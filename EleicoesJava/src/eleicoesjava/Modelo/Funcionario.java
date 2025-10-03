/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eleicoesjava.Modelo;

import java.util.Date;

public class Funcionario extends Eleitor {

    private String codigoFuncionario, tipoFuncionario;
    private int celular;

    public Funcionario(String codigoFuncionario, String tipoFuncionario, int celular, String codigo, boolean votou, int id, String nome, String BI, String genero, String provincia, String Distrito, Date dataNasc) {
        super(codigo, votou, id, nome, BI, genero, provincia, Distrito, dataNasc);
        this.codigoFuncionario = codigoFuncionario;
        this.tipoFuncionario = tipoFuncionario;
        this.celular = celular;
    }

    public Funcionario() {
        super();

    }

    public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

}
